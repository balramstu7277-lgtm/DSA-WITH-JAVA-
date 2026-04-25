public class TwoSum2 {
    public static int[] Twosum(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        int[] ans = new int[2];
        while (start<=end){
            if(arr[start]+arr[end]==target){
                ans[0]= start;
                ans[1]= end;
                break;
            }
            if(arr[start]+arr[end]<target){
                start++;
            }else {
                end--;
            }

        }
        return ans;
    }
    public static void print(int []arr){
        for(int val:arr){
            System.out.print(val + " ") ;
        }
    }
    public static void main(String[] args){
        int []arr = {1,2,3,4,5,6,7,8,9} ;
        int []ans= Twosum(arr,11);
        print(ans);


    }
}
