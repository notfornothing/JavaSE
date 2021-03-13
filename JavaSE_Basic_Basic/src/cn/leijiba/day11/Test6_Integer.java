package cn.leijiba.day11;

/**
 * @Author notfornothing
 * @Date 2021/3/13 18:16
 */
public class Test6_Integer {
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
}
