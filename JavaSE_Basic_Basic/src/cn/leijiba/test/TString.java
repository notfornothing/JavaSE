package cn.leijiba.test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/15 20:06
 */
public class TString {
    public static void main(String[] args) {

        String s = "大 爷";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
    }
}
