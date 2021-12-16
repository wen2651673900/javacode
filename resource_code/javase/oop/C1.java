package oop;

public  class C1 {
    static class c2{
        String name = "静态内部类";
    }
    static Object o = new Object(){
        String name = "匿名内部类";
    };
    static abstract class test{

    }
    public static void main(String[] args) {
        String sum = "String";
        /**
         * 不能用static、private、public修饰类
         * 访问方法内的变量（参数）必须要用final修饰
         */
        new Object(){
            String name = "匿名内部类";
        };
        System.out.println(o.toString());
    }
    private static test getc4(){
        class c4 extends test{
            String name = "局部内部类";
        }
        return new c4();
    }
}
