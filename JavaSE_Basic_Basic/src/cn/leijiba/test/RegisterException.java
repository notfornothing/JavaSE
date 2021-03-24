package cn.leijiba.test;

/**
 * @Author notfornothing
 * @Date 2021/3/24 23:02
 */
public class RegisterException  extends Exception{
    public RegisterException() {
        super("草拟大爷的");
    }

    public RegisterException(String message) {
        super(message);
    }
}
