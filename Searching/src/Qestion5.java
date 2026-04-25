import java.lang.reflect.GenericSignatureFormatError;

public class Qestion5 {
    static  boolean ispossible(int[]arr, int k , int dist ){
        int kidsplaced = 1;
        int lastkids = arr[0];
        for(int i = 1 ; i <arr.length; i++){
            if (arr[i] - lastkids >= dist){
                kidsplaced++;
                lastkids = arr[i];
            }
        }
        return kidsplaced >= k;

    }
    static int raceTrack(int[]arr , int k){
        if(k > arr.length){
            return -1;
        }
        int ans = 0 ,start = 0 , end = (int)1e9;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(ispossible(arr ,k , mid)){
                ans = mid;
                start = mid +1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int [] arr = {1,2,4,8,9};
        int k = 2;
        System.out.println(raceTrack(arr, k));
    }

}
