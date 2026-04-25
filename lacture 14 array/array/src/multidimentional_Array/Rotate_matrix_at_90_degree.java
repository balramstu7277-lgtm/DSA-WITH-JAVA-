package multidimentional_Array;

import java.util.Scanner;

public class Rotate_matrix_at_90_degree {

    // Non-square matrix transpose (new matrix banayega)
    public static int[][] transpose_matrix(int[][] arr, int row, int col) {
        int[][] ans = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    public static void reverse (int[]arr ){
        int i = 0 , j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }

    public static int[][] rotate(int [][]arr, int row ) {
        // transpose of a matrix
       arr = transpose_matrix(arr,row,arr[0].length);

        //reverse of a matrix
        for (int i = 0 ; i < row; i++){
            reverse(arr[i]);
        }

    return arr;
    }



    // Matrix print karne ka method
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Input lene ka method
    public static void input(int[][] arr, Scanner input) {
        System.out.println("Please enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = input.nextInt();

        System.out.println("Enter number of columns:");
        int col = input.nextInt();

        int[][] arr = new int[row][col];
        input(arr, input);

       int [][] ans =rotate(arr,row);
        System.out.println("Rotate matrix at 90 degree ");
        print(ans);


    }
}
