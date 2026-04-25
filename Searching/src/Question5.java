public class Question5 {
    static boolean Distributcho(int[]arr, int  m , int maxcho){
        int nmStudent = 1;
        int choc = 0; // number of  choc current student has
        for(int i = 0 ; i < arr.length; i ++){
             if(arr[i]>maxcho){
                 return false;
             }
             if(choc + arr[i] <= maxcho){
                 choc+=arr[i];
             }
             else {
                 nmStudent++;
                 choc = arr[i];
             }
        }
        return nmStudent <= m;

    }
    static int distributechocolet(int[]arr , int m){
        int n = arr.length;
        int ans = 0,start = 0 , end = (int)1e9;
        if(n<m){
            return -1;
        }
        while(start<= end){
            int mid = start + (end - start)/2;
            if(Distributcho(arr,m, mid)){
                ans = mid;
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        int []arr = {5,3,1,4,2};
        int [] arr2 ={12,34,67,90};
        int m = 3; // number of student
        System.out.println(distributechocolet(arr2,m));

    }
}
