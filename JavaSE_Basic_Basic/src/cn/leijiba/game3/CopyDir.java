package cn.leijiba.game3;

import com.sun.media.sound.SoftTuning;
import org.junit.Test;
import sun.font.FontRunIterator;

import java.io.*;
import java.util.*;

/**
 * @Author notfornothing
 * @Date 2021/3/17 21:33
 */

/**
 * 复制文件, prop文件的value值需要为路径,
 *
 */
public class CopyDir {

  private   String prop = null;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public CopyDir(String prop) {
        this.prop = prop;
    }

    public void cp() {
        try {
            methodCopy(Prop.getMap(prop));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void store(String from,String to) {
        setPath(from, to);

    }
    /**
     * 这默认为
     */
    public void store() {
       setPath();

    }

    private static void methodCopy(Map<String, String> map) {
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key_SRC = next.getKey();
            String value_destination  = next.getValue();
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
               bis = new BufferedInputStream(new FileInputStream(key_SRC));
               bos = new BufferedOutputStream(new FileOutputStream(value_destination));
                byte[] bytes = new byte[1024];
                int b=0;
                while ((b=bis.read(bytes,0,bytes.length))!=-1) {
                    bos.write(bytes, 0, b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//      for (Map.Entry<String, String> entry : map.entrySet()) {
//            entry.getKey();
//            entry.getValue();
//        }
    }

    /**
     *
     * @param from 资源文件夹
     * @param to   目的地的文件夹
     */
    private  void setPath(String from, String to) {
        HashMap<String, String> map = new HashMap<>();
        File file = new File(from);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            map.put(files[i].getAbsolutePath(), to + "\\"+files[i].getName());
        }
        try {
            Prop.storeProp(prop,map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //建立路径 存好东西.默认是girls文件夹下的
    private  void setPath() {
        File file = new File("JavaSE_Basic_Basic/girls");
        File[] files = file.listFiles();
        String ddd = "C:\\Users\\Administrator\\Desktop\\test\\";
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < files.length; i++) {
            map.put(files[i].getAbsolutePath(), ddd +"\\"+ files[i].getName());
        }
        try {
            Prop.storeProp(prop,map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
