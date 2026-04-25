package multidimentional_Array;

import java.util.Scanner;

public class spiral_matrix_generate_anticlockwise {
public static void print(int [][] arr ){
    for(int i = 0 ; i <arr.length;i++){
        for (int j = 0 ; j < arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
public static int [][] print_spiral_order(int num ){
    int topRow = 0 ,bottomRow = num- 1, leftcol = 0 , rightCol = num -1;
    int current = 1;
    int [][]arr = new int[num][num];
    while (current<=num*num){
       //leftcol -- > toprow to bottomRow
        for (int i = topRow;i<=bottomRow && current<= num*num;i++){
            arr[i][leftcol]= current++;
        }
        leftcol++;

        // bottomRow --> leftcol to rightcol
        for (int j = leftcol ; j<= rightCol && current<= num*num;j++){
            arr[bottomRow][j]= current++;
        }
        bottomRow--;
        // rightcol --> bottomRow to toprow
        for (int i = bottomRow ; i >= topRow && current<= num*num;i--){
            arr[i][rightCol]= current++;
        }
        rightCol--;
        // toprow --> rightcol to leftcol
        for (int i = rightCol; i>= leftcol && current<=num*num;i--){
            arr[topRow][i]= current++;
        }
        topRow++;
    }
    return arr;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number you want ot generate a number");
        int num = input.nextInt();
        int [][]spiral= print_spiral_order(num);
        print(spiral);

    }
}
