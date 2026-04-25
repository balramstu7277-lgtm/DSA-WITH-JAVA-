package two_pointer_apporach;

import java.util.Scanner;

public class short_array_2nd_method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("please enter a " + i + " element :-");
            arr[i] = input.nextInt();
        }
        System.out.print("original array :- ");
        print(arr);
        System.out.println();
        sort2ndMethod(arr);
        System.out.println("Sorted array :- ");
        print(arr);

    }
    public static void sort2ndMethod(int[]arr){
        int left = 0 ;
        int right = arr.length-1;
        while (left<right){
            if (arr[left]==0){
                left++;
            } else if (arr[right]==1) {
                right--;
            }
            else
            {
                swap(arr,left,right);
                left++;
                right--;
            }
        }
    }
    public static void swap(int[]arr,int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public static void print (int[]arr){
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
