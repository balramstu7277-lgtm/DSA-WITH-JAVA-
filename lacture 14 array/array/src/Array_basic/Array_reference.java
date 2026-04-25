package Array_basic;

import java.util.Arrays;

public class Array_reference {
    public static void main(String[] args) {
        System.out.println("java_basic.array reference ");
        int [] arr = {5,6,9,8,5,9,6,3};
        print_array(arr);
        System.out.println();
        System.out.println("original java_basic.array");
        //int [] arr_2 = arr;//shallow copy valur change in original value
        //int [] arr_2 = arr.clone();
        int [] arr_2 = Arrays.copyOf(arr,arr.length);
        print_array(arr);

        System.out.println("before change the value of java_basic.array ");

        change_array(arr_2);//change function call
        System.out.println();
        System.out.println("after change the value of java_basic.array ");
        print_array(arr);

    }
    public static void print_array(int[]arr){
        for (int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void change_array(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]=0);
        }
        System.out.println();
    }
}
