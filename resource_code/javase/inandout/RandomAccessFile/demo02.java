package inandout.RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class demo02 {
    public static void main(String[]args) throws IOException {
        String path = "C://Java//Java_Code//resource_code//javase//inandout//testfile//";
        File file = new File(path+"8888.txt");
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        Scanner sc = new Scanner(System.in);
        byte[] bytes = sc.next().getBytes();
        System.out.println(bytes.length);
        //写入数据
        raf.write(bytes);
        System.out.println("当前指针的位置"+raf.getFilePointer());
        //读取指针的偏移
        raf.seek(0);
        byte[] readBytes = new byte[1024];
        //读取数据将数据存入到readBytes数组中
        int index = raf.read(readBytes);
        System.out.println("读取的字节数："+index);
        String s = new String(readBytes);
        System.out.println("读取到的数据："+s);
        /**
         * 怎么判断读取完毕
         * read == -1
         */
        raf.seek(0);
        System.out.println("指针位置："+raf.getFilePointer());
        raf.skipBytes(3);   //指针偏移几个位置
        System.out.println("指针位置："+raf.getFilePointer());
        raf.close();
        sc.close();
    }
}