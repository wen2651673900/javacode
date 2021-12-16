package oop.bigbosspalysystem;
import java.util.*;

public class Main{
    /**
     * 注册功能，登录功能，抽奖功能，查询功能，修改密码功能，删除账号功能，退出功能
     * @param args
     */
    private static impFunction impl = new impFunction();
    private static User thisUser;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("-----------大富翁游戏系统-----------");
            System.out.println("----1.登录-----2.退出-----3.注册----");
            String input = sc.next();
            if(input.equals("1")){
                System.out.print("账号：");
                String name = sc.next();
                System.out.print("\n密码：");
                String password = sc.next();
                thisUser = impl.login(name, password);
                if(thisUser != null){
                    thisUser = inter();
                }else{
                    System.out.println("账号或密码错误！");
                }
            }else if(input.equals("3")){
                String name = sc.next();
                String password = sc.next();
                sc.nextLine();
                User u = new User(name,password);
                if(impl.addUser(u)){
                    thisUser = u;
                    thisUser = inter();
                }
            }else if(input.equals("2")){    
                sc.close();
                break;
            }
        }
    }
    private static User inter(){
        while(true){
            System.out.println("------欢迎"+thisUser.getName()+"-----");
            System.out.println("----1.抽奖--2.退出登录--3查询用户----");
            System.out.println("----4.修改信息---8.删除装备---5.背包--");
            System.out.println("----6.删除账号----------7.查询用户---");
            String input = sc.next();
            if(input.equals("2")){
                return null;
            }else if(input.equals("6")){
                if(impl.deleteUser(thisUser)) {
                    System.out.println("删除成功");
                    return null;
                }else{
                    System.out.println("删除失败");
                }
            }else if(input.equals("3")){
                System.out.print("用户名：");
                String name = sc.next();
                if(impl.findUser(name)!=null){
                    System.out.println(impl.findUser(name).toString());
                }else{
                    System.out.println("暂无该用户");
                }
            }else if(input.equals("5")){
                thisUser.getAward();
            }else if(input.equals("1")){
                String t = impl.award(thisUser);
                thisUser.addAward(t);
                System.out.println("恭喜获得一张："+t+"卡！");
            }else if(input.equals("4")){
                System.out.println("输入用户名:");
                System.out.println(impl.findUser(sc.next()));
            }else if(input.equals("7")){
                String name = sc.next();
                System.out.println(impl.findUser(name));
            }else if(input.equals("8")){
                thisUser.getAward();
                System.out.print("输入物品序号：");
                String n = sc.next();
                if(n.equals("4")||n.equals("5")||n.equals("6")||n.equals("7")||n.equals("8")||n.equals("9")||n.equals("10")||n.equals("1")||n.equals("2")||n.equals("3")){
                    thisUser.deleteAward(Integer.valueOf(n));
                }else{
                    System.out.println("请正确输入！");
                }
            }
        }
    }
}
