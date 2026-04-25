package multidimentional_Array;

import java.util.Scanner;

public class spiral_matrix_code_practic {
    public static int [][] generate_spiral_matrix (int num) {
        int topRow = 0, leftcol = 0, bottomRow = num - 1, rightCol = num - 1;
        int[][] arr = new int[num][num];
        int current = 1;
        while (current <= num * num) {
            //topRow --> lefcol  to rightcol ;
            for (int j = leftcol; j <= rightCol && current <= num * num; j++) {
                arr[topRow][j] = current;
                current++;
            }
            topRow++;
            //rightcol --> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= num * num; i++) {
                arr[i][rightCol] = current;
                current++;
            }
            rightCol--;
            //bottomrow --> rightcol to leftcol
            for (int j = rightCol; j >= leftcol && current <= num * num; j--) {
                arr[bottomRow][j] = current;
                current++;
            }
            bottomRow--;
            // lrftcol = buttomrow  to toprow
            for (int i = bottomRow; i >= topRow && current <= num * num; i--) {
                arr[i][leftcol] = current;
                current++;
            }
            leftcol++;
        }
        return arr;
    }
    public static void print(int [][] arr ){
        for(int i = 0 ; i <arr.length;i++){
            for (int j = 0 ; j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number you want to generate a spiral matrix");
        int num = input.nextInt();
        int [][]spiral = generate_spiral_matrix(num);
        print(spiral);

    }
}
