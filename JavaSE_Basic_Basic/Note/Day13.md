# IO

---

## 输入流

1.字符输入流: InpustStream 

* ```java
  public abstract class InputStream
  ```

 2.字符输入流: Reader

* ```java
  public abstract class Reader
  ```



## 输出流

1.字节输出流: OutputStream

* ```java
  public abstract class OutputStream
  ```

2.字符输出流: Writer

* ```java
  public abstract class Writer
  ```

# 



# 为什么有字节还要有字符流?

---

因为,用字节流读取文本文件时,可能会有小问题.因为一个中文中文字符可能占用多个字节存储.(GBK 2个字节	UTF-8 3个字节).所以Java提供一些字符流,以字符为单位读写数据,用于处理字符文件.

字节流和字符流最大的区别是:字节流是直接吧数据写在文件中.而字符流是先吧数据写入到缓冲区中,也就是内存中.调用flush 或者 close方法 就会把内存缓冲区的数据刷新到文件中

