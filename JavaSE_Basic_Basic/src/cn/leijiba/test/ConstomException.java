package cn.leijiba.test;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import org.junit.Test;

import java.lang.reflect.WildcardType;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/24 22:58
 */
public class ConstomException {
    public static void main(String[] args) throws RegisterException {

        ConstomException exception = new ConstomException();
        exception.method();
    }

    public void method() throws RegisterException {
        String[] s = {"lucy", "jack", "tony"};
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        for (String sss : s) {
            if (sss.equals(next)) {
                System.out.println("user is exist");
                throw new RegisterException();
            }
        }
    }
}
