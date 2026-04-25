package prefix_array;

import java.util.Scanner;

public class divide_array_in_two_equal_sets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a size of array");
        int size = input.nextInt();
        int[] arr = new int[size+1];
        System.out.print("please enter a " +size+ " elements :-");
        for (int i = 1; i <= size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Equal partition possible : " + equalSumPartition(arr));
    }

    public static boolean equalSumPartition(int []arr){
        int totalsum = findArraysum(arr);

        int prefixsum = 0;
        for (int i = 0 ; i <arr.length;i++){
            prefixsum += arr[i];
            int suffixsum =totalsum - prefixsum;
            if (suffixsum==prefixsum){
                return true;
            }
        }
        return false;
    }
    public static int findArraysum(int[] arr){
        int totalsum = 0;
        for (int i =0 ; i< arr.length; i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
}
