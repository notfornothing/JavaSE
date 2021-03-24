

# 反射

---

**Junit**

> @Test 注解修饰:
>
> 语法要求: @Test+void+无参+public

反射有很多方法.自己去点吧



有好多方法.获取private修饰的.要**getDeclaredXXX()**

**暴力反射:**  也不好怎么说,他那里后面要搞一下对象进去.还要setAccessible.以后的框架听说很多会用到反射....

```java
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
```





#  内部类

---

**讲了很多,但是我觉得不不好听.任性!!!!!!**