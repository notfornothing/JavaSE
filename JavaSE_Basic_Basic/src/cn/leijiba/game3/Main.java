package cn.leijiba.game3;

/**
 * @Author notfornothing
 * @Date 2021/3/18 22:57
 */
public class Main {
    public static void main(String[] args) {
        CopyDir copyDir = new CopyDir("C:\\Users\\Administrator\\Desktop\\1.properties");
        copyDir.setProp("C:\\Users\\Administrator\\Desktop\\1.properties");
        copyDir.store("C:\\Users\\Administrator\\Desktop\\应用软件","C:\\Users\\Administrator\\Desktop\\test\\");
        copyDir.cp();
    }
}
