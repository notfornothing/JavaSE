# 锁的概念

---

**悲观和乐观锁**



# 设计模式:

---

## 单例模式 1: 饿汉式

> 用private修饰一些方法(比如构造,变量).用public修饰getXXX获取这个对象.
> 但是这里用了static修饰,以便能类名.getXXX获取这个对象,但是你总get也只是那一个对象.因为你是static 的

## Runtime就是饿汉式

```java
public class Runtime {
    private static Runtime currentRuntime = new Runtime();

    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /** Don't let anyone else instantiate this class */
    private Runtime() {}
.......................................
}
//以上只是部分代码
```

## 单例模式2:懒汉式

> 