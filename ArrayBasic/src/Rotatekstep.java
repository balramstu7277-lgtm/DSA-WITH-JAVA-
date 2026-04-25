public class Rotatekstep {
     public static int[] rotatekStep(int[]arr,int k){
         int n = arr.length;
         k = k%n;
         int []ans = new int[n];
         int j = 0;
         for(int i = n-k;i<n;i++){
             ans[j]=arr[i];
             j++;
         }
         for(int i =0 ;i <n-k;i++){
             ans[j]=arr[i];
             j++;
         }
         return ans;
     }
     public static void diplay(int[]arr){
         for(int val:arr){
             System.out.print(val);
         }
     }
    public static void main(String[] args){
        int[]arr = {1,2,3,4,5,6};
        diplay(arr);
        System.out.println("");
        int[] ans = rotatekStep(arr,3);
        diplay(ans);
    }
}
