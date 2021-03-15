package cn.leijiba.day12;

import java.io.File;
import java.math.BigDecimal;

/**
 * @Author notfornothing
 * @Date 2021/3/15 15:47
 */
public class File3_FileSumRecursion {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\DayNote\\CGB2102");
        Long l = method(file);
        System.out.println("该文件有 "+l+" 字节(Bytes)");
        BigDecimal bigDecimal = new BigDecimal(l + "");
        BigDecimal bigDecimal1 = new BigDecimal(1024 + "");
        BigDecimal divide = bigDecimal.divide(bigDecimal1, 1, BigDecimal.ROUND_HALF_DOWN);
        divide = divide.divide(bigDecimal1, 1, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(divide+"MB");
    }

    private static Long method(File file) {
        File[] files = file.listFiles();
        long count = 0;
        for (int i = 0; i < files.length; i++) {
            File f = files[i];
            if (f.isFile()) {
                count += f.length();
            } else if (f.isDirectory()) {
                count += method(f);
            }
        }
        return count;
    }
}
