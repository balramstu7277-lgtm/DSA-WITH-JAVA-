package Array_basic;

import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i]= input.nextInt();
        }
    }
}
