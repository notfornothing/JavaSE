package cn.leijiba.day20;

import sun.plugin.net.cookie.Netscape4CookieHandler;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/25 11:10
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 55555);
        while (true) {
            OutputStream os = socket.getOutputStream();
            String next = new Scanner(System.in).nextLine();
            next = "C:\\Users\\Administrator\\Desktop\\test\\" + next+".jpg";
            FileInputStream fis = new FileInputStream(new  File(next));
            byte[] b = new byte[1024];
            int a;
            while ((a=fis.read(b,0,b.length)) != -1) {
                os.write(b,0,b.length);
            }
            System.out.println("===============");
            os.flush();
        }
        //socket.close();
    }
}
