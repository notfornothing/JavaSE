package cn.leijiba.day11;

import java.util.Objects;

/**
 * @Author notfornothing
 * @Date 2021/3/13 19:29
 */
public class MyCustom {
    int i;
    String b;



    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public MyCustom() {
    }

    public MyCustom(int i, String b) {
        this.i = i;
        this.b = b;
    }
}
