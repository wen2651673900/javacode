package oop.bigbosspalysystem;

import java.util.Arrays;

public class User extends impFunction{
    private String name;
    private String password;
    private int age;
    private String six;
    private String[] arawd = new String[10];
    private int sum = 0;
    public User(){

    }
    public User(String name,String password){
        this.name = name;
        this.password = password;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSix(String six){
        if(six.equals("男")||six.equals("女")){
            this.six = six;
        }else{
            System.out.println("输入有误！");
        }
    }
    public void addAward(String type){
        if(sum+1>arawd.length){
            System.out.println("背包已满！");
        }else if(sum >= 7){
            System.out.println("背包快满了哦~");
        }
        this.arawd[sum++] = type;
    }
    public void getAward(){
        for(int i = 0;i < sum;i++){
            System.out.print(i+1+":"+arawd[i]+"  ");
        }
        System.out.println();
    }
    public void deleteAward(int index){
        if(index > arawd.length){
            System.out.println("位置1-10");
            return;
        }
        for(int i = index-1;i < arawd.length-1;i++){
            arawd[i] = arawd[i+1];
        }
        sum--;
    }
    public int getAge(){
        return this.age;
    }
    public String getSix(){
        return this.six;
    }
    public String getPassword(String name){
        if(name.equals(this.name)){
            return this.password;
        }else{
            return "只能查看自己的密码！";
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", six='" + six + '\'' +
                ", arawd=" + Arrays.toString(arawd) +
                ", sum=" + sum +
                '}';
    }
}
