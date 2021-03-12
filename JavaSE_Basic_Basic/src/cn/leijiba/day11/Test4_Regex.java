package cn.leijiba.day11;

import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/12 16:15
 */
public class Test4_Regex {
    public static void main(String[] args) {
        System.out.println("input　Your ID");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "[0-9]{17}[0-9X]";
        if (s.matches(regex)) {
            System.out.println("good");
        } else {
            System.out.println("fuck te");
        }
    }
}
