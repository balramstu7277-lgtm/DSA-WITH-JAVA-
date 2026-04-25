package Recursion.src;

import java.lang.module.FindException;
import java.util.Scanner;

public class recursion_on_array {
   static void PrintArray(int []arr, int index){
       //base case
        if(index == arr.length){
            return;
        }
        //self Work
        System.out.println(arr[index]);
        // recursive work
        PrintArray(arr,index+1);
    }
    static void main(String[] args) {
        int []arr = {5,6,9,3,9};
        PrintArray(arr, 0);
    }
}
