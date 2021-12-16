import java.util.*;
public class marge{
    static int n;
    static int[] temp;
    static int[] arr;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        n = 100000;
        arr = new int[n];
        temp = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = new Random().nextInt(1000000);
        }
        sort(0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    private static void sort(int left,int right){
        if(left >= right){
            return ;
        }
        int mid  = (left+right)>>1;
        int i = left;
        int j = mid+1;
        int index = 0;
        sort(left,mid);
        sort(mid+1,right);
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[index++] = arr[i++];
            }else if(arr[j] <= arr[i]){
                temp[index++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[index++] = arr[i++];
        }
        while(j <= right){
            temp[index++] = arr[j++];
        }
        index = 0;
        int leftIndex = left;
        while(leftIndex <= right){
            arr[leftIndex++] =  temp[index++];
        }
    }

    private static void function1(int left,int right){
        int mid = (left+right)/2;
        while(left < right){
            function1(left, mid);
            function1(mid+1, right);
            function2(left, mid, right-1);
        }
    }
    private static void function2(int left,int mid,int right){
        int i = left;
        int j = mid+1;
        int index = 0;
        while(i <= mid&&j <= right){
            if(arr[i] <= arr[j]){
                temp[index++] = arr[i++];
            }else{
                temp[index++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[index++] = arr[i++];
        }
        while(j <= right){
            temp[index++] = arr[j++];
        }
        index = 0;
        int TempLeft = left;
        while(TempLeft <= right){
            arr[TempLeft++] = temp[index++];
        }
    }
}