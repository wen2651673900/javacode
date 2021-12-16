package DataStructure.LinkedList;


public class SingleLinkedList {
    public static void main(String[] arg){
        list l = new list();
        HeroNode h1 = new HeroNode(1, "松江", "及时雨");
        HeroNode h2 = new HeroNode(2, "林冲", "豹子头");
        HeroNode h3 = new HeroNode(3, "吴用", "智多星");
        HeroNode h5 = new HeroNode(3, "小吴", "智多星！");
        HeroNode h4 = new HeroNode(4, "吴用", "智多星");
//        l.add(h1);
//        l.add(h2);
//        l.add(h3);
        l.addSort(h1);
        l.addSort(h3);
        l.addSort(h2);
        l.addSort(h4);
        l.getAll();
        System.out.println("-------------");
        l.del(1);
        l.del(4);
        l.getAll();
        System.out.println("----------");
        l.update(h5);
        l.getAll();
    }
}
class list{
    HeroNode node;
    public list(){
        node = new HeroNode(0, "", "");
    }

    /**
     * 添加节点
     * @param node
     * @return
     */
    public boolean add(HeroNode node){
        HeroNode temp = this.node;
        if(this.node==null){
            System.out.println("list未初始化!");
            return false;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        return true;
    }

    /**
     * 有序地添加节点
     * @param heroNode
     */
    public void addSort(HeroNode heroNode){
        HeroNode temp = node;
        boolean flag = false;
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next.on > heroNode.on){
                flag = true;
                break;
            }else if(temp.next.on == heroNode.on){
                System.out.println("序号已存在");
                return;
            }
            temp = temp.next;
        }
        if(flag){
            heroNode.next = temp.next;
            temp.next = heroNode;
        }else{
            temp.next = heroNode;
        }
    }

    /**
     * 删除指定节点
     * @param on
     * @return
     */
    public boolean del(int on){
        HeroNode temp = node;
        if(temp.next==null){
            System.out.println("链表为空");
            return false;
        }
        while(true){
            if(temp.next == null){
                System.out.println("序号不存在！");
                return false;
            }
            if(temp.next.on == on){
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
    }
    /**
     * 修改链表
     * @param newHeroNode
     * @return
     */
    public boolean update(HeroNode newHeroNode){
        HeroNode temp = node;
        while(true){
            if(temp.next == null){
                return  false;
            }
            if(temp.next.on == newHeroNode.on){
                temp.next.nickName = newHeroNode.nickName;
                temp.next.name = newHeroNode.name;
                return true;
            }
            temp = temp.next;
        }
    }


    /**
     * 遍历链表
     */
    public void getAll(){
        HeroNode temp = node;
        while(temp.next != null){
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
}
class HeroNode{
    public int on;//序号
    public String name;//名称
    public String nickName;//昵称
    HeroNode next;//下一个节点
    public HeroNode(int no,String name,String nickName){
        this.on = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + on +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
