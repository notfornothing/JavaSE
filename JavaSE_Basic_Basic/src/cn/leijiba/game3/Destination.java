package cn.leijiba.game3;

import java.io.File;

/**
 * @Author notfornothing
 * @Date 2021/3/17 21:13
 */
public class Destination {
    public static File getDestination(String fileName) {
        return new File(fileName);
    }
}
