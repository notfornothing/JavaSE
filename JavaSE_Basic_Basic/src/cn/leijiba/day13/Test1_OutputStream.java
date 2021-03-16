package cn.leijiba.day13;

import java.io.*;

/**
 * @Author notfornothing
 * @Date 2021/3/16 11:32
 */
public class Test1_OutputStream {
    public static void main(String[] args) throws InterruptedException {
        Test1_OutputStream t = new Test1_OutputStream();
        t.method2();//普通的
        //       method2();
        //       File file = new File("C:\\Users\\Administrator\\Desktop\\test\\11110.jpg");
//        System.out.println(file.isFile());

//        System.out.println(file.delete());
        File file = new File("C:\\Users\\Administrator\\Desktop\\test");
        t.methodDelete(file);

    }

    private boolean methodDelete(File dirFile) {

        if (!dirFile.exists()) {
            return false;
        }

        if (dirFile.isFile()) {
            return dirFile.delete();
        } else {

            for (File file : dirFile.listFiles()) {
                methodDelete(file);
            }
        }

        return dirFile.delete();
    }

    private void method1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("C:\\Users\\Administrator\\Desktop\\test");
            boolean mkdir = file.mkdir();
            String s = "C:\\Users\\Administrator\\Desktop\\test\\1111";
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\11.jpg");
            for (int i = 0; i < 3; i++) {
                fos = new FileOutputStream(new File(s + i + ".jpg"));
                int b = 0;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
                fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\11.jpg");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fis != null;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void method2() {
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        File file = null;
        try {
            file = new File("C:\\Users\\Administrator\\Desktop\\test");
            String s = "C:\\Users\\Administrator\\Desktop\\test\\1111";
            boolean mkdir = file.mkdir();
            bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\11.jpg"));
            int b = 0;
            for (int i = 0; i < 4; i++) {
                bos = new BufferedOutputStream(new FileOutputStream(s + i + ".jpg"));
                while ((b = bis.read()) != -1) {
                    bos.write(b);
                }
                bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\11.jpg"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}





