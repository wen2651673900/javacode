public class twofind {
    public static void main(String[]args){
        int[] arr = {1,2,8,9,10,22,36,55};
        System.out.println(Find(100,0,arr.length-1,arr));
    }
    public static int Find(int target,int left,int right,int[] arr){
        if(left > right){
            return -1;
        }
        int mid = (left+right)>>1;
        if(mid > left && arr[mid] > target){
            return Find(target,left,mid-1,arr);
        }else if(mid < right && arr[mid] < target){
            return Find(target,mid+1,right,arr);
        }else if(arr[mid] == target){
            return mid;
        }else{
            return -1;
        }
    }
}
