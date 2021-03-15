package cn.leijiba.day12;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/15 10:53
 */
public class Bigdecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double v2 = sc.nextDouble();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(v));
        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(v2));
        BigDecimal subtract = bigDecimal.subtract(bigDecimal1);
        System.out.println(subtract);
        subtract = bigDecimal.divide(bigDecimal1, RoundingMode.HALF_UP);

    }
}
