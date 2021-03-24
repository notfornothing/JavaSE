# [Java 中的 ==, equals 与 hashCode 的区别与联系](https://blog.csdn.net/justloveyou_/article/details/52464440)

---





# equals()

一般把常量写 前面 即 "常量".equals() 防止空指针异常

* 初衷:就是判断两个对象的 content 是否相同.

---

Objects类:

> ```java
> public boolean equals(Object obj) {
>         return (this == obj);
>     }
> ```

> Objects的意思是判断两个对象是否相同
>
> 很显然，在Object类中，equals方法是用来比较两个对象的引用是否相等，即是否指向同一个对象。

> 但是我们知道:
>
> ```java
> String str1 = new String("hello");//这里指向不同的hello
> String str2 = new String("hello");//这里指向不同的hello 却是true
> System.out.println(str1.equals(str2));//ture 
> ```
>
> 这是因为String 重写了equals()方法:

String类:(重写了equals方法) 不需要看懂

> ```java
> //源码: 
> public boolean equals(Object anObject) {
>         if (this == anObject) {//先比较引用类型是否相同(即是佛为同一对象)
>             return true;
>         }
>         if (anObject instanceof String) {//在判断类型是否一致
>             String anotherString = (String)anObject;
>             int n = value.length;
>             if (n == anotherString.value.length) {
>                 char v1[] = value;
>                 char v2[] = anotherString.value;
>                 int i = 0;
>                 while (n-- != 0) {
>                     if (v1[i] != v2[i])//最后比较内容是否一致
>                         return false;
>                     i++;
>                 }
>                 return true;
>             }
>         }
>         return false;
>     }
> ```
>
> **Java 中所有内置的类的 equals 方法的实现步骤均是如此，特别是诸如 Integer，Double 等包装器类。**
>
> * 一般分为三个步骤:
>   * 先比较引用类型是否相同(即是佛为同一对象)
>   * 在判断类型是否一致
>   * 最后比较内容是否一致

> 




# 判断数组是不是对象

---

```java
public static void main(String[] args) {
    System.out.println("判断数组是否是对象?");
    char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    System.out.println(chars);//这是字符数组的特性
    //可以理解为指向的第一个数组的地址

    int[] ints = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(ints);//这样就不行了,没有重写toString方法

    if (chars instanceof Object) {
        System.out.println("数组是对象");//输出为这个
    } else {
        System.out.println("数组不是对象");
    }
}
```

# 关于toString()方法

---

Object类:

> ```java
>  public String toString() {
>         return getClass().getName() + "@" + Integer.toHexString(hashCode());
>     }
> ```
>
> 这样比较hashCode()没有意义.因为我们要的是比较里面的String 或者说是实质性的东西

String类:

> ```java
>     public String toString() {
>         return this;
>     }
> ```
>
> String类重写了toString方法

数组类:

int[] ints =new int[10] 

char[] chars=new char[10]

> ```java
> char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
> System.out.println(chars);//abcdefg
> //这是字符数组的特性
> //可以理解为指向的第一个数组的地址
> 
> int[] ints = {1, 2, 3, 4, 5, 6, 7};
> System.out.println(ints);//这样就不行了,没有重写toString方法
> ```
>
> 数组类没有重写toString( )  chars数组可以打印是因为chars指向第一个数组的地址



# 包装类

---

**Integer** 的两种构造方法:

- - | Constructor and Description                                  |
    | ------------------------------------------------------------ |
    | `Integer(int value)`  构造一个新分配的 `Integer`对象，该对象表示指定的 `int`值。 |
    | `Integer(String s)`  构造一个新分配 `Integer`对象，表示 `int`由指示值  `String`参数。 |

* Integer 在给 -128到127 用高效的效果 相同的数据存一次

  但是在其他范围内存的是两个对象(**只要Integer有这个高效**)

```java
Integer i=1;
等价于
Integer i=Integer.valueOf(1);
```

