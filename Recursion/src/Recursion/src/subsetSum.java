package Recursion.src;

import jdk.dynalink.beans.StaticClass;

public class subsetSum {
    public static  void subsetSum(int[]arr, int n,int idx,int sum ){
        //base case
        if(idx >= n){
            System.out.println(sum);
            return;
        }

        // current index +sum
        subsetSum(arr,n, idx+1 ,sum+arr[idx]);// include
        subsetSum(arr, n, idx+1, sum); // exclude

    }

    static void main() {
        int []arr = {2,4,5};
        subsetSum(arr,arr.length,0, 0);
    }
}
