package cn.leijiba.game3;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author notfornothing
 * @Date 2021/3/17 21:33
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {

        methodLoad();
    }

    private static void methodLoad() throws IOException {

        Map<String, String> map = Prop.getMap("1.properties");
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String SRC = iterator.next();
            String destination = map.get(SRC);
        }
    }

    private static void methodStore() throws IOException {
        File destination = Destination.getDestination("C:\\Users\\Administrator\\Desktop\\2.png");
        File src = SRC.getSRC("1.png");
        Prop.storeProp("1.properties", src, destination);
    }

}
