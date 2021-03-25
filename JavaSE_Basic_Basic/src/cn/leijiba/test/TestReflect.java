package cn.leijiba.test;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author notfornothing
 * @Date 2021/3/24 21:37
 */
public class TestReflect {
    public static void main(String[] args) {

    }


    @Test
    public void getField() throws Exception {
        Class<Student> clazz = Student.class;
        Field field = clazz.getDeclaredField("name");
        System.out.println(field.getType().getName());
        Student student = clazz.newInstance();
        field.setAccessible(true);
        field.set(student,"lucy");
        System.out.println(field.get(student));
    }





    @Test
    public void getMethod() throws Exception {
        Class<?> clazz = Class.forName("cn.leijiba.test.Student");
        Method save = clazz.getDeclaredMethod("save", int.class, String.class);
        Object o = clazz.newInstance();
        save.setAccessible(true);
        save.invoke(o, 1, "jack");
        System.out.println(o);
    }
}
