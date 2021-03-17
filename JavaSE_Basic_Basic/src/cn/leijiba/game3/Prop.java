package cn.leijiba.game3;

/**
 * @Author notfornothing
 * @Date 2021/3/17 21:07
 */

import java.io.*;
import java.security.Key;
import java.security.Policy;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * # 自己弄个文件复制的
 * ---
 * # Properties类
 * ---
 * 和IO流结合看看
 */
public class Prop {
    public static Map<String, String> getMap(String fileName) throws IOException {
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader(fileName)));
        Set<String> set = properties.stringPropertyNames();
        Map<String, String> map = new HashMap<>();
        for (String s : set) {
            map.put(s, properties.getProperty(s));
        }
        return map;
    }

    public static boolean storeProp(String fileName,File SRC,File destination) throws IOException {
        String src = SRC.toString();
        String dddd = destination.toString();
        Properties properties = new Properties();
        properties.setProperty(src, dddd);
        properties.store(new FileWriter(fileName),"左边源文件,右边是目的地");
        return true;
    }

}
