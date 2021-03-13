package cn.leijiba.day11;

/**
 * @Author notfornothing
 * @Date 2021/3/12 16:35
 */

/**
 * 包装类
 */
public class Test5_Number {
    public static void main(String[] args) {
        integerTest();
    }

    public static void doubleTest() {
        Double d1 = new Double(3.4);
        Double d2 = Double.valueOf(3.4);
        System.out.println(d1 == d2);
        System.out.println(d1.parseDouble("1.1"));

    }

    /**
     * 只有Integer有这个属性
     */
    public static void integerTest() {
        Integer integer1 = new Integer(55);
        Integer integer2 = new Integer(55);
        Integer integer3 = new Integer(555);
        Integer integer4 = new Integer(555);
        System.out.println(integer1 == integer2);
        System.out.println(integer3== integer4);
        System.out.println("========");
        Integer integer5 = Integer.valueOf(10);
        Integer integer6 = Integer.valueOf(10);
        Integer integer7 = Integer.valueOf(1000);
        Integer integer8 = Integer.valueOf(1000);
        System.out.println(integer5==integer6);
        System.out.println(integer7==integer8);
    }
}
