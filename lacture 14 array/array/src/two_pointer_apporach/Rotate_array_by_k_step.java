package two_pointer_apporach;

import java.util.Scanner;

public class Rotate_array_by_k_step {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("please enter a " + i + " element :-");
            arr[i] = input.nextInt();
        }
        System.out.println("please enter a value of k to Rotate a java_basic.array");
        int k = input.nextInt();
        System.out.println("Original java_basic.array :- ");
        print(arr);
        System.out.println();
        int [] ans = rotate(arr,k);
        System.out.println("Rotated java_basic.array :-");
        print(ans);


    }

    public static int[] rotate (int[] arr,int k ){
        int n = arr.length;
        k = k % n;
        int [] ans =new int[n];
        int j = 0;

        for (int i = n-k; i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i = 0; i<n-k;i++){
            ans[j++]= arr[i];
        }
        return ans;
    }
    public static void print(int []arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
