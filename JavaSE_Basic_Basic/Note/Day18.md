# 注解

使用时要导包,虽然是lang包下的.但是不是一个东西.要!!!

---



##  JDK自带注解

@Override :用来标识重写方法
还有很多.....

## 元注解

**@Target** 注解用在哪里:类上,方法上,属性上等;

> 源码: **ElementType** 可以有多个,因为是个数组.区别于Retention 
>
> ```java
> public @interface Target {
>     ElementType[] value();
> }
> ```
>
> 描述注解存在的位置：
>
> ElementType.TYPE 应用于类的元素
> ElementType.METHOD 应用于方法级
> ElementType.FIELD 应用于字段或属性(成员变量)
> ElementType.ANNOTATION_TYPE 应用于注释类型
> ElementType.CONSTRUCTOR 应用于构造函数
> ElementType.LOCAL_VARIABLE 应用于局部变量
> ElementType.PACKAGE 应用于包声明
> ElementType.PARAMETER 应用于方法的参数

**@Retention** 注解的生命周期: 源文件中,字节码文件中,运行中

> @Retention RetentionPolicy...
>
> **为何要分字节码文件中有还是没有呢？如果没有时，反射技术就拿不到，从而就无法去识别处理。**
>
> 它的值一共3种:
>
> > ###### SOURCE 在源文件中有效（即源文件保留）
> >
> > ###### CLASS 在class文件中有效（即class保留）
> >
> > ###### RUNTIME 在运行时有效（即运行时保留）
>
> 源码: **RetentionPolicy**只能有一个,区别与Target 源码是一个数组
>
> ```java
> public @interface Retention {
>     RetentionPolicy value();
> }
> ```
>
> 

## 自定义注解

> **当给自定义注解没有定义属性时,可以直接用.**
>
> 但是他里面有定义属性了,就必须给属性赋值,
> **但是** 给属性默认值后,可以不加属性直接用,此时属性的值就是默认值.
>
> ```java
> @Target({ElementType.METHOD})
> @Retention(RetentionPolicy.SOURCE)
> @interface Test {
>  int age() default 0;
> }
> 
> class A{
> 	@Test	
> 	//这里上面定义了 default0 ,就可以不写 @Test(age)或者@Test(age=123)
> 	//如果上面没定义,就要给@Test(age=XXX)	
>     public void eat() {
>         System.out.println("干饭!!!");
>     }
> }
> ```
>

> 给特殊属性**value**赋值的时候可以简写,相当于value="apple",具体如下
>
> ```java
> @Target({ElementType.METHOD})
> @Retention(RetentionPolicy.SOURCE)
> @interface Test {
>     int age() default 0;
> 
>     String value() default "caoNiMa";
> }
> class  A{
>     @Test("alalal")//意思是这里value可以不写@Test(value=XXX)
>     public void eat() {
>         System.out.println("干饭!!!");
>     }
> }
> 
> ```
>
> 
>

































