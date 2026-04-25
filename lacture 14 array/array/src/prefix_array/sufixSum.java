package prefix_array;

import java.util.Scanner;

public class sufixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a size of array");
        int size = input.nextInt();
        int[] arr = new int[size+1];
        System.out.print("please enter a " +size+ " elements :-");
        for (int i = 1; i <= size; i++) {
            arr[i] = input.nextInt();
        }
        int[] suffixsum = suffix_sum(arr);
        print(suffixsum);


    }
    public static int [] suffix_sum (int [] arr){
        int n = arr.length;
        for(int i = n-2; i >= 1 ;i--){
            arr[i]= arr[i] + arr[i+1];
        }
        return arr;
    }
    public static void print(int [] arr){
        for (int i = 1 ; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
