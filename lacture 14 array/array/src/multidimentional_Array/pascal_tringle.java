package multidimentional_Array;

import java.util.Scanner;

public class pascal_tringle {
    public static int [][]pascal(int num){
        int [][] arr = new int[num][];
        for (int i = 0 ; i < num ; i++){
            // i th row has i + 1 column
            arr[i] = new int[i+1];
            // 1st and last element in every row is  1 ;
            arr[i][0]= arr[i][i]= 1;//ishka matlb hoya ki jo last or first element hao uako 1 kar diya according to pascal triangle
            for (int j = 1 ; j<i; j++){
                arr[i][j]= arr[i-1][j]+arr[i-1][j-1];
            }
        }
        return arr;
    }
    public static void print_matrix(int [][]arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j  = 0 ; j <arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number you want to print the pascal tringle ");
        int num = input.nextInt();
        int[][] ans = pascal(num);
        print_matrix(ans);
    }
}
