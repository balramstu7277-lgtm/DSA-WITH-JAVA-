package two_pointer_apporach;

import java.util.Scanner;

public class short_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("please enter a " + i + " element :-");
            arr[i] = input.nextInt();
        }
        System.out.println();
        System.out.print("original array :-");
        print(arr);
        System.out.println();
        sortZerosAndOnse(arr);
        System.out.println("shorted array :-");
        print(arr);


    }
    public static void sortZerosAndOnse(int[] arr){
        int n = arr.length;
        int zeroes = 0;

        //count number  of zeroes
        for (int i = 0 ; i<n ;i++){
            if (arr[i]==0){
                zeroes++;
            }
        }
        // 0 to zeroes - 1 : 0 to n-1 :1
        for (int i = 0 ;i<n;i++){
            if (i<zeroes){
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
    }

    public static void print (int[]arr){
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
