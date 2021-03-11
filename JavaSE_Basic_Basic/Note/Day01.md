

# Java Basic

---

## [Java 开发文档 ]( http://doc.canglaoshi.org/)

## Java的发展方向

* JavaSE --桌面应用软件开发
* JavaMe --开发移动设备软件（嵌入式软件）
* JavaEE  --企业级应用（网页开发）



## Java开发环境

* Java的编译运行过程

  * 编译期：将.Java源文件，经过编译(编译就是Ctrl+S 他会自动编译)，先生成一个.class文件（字节码文件）
  * 运行期：通过jvm加载.class文件编译成可执行文件（0和1）
        --夸平台性，一次编写，到处运行

* 名词解释

  > * **JVM：Java虚拟机**
  >
  >   JVM(Java Virtual Machine)---负责加载.class并运行.class文件
  >
  >   > 作用：加载.class文件，运行.class文件

  > * **JRE：Java的运行环境**
  >
  >   JRE(Java Runtime Environment) --- Java运行时环境 
  >
  >   > 包含了**JVM**，还包含了运行Java程序所必须的环境
  >   >
  >   > > JRE=JVM+Java系统类库（工具，小零件）
  >
  > * **JDK：Java的开发环境 （开发工具包）**
  >
  >   JDK(Java Development Kit) --- Java开发工具包
  >
  >   > 包含JRE还包含了Java开发程序所必须的命令工具
  >   >
  >   > > JDK=JRE+编译和运行等命令工具
  >   
  >   :hamburger:
  >   
  >   * **JDK中包含JRE，在JDK的安装目录下有一个名为jre的目录，里面有两个文件夹bin和lib，在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和 lib和起来就称为jre。‘’
  >   
  >   * **JVM = bin目录**
  >   
  >   * **lib表示JVM工作所需要的类库,也就是：JRE = lib + bin**
  >   
  >   * **JDK = JRE + JAVA的开发工具（javac.exe,java.exe,javadoc.exe）**

  * **总结：**
  * 运行Java程序的最小环境是JRE
    * 开发Java程序的最小环境是JDK

  

  # jdk文件里的jre用来运行编译

  # 一般用外面的jre用来运行java程序

  