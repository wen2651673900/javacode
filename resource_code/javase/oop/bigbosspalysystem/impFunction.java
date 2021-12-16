package oop.bigbosspalysystem;
import java.util.*;
public class impFunction implements Function{
    private ArrayList<User> users = new ArrayList<>();
    @Override
    public User login(String name, String password) {
        for(int i = 0;i < users.size();i++){
            if(users.get(i).getName().equals(name)&&users.get(i).getPassword(name).equals(password)){
               return users.get(i); 
            }
        }
        return null;
    }

    @Override
    public boolean addUser(User u) {
        for(int i = 0;i < users.size();i++){
            if(users.get(i).getName().equals(u.getName())){
                System.out.println("用户名重复");
                return false;
            }
        }
        users.add(u);
        return true;
    }

    @Override
    public User findUser(String name) {
        for(int i = 0;i < users.size();i++){
            if(users.get(i).getName().equals(name)){
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean deleteUser(User user) {
        users.remove(user);
        return false;
    }

    @Override
    public boolean quit() {
        return false;
    }

    @Override
    public String award(User user) {
        Random rand = new Random();
        int i = (rand.nextInt(10)+1);
        if(i==1){
            user.addAward("A");
            return "A";
        }else if(i>1&&i<=4){
            user.addAward("B");
            return "B";
        }else if(i>4&&i<=7){
            user.addAward("C");
            return "C";
        }else{
            user.addAward("D");
            return "D";
        }
    }
}
