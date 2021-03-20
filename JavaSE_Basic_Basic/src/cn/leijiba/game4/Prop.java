package cn.leijiba.game4;

/**
 * @Author notfornothing
 * @Date 2021/3/17 21:07
 */

import java.io.*;
import java.security.Key;
import java.security.Policy;
import java.util.*;
/**
 * # 自己弄个文件复制的
 * ---
 * # Properties
 * ---
 * 和IO流结合看看
 */
public class Prop {
    //获取配置文件的 键值对 返回map集合
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


    //<key from,value to>
    //设置值.
    public static boolean storeProp(String fileName,Map<String,String> map) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader(fileName));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        for (int i = 0; i < map.size(); i++) {
            Map.Entry<String, String> next = it.next();
            properties.setProperty(next.getKey(), next.getValue());
        }
        String s = "左边源文件,右边是目的地";

        properties.store(new FileWriter(fileName), s);
        return true;
    }
}
