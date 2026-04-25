package multidimentional_Array;

import java.util.Scanner;

public class multidimentional_array_2d {

    public static void print (int[][] arr){
        for (int i = 0 ; i < arr.length;i++){
            for (int j = 0 ;j <arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void input (int[][] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a array element");
        for (int i = 0 ; i < arr.length;i++){
            for (int j = 0 ;j <arr[i].length;j++){
               arr[i][j] =input.nextInt();

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("please enter a row ");
        int row = input.nextInt();
        System.out.println("please enter a columns");
        int col = input.nextInt();

        int [] [] arr = new int [row][col];
        input(arr);
        System.out.println();
        print(arr);
    }
}
