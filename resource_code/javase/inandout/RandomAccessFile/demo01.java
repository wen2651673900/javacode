package inandout.RandomAccessFile;
import java.io.*;
public class demo01 {
    public static void main(String[]args) throws IOException{
        String path = "C://Java//Java_Code//resource_code//javase//inandout//testfile//";
        File file = new File(path+"cost.dat");
        if(!file.exists()){
            file.createNewFile();
        }
        /**
         * rw:读写文件信息的操作
         * r：读取文件信息
         */
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        //写入单个字节
        System.out.println("指针位置"+raf.getFilePointer());
        raf.write(2);//只能写入0-255的数字，只能写低八位，超过八位就写不了
        raf.write(255);
        raf.write(256);
        System.out.println("文件长度"+file.length());
        System.out.println("指针位置"+raf.getFilePointer());
        raf.seek(0);
        System.out.println("指针位置"+raf.getFilePointer());
        System.out.println("读取文件信息："+raf.read());
        System.out.println("读取文件信息："+raf.read());
        System.out.println("读取文件信息："+raf.read());
        raf.close();
    }
}
