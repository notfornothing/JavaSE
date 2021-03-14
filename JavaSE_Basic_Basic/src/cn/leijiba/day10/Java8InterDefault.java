package cn.leijiba.day10;

/**
 * @Author notfornothing
 * @Date 2021/3/14 15:56
 */
public interface Java8InterDefault {
    public abstract void method1();
    public default void method2(){
        System.out.println("this is default");
    };

    public static void method3() {

    }


}
