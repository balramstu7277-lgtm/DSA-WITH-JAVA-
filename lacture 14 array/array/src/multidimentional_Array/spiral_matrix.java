package multidimentional_Array;

import java.util.Scanner;

public class spiral_matrix {
public static void print(int [][] arr ){
    for(int i = 0 ; i <arr.length;i++){
        for (int j = 0 ; j < arr[i].length;j++){
            System.out.println(arr[i][j]+" ");
        }
        System.out.println();
    }
}
public static void print_spiral_order(int [][]arr, int row , int col){
    int topRow = 0 ,bottomRow = row- 1, leftcol = 0 , rightCol = col -1;
    int totalElement = 0;
    while (totalElement<row*col){
        // topRow --> leftCol to rightCol;
        for (int j = leftcol;j<=rightCol&&totalElement<row*col;j++){
            System.out.print(arr[topRow][j]+" ");
            totalElement++;
        }
        topRow++;
        // rightCOl --> topRow to bottomRow
        for (int i = topRow; i<=bottomRow && totalElement<row*col;i++ )
        {
            System.out.print(arr[i][rightCol]+" ");
            totalElement++;
        }
        rightCol--;
        //bottomRow --> rightCol to leftCol
        for (int j = rightCol; j>=leftcol && totalElement<row*col;j--){
            System.out.print(arr[bottomRow][j]+ " ");
            totalElement++;
        }
        bottomRow--;
        //leftCol --> bottomRow to topRow
        for (int i = bottomRow; i >=topRow && totalElement<row*col;i--){
            System.out.print(arr[i][leftcol]+ " ");
            totalElement++;
        }
        leftcol++;
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter arow and column of matrix");
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] matrix = new int[row][col];
        int total = row*col;
        System.out.println("plrase enter a "+total+"value");
        for (int i = 0 ;i <row ; i++){
            for (int j = 0 ; j<col ; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("input matrix ");
        print(matrix);
        System.out.println("spiral order ");
        print_spiral_order(matrix,row,col);
    }
}
