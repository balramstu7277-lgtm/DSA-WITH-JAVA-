package Array_basic;

import java.util.Scanner;

public class array_manuplation_of_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to java_basic.array manipulation");
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("please enter a " + i + " element :-");
            arr[i] = input.nextInt();
        }
        array_manipulation(arr);
        System.out.println("unique element "+ num);

    }
    static int num = -1;
    public static int array_manipulation(int [] arr){
        int n = arr.length;

        for (int i= 0 ; i<n;i++){
            for (int j= i+1; j<n; j++ ){
                if (arr[i]==arr[j]){
                    arr[i]= -1;
                    arr[j]= -1;
                }
            }
        }
        for (int i= 0 ; i<n;i++){
            if (arr[i]>0){
                num = arr[i];
            }
        }
        return num;
    }
}
