package cn.leijiba.test;

/**
 * @Author notfornothing
 * @Date 2021/3/7 10:01
 */
public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                //break;退出整个循环
                continue;//结束本次循环继续后续循环
            }
            System.out.println(i);
        }
    }
}
