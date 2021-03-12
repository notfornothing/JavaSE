package cn.leijiba.day11;

/**
 * @Author notfornothing
 * @Date 2021/3/12 21:03
 */
public class CheckArrayNot {
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
}
