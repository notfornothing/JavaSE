package cn.leijiba.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2021/3/25 19:52
 */
public class TestRRRRRRRRRR {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        getMethodLLL();
    }

    private static void getMethodLLL() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<? extends Student> clazz = new Student().getClass();
        Method save = clazz.getDeclaredMethod("save", int.class, String.class);
        Student student = clazz.newInstance();
        save.setAccessible(true);
        save.invoke(student, 18, "lalalalalal");

    }

    private static void getClassField() throws IllegalAccessException, InstantiationException {
        Class<Student> clazz = Student.class;
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
        Field[] fields = clazz.getDeclaredFields();
        System.out.println(fields[0]);
        Student student = clazz.newInstance();
        fields[0].setAccessible(true);
        fields[1].setAccessible(true);
        fields[0].set( student,"jack" );
        fields[1].set( student,18 );
        student.show();
    }

    private static void getClassMethod() throws ClassNotFoundException {
        Class<Student> class1 = Student.class;
        Class<? extends Student> class2 = new Student().getClass();
        Class<?> class3 = Class.forName("cn.leijiba.test.Student");
        System.out.println(class1 == class2);
    }
}
