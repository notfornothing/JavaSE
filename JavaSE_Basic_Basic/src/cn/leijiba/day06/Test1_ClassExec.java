package cn.leijiba.day06;

/*
  @Author notfornothing
 * @Date 2021/3/5 14:54
 */
/**本类用来练习面向对象

 * 分析手机事物:--通过类来描述

 * 属性:品牌 价格 尺寸 颜色

 * 功能:打电话 发短信 听直播

 * */
class Phone {
    int price;
    String size;
    String color;

    public void call() {
        System.out.println("use " + size + " phone calling");
    }

    public void send() {
        System.out.println("use " + price + " phone sending");
    }
    public void showColor() {
        System.out.println("use " + color + " phone color");
    }
}
public class Test1_ClassExec {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.send();
        phone.call();
        phone.showColor();

    }

}
