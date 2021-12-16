import java.util.*;
public class oj1250{
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<>();
        flag:for(int i = 1;i <= 50;i++){
            int temp = i;
            while(temp > 0){
                if(temp %10 == 4){
                    continue flag;
                }
                temp /= 10;
            }
            set.add(i);
        }
        System.out.println(set.size());
    }
}
