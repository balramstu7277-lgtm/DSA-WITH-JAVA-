package multidimentional_Array;

import java.util.Scanner;

public class Multiplication_of_two_matrix {

    public static void multiply(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible.");
            return;
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        print(result);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // new line after each row
        }
    }

    public static void input(int[][] arr, Scanner input) {
        System.out.println("Please enter " + arr.length + "x" + arr[0].length + " matrix elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First matrix dimensions
        System.out.println("Enter rows and columns for first matrix:");
        int r1 = input.nextInt();
        int c1 = input.nextInt();

        // Second matrix dimensions
        System.out.println("Enter rows and columns for second matrix:");
        int r2 = input.nextInt();
        int c2 = input.nextInt();

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];

        input(arr1, input);
        input(arr2, input);

        multiply(arr1, r1, c1, arr2, r2, c2);

        input.close();
    }
}
