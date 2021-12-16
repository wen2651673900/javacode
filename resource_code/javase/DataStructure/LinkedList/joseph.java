package DataStructure.LinkedList;

public class joseph {
    public static void main(String[] args) {
        CircleSingleLinedList list = new CircleSingleLinedList();
        list.add(5);
        list.countBoy(1,2,5);
    }
}
class CircleSingleLinedList{
    private boy first = null;
    public void add(int nums){
        if(nums < 1){
            System.out.println("n");
            return;
        }
        boy curBoy = first;
        for(int i = 1;i <= nums;i++){
            boy boy = new boy(i);
            if(i == 1){
                first = boy;
                boy.setNext(first);
                curBoy = boy;
            }else{
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }
    public void getboys(){
        if(first == null){
            System.out.println("null");
        }
        boy curboy = first;
        while(true){
            System.out.println(curboy.getNo());
            if(curboy.getNext()==first){
                break;
            }
            curboy = curboy.getNext();
        }
    }

    /**
     *
     * @param startNo   开始位置
     * @param cuntNum   每次移动位置
     * @param nums  一共有多少人
     */
    public void countBoy(int startNo,int cuntNum,int nums){
        /**
         * 移动位置不能小于一、链表对象不能为空、开始位置不能大于总数
         */
        if(startNo > nums||startNo < 1||first==null){
            System.out.println("n");
            return;
        }
        boy helper = first;//辅助指针
        /**
         * 将辅助指针指向最后一个节点
         */
        while(true){
            if(helper.getNext()==first){
                break;
            }
            helper = helper.getNext();
        }
        /**
         * 将first移至开始位置
         */
        for(int i = 0;i < startNo-1;i++){
            first = first.getNext();
            helper = helper.getNext();
        }
        /**
         * 如果辅助指针跟first指针指向是同一个是则就说明只剩下一个节点了
         */
        while(first.getNo()!=helper.getNo()){
            //移动数的次数少一次，因为第一个指向算一，所以算是数了一次
            for(int i = 0;i < cuntNum-1;i++){
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println("出圈小孩"+first.getNo());//循环结束就是要出去的人
            first = first.getNext();//然后出去的人的下一个就是下一次开始的位置
            helper.setNext(first);//这一步算就像第一步一样移动到开始位置
        }
    }
}
class boy{
    private int no;
    private boy next;

    public boy(int no) {
        this.no = no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNext(boy next) {
        this.next = next;
    }

    public int getNo() {
        return no;
    }

    public boy getNext() {
        return next;
    }


}
