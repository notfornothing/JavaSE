package cn.leijiba.day19;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/24 10:23
 */
public class TestReflect2 {
    public static void main(String[] args) throws Exception {

    }

    @Test
    public void getField() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Person> aClass = Person.class;

        Field field = aClass.getDeclaredField("name");
        System.out.println(field.getType().getName());
        Object o = aClass.newInstance();
        field.setAccessible(true);
        field.set(o, "asdf");
        System.out.println(field.get(o));
    }

    @Test
    public void getFunction() throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Person> claZZ = Person.class;
        Method[] methods = claZZ.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Method[] methods1 = claZZ.getMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        System.out.println("========================");
        Method save = claZZ.getDeclaredMethod("save", String.class, int.class);
        Object obj = claZZ.newInstance();
        save.setAccessible(true);
        Object asdf = save.invoke(obj, "asdf", 1234);
        System.out.println(asdf);
    }
}
