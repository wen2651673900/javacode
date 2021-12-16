import java.util.*;
public class b {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int[][] result = new int[q][];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < q;i++){
            int target = sc.nextInt();
            int[] temp = find(0,n-1,target,arr);
            result[i] = temp;
        }
        for(int i = 0;i < q;i++){
            System.out.println(result[i][0]+" "+result[i][1]);
        }
    }
    public static int[] find(int left,int right,int target,int[] arr){
        int[] temp = new int[2];
        temp[0] = -1;
        temp[1] = -1;
        int mid = (left+right)>>1;
        if(left >= right&&arr[mid]!=target){
            return temp;
        }
        if(arr[mid] < target){
            return find(mid+1,right,target,arr);
        }else if (arr[mid] > target){
            return find(left,mid-1,target,arr);
        }else if(arr[mid] == target){
            int start = mid;
            int end = mid;
            while(end+1<arr.length&&arr[end+1] == target)end++;
            while(start-1>=0&&arr[start-1] == target)start--;
            temp[0] = start;
            temp[1] = end;
            return temp;
        }
        return new int[2];
    }
}