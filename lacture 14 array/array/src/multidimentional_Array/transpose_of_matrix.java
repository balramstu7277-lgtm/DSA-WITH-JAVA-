package multidimentional_Array;

import java.util.Scanner;

public class transpose_of_matrix {

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

    // Square matrix transpose (in-place swap)
    public static void transpose_swap_method(int[][] arr, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = i ; j < row; j++) { // j=i+1 se swap double nahi hoga
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
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

        System.out.println("Original matrix:");
        print(arr);

        System.out.println("Transpose of the matrix:");
        if (row == col) {
            // Square matrix ke liye in-place transpose
            transpose_swap_method(arr, row);
            print(arr);
        } else {
            // Non-square matrix ke liye nayi matrix banake transpose karo
            int[][] ans = transpose_matrix(arr, row, col);
            print(ans);
        }

        input.close();
    }
}
