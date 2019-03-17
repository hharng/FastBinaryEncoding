/*!
    \file generator.inl
    \brief Fast binary encoding generator inline implementation
    \author Ivan Shynkarenka
    \date 20.04.2018
    \copyright MIT License
*/

namespace FBE {

inline Generator::Generator(const std::string& input, const std::string& output, int indent, char space)
    : _input(input),
      _output(output),
      _cursor(0),
      _indent(indent),
      _space(space)
{
}

inline void Generator::Open(const CppCommon::Path& filename)
{
    // Take a write file-lock
    _lock = filename + ".lock";
    _lock.LockWrite();

    _cursor = 0;
    _file = filename;
    _file.OpenOrCreate(false, true, true);
}

inline void Generator::Write(const std::string& str)
{
    _file.Write(str);
}

inline void Generator::WriteIndent()
{
    for (int i = 0; i < _cursor; ++i)
        _file.Write(&_space, 1);
}

inline void Generator::WriteIndent(const std::string& str)
{
    for (int i = 0; i < _cursor; ++i)
        _file.Write(&_space, 1);
    _file.Write(str);
}

inline void Generator::WriteLine()
{
    Write(EndLine());
}

inline void Generator::WriteLine(const std::string& str)
{
    Write(str);
    Write(EndLine());
}

inline void Generator::WriteLineIndent(const std::string& str)
{
    WriteIndent(str);
    Write(EndLine());
}

inline void Generator::Close()
{
    _file.Close();

    // Release the write file-lock
    _lock.UnlockWrite();
    _lock.Reset();
}

inline void Generator::Indent(int count)
{
    _cursor += _indent * count;
}

inline std::string Generator::EndLine()
{
    return CppCommon::Environment::EndLine();
}

} // namespace FBE
