package oop;

public class C3 {
    public static void main(String[]args) {
        System.out.println("hello world");
        persion p = new persion(18, "张三");
        p.p();
        action2 two = p;
        two.get();
        action ac = (action)p;
        System.out.println(ac instanceof action2);
    }
}
/**
 * 接口使用 interface 修饰的
 * 接口中只能有抽象类和常量,即使不用final修饰跟static默认也是常量
 * 接口不能继承只能实现(implement)
 * 抽象类只能单继承但是接口可以多实现
 * 实现了接口后并且必须重写所有抽象方法
 */
interface action{
    int sum = 0;
    public void p();
}
interface action2{
    public void get();
}
class persion implements action,action2{
    private int age;
    private String name;
    public persion(int age,String name){
        this.age =  age;
        this.name = name;
    }
    public persion(){}
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "name:"+name+"   age:"+age;
    }
    public void p(){
        System.out.println(name+"在玩");
    }
    public void get(){
        System.out.println(name+"的年龄"+age);
    }
}