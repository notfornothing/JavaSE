package cn.leijiba.day10;

/**
 * @Author notfornothing
 * @Date 2021/3/11 21:46
 */
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