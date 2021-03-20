package cn.leijiba.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author notfornothing
 * @Date 2021/3/20 10:41
 */
class Foo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("java");
        list.add("aaa");
        list.add("java");
        list.add("java");
        list.add("bbb");

    }

    public void f(){
        try{
            FileInputStream fis4 = new FileInputStream("file");
            fis4.read();
        }catch(IOException e){
        }
    }

}