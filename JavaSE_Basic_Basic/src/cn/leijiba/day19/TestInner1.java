package cn.leijiba.day19;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

/**
 * @Author notfornothing
 * @Date 2021/3/24 11:45
 */
public class TestInner1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.find();
        Outer.Inner inner= new Outer().new Inner();
        inner.find();
    }
}
// 成员内部类
class Outer{
    String name;
    int age;

    public void find() {
        Inner in = new Inner();
        in.find();


       System.out.println("Outerrrfind");
    }

    class Inner{
        String name;
        int age;

        public void find() {
            System.out.println("InnerrrFindkkkk");
            Outer.this.find();
        }
    }

}