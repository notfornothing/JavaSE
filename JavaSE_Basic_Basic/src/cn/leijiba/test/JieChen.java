package cn.leijiba.test;

import javafx.css.StyleOrigin;

import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/10 16:47
 */
public class JieChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = fun(i);
        System.out.println(result);
    }

    private static int fun(int i) { ;
        if (i == 1) {
            return 1;
        } else {
        return i*fun(i-1);
        }
    }
}
