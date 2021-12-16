package DataStructure.DoubleLinkedList;

public class DoubleLinkedListDemo {
    private HeroNode2 head;
    private HeroNode2 tail;
    public DoubleLinkedListDemo() {
        head = new HeroNode2(0,"","");
        tail = head;
    }

    /**
     * 添加节点
     * @param heroNode
     * @return
     */
    public boolean add(HeroNode2 heroNode){
        /*方式一*/
        if(tail==null){
            System.out.println("链表为null");
            return false;
        }
        heroNode.pre = tail;
        tail.next = heroNode;
        tail = tail.next;
       /*方式二
       HeroNode2 temp = head;
        if(temp == null){
            System.out.println("链表为null");
            return false;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = heroNode;*/
        return true;
    }

    /**
     * 头部添加节点
     * @param heroNode
     * @return
     */
    public boolean headAdd(HeroNode2 heroNode){
        head.next.pre = heroNode;
        heroNode.next = head.next;
        head.next =heroNode;
        return true;
    }

    /**
     * 删除节点
     * @param no
     * @return
     */
    public boolean del(int no){
        if(no == 0){
            System.out.println("下标序号从1开始");
            return false;
        }
        HeroNode2 temp = head;
        while(temp != null){
            if(temp.no == no){
                if(temp.pre!=null){
                    temp.pre.next = temp.next;
                }else{
                    head.next = temp.next;
                }
                if (temp.next!=null) {
                    temp.next.pre = temp.pre;
                }else{
                    temp.next.pre = temp.pre;

                }
                return true;
            }
            temp = temp.next;
        }
        System.out.println("序号不存在！");
        return false;
    }

    /**
     * 修改
     * @param no
     * @param name
     * @param nick
     * @return
     */
    public boolean set(int no,String name,String nick){
        HeroNode2 temp = head;
        while(temp != null){
            if(temp.no == no){
                temp.nickName = nick;
                temp.name = name;
                return true;
            }
            temp = temp.next;
        }
        System.out.println("未找到该序号！");
        return false;
    }
    /**
     * 遍历节点
     */
    public void getall(){
        HeroNode2 temp = head;
        while(temp.next != null){
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
}
class HeroNode2{
    public int no;
    public String name;
    public String nickName;
    public HeroNode2 next;
    public HeroNode2 pre;

    public HeroNode2(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
class test{
    public static void main(String[]args){
        HeroNode2 h1 = new HeroNode2(1,"林冲","豹子头");
        HeroNode2 h2 = new HeroNode2(2,"松江","及时雨");
        HeroNode2 h3 = new HeroNode2(3,"吴用","智多星");
        HeroNode2 h4 = new HeroNode2(4,"吴","智多星");
        DoubleLinkedListDemo list = new DoubleLinkedListDemo();
        list.add(h1);
        list.headAdd(h3);
        list.add(h2);
        list.headAdd(h4);
        list.getall();
        System.out.println("-----------");
        list.set(4,"小吴","足智多谋");
        list.set(2,"小吴","足智多谋");
        list.getall();
    }
}