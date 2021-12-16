import java.util.*;

public class quick {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = 156413;
        }
        sort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int left,int right,int[] arr){
        if(left >= right){
            return ;
        }
        int mid = arr[left];
        int i = left-1;
        int j = right+1;
        while(i < j){
            do{
                i++;
            }while(arr[i] < mid);
            do{
                j--;
            }while(arr[j] > mid);
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        sort(left,j,arr);
        sort(j+1,right,arr);
    }
}
