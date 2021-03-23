package cn.leijiba.day18;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author notfornothing
 * @Date 2020/3/23 14:42
 */
public class Test1Reflect {

    @Test
    public void getClazz() throws Exception {
        Class<? > student1 = Class.forName("cn.leijiba.day18.Student");
        Class<Student> student2 = Student.class;
        Class<? extends Student> student3 = new Student().getClass();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("==================");

        System.out.println(student1.getName());//获取全路径名(包名加类名)
        System.out.println(student1.getSimpleName());//获取类名
        System.out.println(student1.getPackage().getName());//获取包名
    }

    @Test
    public void getConstructor() throws Exception {
        Class<?> clazz = Student.class;
        Constructor<?> constructor = clazz.getConstructor();
        System.out.println(constructor);
        Constructor<?> constructor1 = clazz.getConstructor(int.class,String.class);
        System.out.println(constructor1);
        System.out.println("==================");
        Constructor<?>[] constructors = clazz.getConstructors();
        String s = Arrays.toString(constructors);
        System.out.println(s);
        System.out.println("===============");
        for (Constructor<?> c : constructors) {
            Class<?>[] parameterTypes = c.getParameterTypes();
            System.out.println(Arrays.toString(parameterTypes ));
            System.out.println(c);
        }
    }

    @Test
    public void getFunctions() throws Exception {
        Class<?> clazz = Class.forName("cn.leijiba.day18.Student");
        Method[] methods = clazz.getMethods();
        System.out.println(Arrays.toString(methods));
        System.out.println("==================");
        for (Method method : methods) {
            System.out.println(method.getName());
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.println(Arrays.toString(parameterTypes));
        }
    }

    @Test
    public void getFields() throws NoSuchFieldException {
        Class<?> clazz = new Student().getClass();
        Field[] fields = clazz.getFields();
        System.out.println(Arrays.toString(fields));
        System.out.println("===============");
        for (Field field : fields) { //只能获取public修饰的属性
                                    //就算不写也不行,只能public!!!!
            System.out.println(field.getName()); //获取成员变量名字
            System.out.println(field.getType().getName() ); //获取成员变量属性
        }
    }

    @Test
    public void createObjet() throws Exception {
        //利用反射技术创建对象的两种方式:
        //1.通过字节码对象直接调用newInstance().触发的是无参构造.且只能为无惨构造
        //2.
        Class<?> clazz = Student.class;
        Object o = clazz.newInstance();//触发的是无参构造 且Class对象只有这一种
        System.out.println(o);
        Constructor<?> constructor = clazz.getConstructor(int.class, String.class);
        System.out.println(constructor);
        System.out.println("=====================");
        Object obj2 = constructor.newInstance(3, "lucy");
        System.out.println(obj2.toString());
        //多态
        Student obj21 = (Student) obj2;
        obj21.tell();
    }
}

