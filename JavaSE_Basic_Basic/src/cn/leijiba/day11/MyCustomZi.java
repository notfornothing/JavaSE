package cn.leijiba.day11;

import java.util.Objects;

/**
 * @Author notfornothing
 * @Date 2021/3/13 19:38
 */
public class MyCustomZi {
    int i;
    String s;
    MyCustom myCustom;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCustomZi that = (MyCustomZi) o;
        return i == that.i && Objects.equals(s, that.s) && Objects.equals(myCustom, that.myCustom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, s, myCustom);
    }

    @Override
    public String toString() {
        return "MyCustomZi{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", myCustom=" + myCustom +
                '}';
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public MyCustom getMyCustom() {
        return myCustom;
    }

    public void setMyCustom(MyCustom myCustom) {
        this.myCustom = myCustom;
    }

    public MyCustomZi() {
    }

    public MyCustomZi(int i, String s, MyCustom myCustom) {
        this.i = i;
        this.s = s;
        this.myCustom = myCustom;
    }
}
