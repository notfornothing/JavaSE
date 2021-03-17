# 编码转换流

---

* new InputStreamReader(InputStream , 编码格式  CharsetDecoder)



* new OutputStreamWriter(OutputStream, 编码格式  CharsetDecoder)

> 用这个的时候,不关流 就要记得flush().记得加flush刷到文件中去.因为这是字符流读取到内存.而不是到文件. 最后close方法会自动到文件里去.



# 缓冲流

* 字符流:

  * BufferedReader
  * BufferedWriter

* 字节流:

  * BufferedInputStream

  * BufferedOutputStream

    > 里面有独特的方法,newLine()
    >
    > 你也可以"\r\n"

































