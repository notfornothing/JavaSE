package cn.leijiba.day18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author notfornothing
 * @Date 2021/3/23 10:38
 */
public class TestAnnotation {
    public static void main(String[] args) {

    }
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@interface Test {
    int age() default 0;

    String value() default "caoNiMa";
}

    class  A {

    @Test("alalal")
    public void eat() {
        System.out.println("干饭!!!");
    }
}