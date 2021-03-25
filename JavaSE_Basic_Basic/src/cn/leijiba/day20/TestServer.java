package cn.leijiba.day20;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author notfornothing
 * @Date 2021/3/25 11:00
 */
public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(55555);
        InetAddress inetAddress = server.getInetAddress();
        System.out.println(inetAddress);
        System.out.println("==============");
        Socket socket = server.accept();
        System.out.println("图片已经成功接受");
        InputStream is = socket.getInputStream();
        //Socket socketClient = new Socket("127.0.0.1",55555);
        //OutputStream osClient = socketClient.getOutputStream();
        while (true) {
            System.out.println("请重命名你要接受的图片名(默认存在桌面):");
            String next = new Scanner(System.in).next();
            String pathName = "C:\\Users\\Administrator\\Desktop\\"+next+".jpg";
            FileOutputStream fos = new FileOutputStream(new File(pathName));
            byte[] b = new byte[1024];
            int a;
            while ((a=is.read(b,0,b.length)) != -1) {
                fos.write(b,0,b.length);
            }
            fos.close();
        }
    }
}



