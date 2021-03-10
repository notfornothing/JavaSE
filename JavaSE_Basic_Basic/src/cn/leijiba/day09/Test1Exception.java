package cn.leijiba.day09;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/10 10:18
 */
public class Test1Exception {
    public static void main(String[] args) throws Exception {
        Test1Exception test1Exception = new Test1Exception();
        test1Exception.method2();
    }

    public void method2() throws InputMismatchException,ArithmeticException {
        int i = new Scanner(System.in).nextInt();
        int i2 = new Scanner(System.in).nextInt();
        System.out.println(i / i2);
    }

    public  void method() {
        int i = new Scanner(System.in).nextInt();
        int i2 = new Scanner(System.in).nextInt();
        try {
            System.out.println(i / i2);
        } catch (ArithmeticException exception) {
            System.out.println("the second num input wrong");
        } catch (Throwable e) {

            System.out.println("sadfsadf1");
        }
    }
}

