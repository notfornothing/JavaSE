# 网络编程

---



# 老师的笔记总结

---

```
一,复习
	--1，反射
		通常是底层框架离不开的技术。
		本质是，获取.class文件里的所有数据，进行解析
		常见功能:newInstance()/invoke()/set()/get()
		常用方法：
			getField()
			getFields()
			getDeclaredFields()--暴力反射，暴力获取私有数据
			getMethod()
			getMethods()
			getDeclaredMethods()--暴力反射，暴力获取私有数据
			getConstructor()
			getConstructors()
			getDeclaredConstructors()--暴力反射，暴力获取私有数据
	--2，内部类			
		底层离不开的技术
		匿名内部类：位置是在方法里+优化程序设计结构
		new Inter(){
			//重写抽象方法,必须的!!
			//普通方法必须重写吗？-- 要改才发生
		};
	--3，抽象类和接口的区别
		--语法	
			-abstract关键字描述抽象类，interface描述接口
			-抽象类的子类和抽象类之间是继承关系，而且只能单根继承
			-实现类和接口的关系叫实现关系，还可以多实现
			-接口灵活，多继承多实现还能继承的同时多实现
		--用法
			-abstract class A{}
			-class X extends A{}
				-X需要重写A里的 所有的 抽象方法，否则就是一个抽象类
			-interface B{}
			-class Y implements B {}
				-Y需要重写B里的 所有抽象方法，否则就是一个抽象类	
二,socket
	--服务器
		package cn.tedu.net;

		import java.io.IOException;
		import java.io.InputStream;
		import java.io.OutputStream;
		import java.net.ServerSocket;
		import java.net.Socket;
		import java.util.Scanner;

		//代表Socket的服务器端--利用ServerSocket
		//负责: 
		//1, 读取 客户端发来的数据--in--InputStream
		//2, 给 客户端 写出 数据--out--OutputStream
		public class Server {
			public static void main(String[] args) 
											throws IOException {
				//1,创建对象 ServerSocket
				//触发含参构造 -- 参数是端口号:0~65535
				ServerSocket server = new ServerSocket(8888);
				System.out.println("服务器已开启...");
				
				//2,接受客户端发来的 连接请求,并建立连接的通道
				Socket socket = server.accept();
				System.out.println("服务器接收到了一个连接请求...");
				
				//3,读取 客户端发来的数据
				InputStream in = socket.getInputStream();
				//发来几个读几次
				for (int i = 0; i < 5; i++) {
					//read()默认读到了整数
					int data = in.read();
					//把int->char
					char c  = (char) data;
					System.out.println(c);
				}
				
				//4,给 客户端写出数据 -out
				OutputStream out = socket.getOutputStream();
				//问题:字节流不能写出字符串"hello"
				//String -> byte[ ] -->>> getBytes()
				String input = new Scanner(System.in).nextLine();
				out.write(input.getBytes());
				out.close();//flush + close
		//		out.flush();//只管刷新数据
			}
		}

	--客户端
		package cn.tedu.net;

		import java.io.IOException;
		import java.io.InputStream;
		import java.io.OutputStream;
		import java.net.Socket;
		import java.net.UnknownHostException;
		import java.util.Scanner;

		//代表Socket的客户端--利用Socket
		//负责: 
		//1, 读取 服务器发来的数据--in--InputStream
		//2, 给 服务器 写出 数据--out--OutputStream
		public class Client {
			public static void main(String[] args) 
											throws Exception{
		//1,创建对象Socket--需要指定服务器的ip地址和端口号
		Socket socket = new Socket("127.0.0.1",8888);//触发含参构造
				System.out.println("与服务器连接成功...");
				//2,给服务器 写出hello
				OutputStream out = socket.getOutputStream();
				//问题:字节流不能写出字符串"hello"
				//String -> byte[ ] -->>> getBytes()
				String input = new Scanner(System.in).nextLine();
				out.write(input.getBytes());
		//		out.close();//flush + close
				out.flush();//只管刷新数据
				
				//3,读取 服务器发来的数据
				InputStream in = socket.getInputStream();
				//发来几个读几次
				for (int i = 0; i < 5; i++) {
					//read()默认读到了整数
					int data = in.read();
					//把int->char
					char c  = (char) data;
					System.out.println(c);
				}
			}
		}

三,读一行写一行
	--1,概述
		专门解决按行读写的需求
	--2,工具类
		BufferedReader
			-构造方法:BufferedReader(Reader in) 
			-常用方法:String readLine()读一行
		PrintWriter
			-构造方法:PrintWriter(String fileName) 
			-常用方法:void println(String x) 写一行
	--3,测试
		package cn.tedu.net;

		import java.io.BufferedReader;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.IOException;
		import java.io.PrintWriter;

		//测试 按行读写的工具类
		public class TestIO {
			public static void main(String[] args) throws IOException {
		//		method();//读一行
		//		method2();//写一行
				method3();//边读边写
			}
			//边读边写
			private static void method3() throws IOException {
				//1,创建对象
				BufferedReader in = new BufferedReader(
													new FileReader("D:\\iotest\\1.txt"));
				PrintWriter out = new PrintWriter("D:\\iotest\\2.txt");
				
				//2,边读边写
				String line = "";//定义变量,记录读到的数据
				while( ( line = in.readLine() ) != null) {//读一行
					out.println(line);//写一行
				}
				//3,关闭资源
				out.close();
				in.close();
			}
			//写一行
			private static void method2() throws IOException {
				//1,创建对象 -- 并指定 数据要写出到哪里
				PrintWriter out = new PrintWriter("D:\\iotest\\1.txt");
				//2,调用方法写出一行
				out.println("ajfkjalf");
				out.println("1233");
				out.println("asf1234");
				out.println("a234af");
				//把数据从写出流里刷到磁盘里
				out.close();//flush+close
			}
			//读一行
			private static void method() throws IOException {
				//1,创建对象 -- 读取指定位置的文件
				BufferedReader in = new BufferedReader(
															new FileReader("D:\\iotest\\1.txt"));
				//2,调用方法读一行
		//		String data = in.readLine();//读一行
		//		System.out.println(data);
		//		
		//		String data2 = in.readLine();//读一行
		//		System.out.println(data2);
		//		
		//		//TODO 没数据了,readLine()读到了啥???--永远是null
		//		String data3 = in.readLine();//读一行
		//		System.out.println(data3);
		//		System.out.println(in.readLine());
		//		System.out.println(in.readLine());
				
				//定义变量，记录读到的数据
				String data =  "";
				//in.readLine()没数据就回返回null
				while( ( data = in.readLine() ) != null ) {
					System.out.println(data);
				}
			}
		}


四,面试题
	--OOP
		--特征:封装+继承+多态
		--封装的作用是：提高程序的安全性
		--继承的作用是：提高代码的复用性（把共性功能写在父类里，减少了子类的代码）
			--方法重写：子类继承以后，发现业务发生了改				变，在不修改原有的功能的前提下，只能进行				功能扩展，方法重写。
			--this/super/final/static
		--多态的作用是：提高程序的灵活性
			--好处：不关心具体的子类的类型，把子类当父类看，屏蔽了子类的不同，写出通用的灵活的代码
		--1，抽象类和接口的区别
		--2，overload和override的区别
		--3，this和super的区别
		--4，自动装箱和自动拆箱的区别
			 把基本类型 和 包装类型 互转的过程
		--5，进程和线程的区别
		--6，并行和并发的区别
		--7，锁的原理
	--集合
		-Collection集合
			-List集合:有序+有下标+可以重复+null
				-ArrayList:底层是数组，适合查询
				-LinkedList:底层是链表，适合增删
			-Set集合：用来去重，底层是Map
				-HashSet：底层是哈希表（原理）
		-Map集合:无序+都是键值对+键不能重复
			-HashMap:底层是哈希表（原理）
		-1,数组和集合的区别
		-2,iterator()和listIterator()的区别
		-3,ArrayList和LinkedList的区别
		-4,HashMap的原理
	--高级
		--JVM的原理
		--算法：冒泡排序。。。。
		--NIO/BIO/AIO
		--JUC并发包java.util...
		--用Xmind工具总结
```