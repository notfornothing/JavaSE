package cn.leijiba.day08;
/**本类用于完成OOP汽车设计综合案例*/
/**
 *
 */
public class Test7ExtendsDesign {
    //3.创建入口函数main
    public static void main(String[] args) {
        //4.创建父类对象进行测试
        Car c = new Car();
        System.out.println(c.getColor());//通过get方法查看封装后的color值
        c.start();
        c.stop();

        //5.创建宝马类对象进行测试
        Car b = new BMW();
        System.out.println();
        b.start();
        b.stop();

        //6.创建保时捷类对象进行测试
        BSJ j = new BSJ();
        System.out.println(j.color);
        j.start();
        j.stop();
    }
}
//0.创建一个汽车类
class Car{
    //0.1定义Car类的属性并通过private进行封装
    private String brand;//品牌
    private String color;//颜色
    //封装并提供公共的get()与set()
    //右键-->Source-->Generate Getters and Setters -->Select All -->Generate
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //0.2定义Car类的启动与停止方法
    public void start() {
        System.out.println("我的车车启动啦~~~");
    }
    public void stop() {
        System.out.println("哎呀吗,我的车车熄火了~");
    }
}
//1.创建一个宝马类并且继承Car类
class BMW extends Car{
    String color = "五彩斑斓的黑";
}

//2.创建一个保时捷并且继承Car类
class BSJ extends Car{
    String color = "黑不溜秋的白";
}










