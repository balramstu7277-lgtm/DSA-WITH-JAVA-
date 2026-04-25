package Recursion.src;

import java.util.Scanner;

public class sum_of_array {
    static int sum(int[]arr , int index){
        if (index == arr.length-1){
            return arr[index];
        }
        return  arr[index]+ sum(arr,index+1);
    }

    static void main() {
        int[] arr = {1,2,3,9,4};
        int sum= sum(arr,0);
        System.out.println(sum);
    }
}