[关于Integer的高效:了解即可==>由此去源代码](https://github.com/notfornothing/JavaSE/blob/main/JavaSE_Basic_Basic/src/cn/leijiba/day11/Test6_Integer.java)

* ```java
      private static void integerTest2() {
          Integer i1 = Integer.valueOf((int)666);
          Integer i2 = Integer.valueOf((int)666);
          Integer i3 = new Integer((int) 666);
          Integer i4 = new Integer((int) 666);
          System.out.println(i1==i2);//false
          System.out.println(i3==i4);//false
      }
  
      private static void integerTestEqual() {
          Integer i1 = Integer.valueOf((int)6);
          Integer i2 = Integer.valueOf((int)6);
          Integer i3 = new Integer((int) 6);
          Integer i4 = new Integer((int) 6);
          System.out.println(i1==i2);//true
          System.out.println(i3==i4);//false
      }
  
      public static void integerTest() {
          Integer i1=  6;
          Integer i2 = 6;
          Integer i3 = new Integer(6);
          Integer i4 = new Integer(6);
          System.out.println(i1 == i2);//true
          System.out.println(i3 == i4);//false
      }
  
     public static void main(String[] args) {
          integerTest();
          integerTest2();
          System.out.println("=========|");
          //为什么会输出 true  false
          //下面的是反编译,这是
          integerTestEqual();
          //可以看到i1 i2 以自动装箱的方式创建
          //i3  i4以构造方法的方式创建
  
          //那为啥会有true返回呢?
          //因为Integer在valueOf()第一次 调用时.会创建-128~127直接的实例
          //加到缓存,后续调用valueOf方法时,会返回缓存中的实例.
          //所以指向同一内存地址 为true.
          // 所以integerTest2 超过了127的最大值.你自己可以进valueOf方法里看.
      }
  ```



# String

重写了equals方法和toString方法

sout 默认打印的是他的toString方法

---

String =" "  和String str=new String(" ")的区别==>[StringTest.java](https://github.com/notfornothing/JavaSE/blob/main/JavaSE_Basic_Basic/src/cn/leijiba/day11/StringTest.java)

> [基于 == 判断的,因为 == 是比较的地址值.](https://blog.csdn.net/justloveyou_/article/details/52464440)

```java
public static void main(String[] args) {
    /** String=""  和 String s=new String("string")的区别*/

    String str1 = "abcd";
    String str2 = "abcd";
    System.out.println(str1==str2);//true
    // 因为String str1 = "abcd"的实现过程：
    // 首先栈区创建str引用，然后在String池（独立于栈和堆而存在，存储不可变量）
    // 中寻找其指向的内容为"abcd"的对象，如果String池中没有，则创建一个，
    // 然后str指向String池中的对象，如果有，则直接将str1指向"abcd""；
   // 如果后来又定义了字符串变量 str2 = "abcd",
    // 则直接将str2引用指向String池中已经存在的“abcd”，不再重新创建对象；

    System.out.println("============");
    str1 = "abc";
    String str3 = "abc";
    System.out.println(str1 == str3);//true
    //当str1进行了赋值（str1=“abc”），则str1将不再指向"abcd"，
    // 而是重新指String池中的"abc"，此时如果定义String str3 = "abc",
    // 进行str1 == str3操作，返回值为true，因为他们的值一样，地址一样

    System.out.println("============");
    str1 = str3 + "d";
    System.out.println(str2 == str1);//false
    System.out.println(str2.equals(str1));//true
    //内容为"abc"的str1进行了字符串的+连接str1 = str1+"d"；
    // 此时str1指向的是在堆中新建的内容为"abcd"的对象，*************这是重点
    // 即此时进行str1==str2，返回值false，因为地址不一样。但是值一样

    System.out.println("=================");
    System.out.println("以下是区别");

    String str4 = new String("abcd");
    String str5 = new String("abcd");
    System.out.println(str4 == str5);//false
    System.out.println(str4.equals(str5));//true
    //String str4 = new String("abcd")的实现过程：
    //直接在堆中创建对象。如果后来又有String str5 = new String("abcd")，
    // str5不会指向之前的对象，而是重新创建一个对象并指向它，
    // 所以如果此时进行str3==str4返回值是false，因为两个对象的地址不一样，
    // 如果是str3.equals(str4)，返回true,因为内容相同。
}
```



# **String常用API**

-----------------不用记下来, 有印象就行

---

* charAt
* **concat** --拼接,但不改变原字符串
* endsWith
* startsWith
* equals
* **indexOf**
* lastIndexOf
* length
* toUpperCase
* toLowerCase
* **split** --切割
* **valueOf** -- int转String
* trim --去掉头尾空格
* getBytes --转成byte[]
* **subString** --截取子串 左闭右开 [)

对于String的这些方法:

可以用字符串常量来解释:所以他返回的值是变的

```java
"abcdefg".substring(2, 6);
```

# String 和 StringBuffer 和 String 

---

目前只知道 String 拼接字符串 比其他两个很耗时间和内存

用System.currentTimeMillis()两个相减得到的







# 思考 成员变量为自定义的类型,那么equals是否调用该成员变量的equals方法呢?toString呢?

---

是的,所以应该重写 equals和toString

* 其中toString调用的是 hashCode的默认.所以应该重写才好

* 重写的 equals 调用的是基本数据类型的是用==.引用数据类型调用的是 Objects.equals(a,b)

  > 我看了一下他的实现,就是去调用a 的equals方法.所以说要重写才好.免得到时候equals判断半天还不等于.免得踩坑



下面有关于Objects的quals方法

## Stringbuffer是线程安全的:

> **他是从JDK1.0版本就有的,他是线程安全**
> **StringBuffer源码有**:
>
> ```java
>     @Override
>     public synchronized int length() {
>         return count;
>     }
> 
>     @Override
>     public synchronized int capacity() {
>         return value.length;
>     }
> 
> 
>     @Override
>     public synchronized void ensureCapacity(int minimumCapacity) {
>         if (minimumCapacity > value.length) {
>             expandCapacity(minimumCapacity);
>         }
>     }
> ```
>



## Stringbuilder 不是线程安全的

> - **从版本JDK 5开始，这个类别已经被一个等级类补充了，这个类被设计为使用一个线程Stringbuilder类,Stringbuilder应该使用Stringbuilder类，因为它支持所有相同的操作，但它更快，因为它不执行同步。** 
>
> **Stringbuilder没有synchronized锁** ,**所以他不是线程安全的.**



# 好像还有一个Objects类

---

主要用到的是Objects类的 Objects.equals

```java
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

```















