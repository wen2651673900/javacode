package exceptions;
import java.util.*;
public class demo {
    public static void main(String[] args) throws Exception{
        f3();
        throw new Exception();
    }
    private static void f(){
        try{//如果这里面的代码出现了异常则就会执行catch
            Integer num = null;
            int newNum = num;
            System.out.println(num);
        }catch (Exception e){//出现异常就会执行下面代码块
            System.out.println("异常");
        }finally{//这段代码块里的代码无论有没有触发异常都会被执行

        }
    }
    private static void f2()throws Exception{//throws是将异常抛给调用这个函数的函数

    }
    private static void f3() throws Exception {//抛出异常
        int[] arr = new int[1];
        System.out.println(arr[10]);
        System.out.println("hello");
        throw new Exception();
    }
}