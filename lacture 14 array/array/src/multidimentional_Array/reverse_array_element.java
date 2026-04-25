package multidimentional_Array;

import java.util.Scanner;

public class reverse_array_element {
    public static void reverse(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {  // ✅ Har row ke liye
            for (int j = 0; j < col / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][col - 1 - j];
                arr[i][col - 1 - j] = temp;
            }
        }
    }
    public static void printMatrix(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a row and column ");
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] arr = new int[row][col];
        System.out.println("please enter a array element");
        for (int i = 0 ; i < row ; i++){
            for(int j = 0 ; j <col; j++){
               arr[i][j] = input.nextInt();
            }
        }
        reverse(arr,row,col);
     printMatrix(arr,row,col);

    }
}
