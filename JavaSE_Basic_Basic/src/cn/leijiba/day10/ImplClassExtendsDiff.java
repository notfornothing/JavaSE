package cn.leijiba.day10;

/**
 * @Author notfornothing
 * @Date 2021/3/11 21:15
 */
public class ImplClassExtendsDiff {
    public static void main(String[] args) {
        Inter2 inter2 = new Inter2ImplExtends();
        //inter2.method(1);
        inter2.method();
    }
}


interface Inter2 {
    //public Inter2{}//接口中不能有构造方法
    public static final   int i = 0;
    public abstract void method();
}

abstract class Inter2Impl extends Object implements Inter2 {

    public Inter2Impl() {
        super();//这个super是Object的
        System.out.println("constructor");
    }

    public void method(int i) {
        System.out.println("this is method");
    }
}

class Inter2ImplExtends extends Inter2Impl {

    @Override
    public void method() {
        System.out.println("come from Inter2ImplExtends");
    }
}