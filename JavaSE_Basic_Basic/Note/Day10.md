# 接口

不能被类继承只能实现(Impl) ,可以被接口继承.

---

* 不能用构造方法(因为抽象类可以用构造方法,这样就和抽象类没区别了)
* 在创建Impl类中使用构造里面的默认的调用的super()是Object的构造方法

```java
class Inter2Impl extends Object implements Inter2 {

    public Inter2Impl() {
        super();//这个super是Object的
        System.out.println("constructor");
    }
}
```



* 接口里面没有<u>成员变量</u>,因为那是静态常量public static final 帮你缩写了而已,别天真小伙子;静态常量不能被修改.

* 接口中的方法默认为抽象方法.public abstract 会默认补齐**.好像会讲默认方法**啊啊啊.

* 接口中没有方法体

  ```java
  interface Inter2 {
      //public Inter2{}//接口中不能有构造方法
      public static final   int i = 0;//等价于int i=0;
      public abstract void method();//等价于 void method(); 
  }
  ```




* 一个类可以实现多个接口.但是只能继承一个父类.

* 而且继承的那个父类最大.可以这样理解

* 比如你要重写接口的方法,恰好继承的父类也有重名的那个方法.那就不要重写了.

  ```java
  public class ImplManyInter {
      public static void main(String[] args) {
          A a = new ABImpl();
          a.method1();
          a.method2();
      }
  }
  
  interface A {
      void method1();
  
      void method2();
  }
  interface B {
      void method1();
  
      void method2();
  }
  
  class C {
      public void method1() {
          System.out.println("class C method");
      }
  }
  
  class ABImpl extends C implements A, B {
  
      //这里先继承了C 所以不必重写method1
  
      @Override//这里接口重名没关系的,反正接口没有方法体
      public void method2() {
          System.out.println("Impl method2");
      }
  }
  ```

  

## 有个点,

* **抽象方法要被实现，所以不能是静态static的，也不能是私有private的 final的。**

**但是可以是protected的,子类继承了,虽然不是子类的不能调用,但是其方法可以调用**

* 接口可以继承接口
* 抽象类可以实现接口



Some　question:

* 实现两个接口,有一样的名字.怎么处理//??? 不用啊,你都没方法体,重写便是了
* 实现一个接口,继承一个父类 有一样的方法.怎么处理//  那就直接用父类的方法,当然你也可以重写.反正不写就是默认的是父类的方法
* Java中类是单继承,但是接口和接口可以多继承//是的 没错. 这也体现了为什么有了抽象类还要接口.但是我在想,你抽象类不是可以继承在继承吗?也是一样的效果(抽象类是可以继承实体类的),但是可能更麻烦.
* 接口实现类重写方法可以重载吗?  //可以,但是你必须包含重写的那个方法 你试试



# 思考接口为什么不能protected private ,只能public和default(不写)

****有关继承和多态

参考[这里](https://www.cnblogs.com/leolztang/p/6041222.html) 

# Object 默认存在.

---

**注意先extends 再 impl .(写法)**

> ```java
> public  class InterImpl extends Fu  implements  Inter{
> }
> ```
>
> 

