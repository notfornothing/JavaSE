package cn.leijiba.day11;

/**
 * @Author notfornothing
 * @Date 2021/3/12 20:22
 */
public class StringTest {
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
}
