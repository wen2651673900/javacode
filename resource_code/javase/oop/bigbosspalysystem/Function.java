package oop.bigbosspalysystem;

interface Function {
    //登录
    User login(String name,String password);
    //注册
    boolean addUser(User s);
    //查询
    User findUser(String name);
    //删除
    boolean deleteUser(User user);
    //退出
    boolean quit();
    //抽奖
    String award(User user);
}
