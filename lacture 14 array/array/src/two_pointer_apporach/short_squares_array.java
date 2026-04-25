package two_pointer_apporach;

import java.util.Scanner;

public class short_squares_array {
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
        int ans[] = sortSquare(arr);
        System.out.println("Sorted array :- ");
        print(ans);

    }
    public static int [] sortSquare(int[]arr){
        int n = arr.length;
        int left = 0 ;
        int right = n-1 ;
        int [] ans = new int[n];
        int k = n-1 ;

        while (left <= right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=  arr[left]*arr[left];
                left++;
            }
            else {
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void swap(int[]arr,int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void reverse (int[]arr){
        int i = 0 ;
        int j = arr.length-1;
        swap(arr,i,j);
        i++;
        j--;
    }

    public static void print (int[]arr){
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
