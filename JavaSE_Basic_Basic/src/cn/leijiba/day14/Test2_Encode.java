package cn.tedu.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**本类用来测试编码转换流*/
/**编写(保存)时的编码与查看时的编码一致才不会乱码*/
/**查看编译器eclipse的编码--默认编码GBK
 * window-->Preference-->General-->workspace
 * 查看项目的编码
 * 右键项目-->properties-->Resource* */
public class Test2_Encode {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter out = null;//局部变量需要初始化,默认值null

            //1.创建流对象
            /**参数1.txt不是磁盘路径,而是直接生成在项目下的和src同级的文件
             * 需要F5多次刷新出来
             * */
            //out = new OutputStreamWriter(new FileOutputStream("1.txt"));
//			out = new OutputStreamWriter(
//					new FileOutputStream("1.txt"),"iso-8859-1");
            out = new OutputStreamWriter(
                    new FileOutputStream("1.txt"),"utf-8");
            //2通过流对象输出数据到1.txt中
            out.write("我们可以的~马上要干饭啦!");
            System.out.println("恭喜您!输出成功!");
            out.flush();//记得加flush刷到文件中去
    }
}




