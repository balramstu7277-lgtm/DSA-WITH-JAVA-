package multidimentional_Array;

import java.util.Scanner;

public class prefixSum_in_2d {
    public static int prefixSum(int [][]arr , int l1 , int r1 , int l2 , int r2 ){
        int sum = 0 ;
        for (int i = l1 ; i<=l2;i++)
        {
            for (int j = r1 ; j<= r2 ; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    // method 2
    public static void findprefixsum(int [][]arr){
        for(int i = 0 ; i< arr.length;i++){
            for (int j = 1 ; j < arr[0].length; j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    public static int prefixSum_method2(int [][]arr , int l1 , int r1 , int l2 , int r2 ){
        int sum = 0;
        findprefixsum(arr);
        for (int i = l1 ; i <=l2 ;i++) {
            if (r1 >= 1) {
                sum += arr[i][r2] - arr[i][r1 - 1];
            }
            else {
                sum+=arr[i][r2];
            }
        }
        return sum ;
    }
    // method 3 of prefix Sum in 2d array
    public static void prefixSum3rdMethod(int[][]arr){
        for (int i = 1 ; i < arr.length;i++){
            for (int j = i-1 ; j < arr[i].length;j++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    //method 3
    public static int prefixSum_method3rd(int [][]arr , int l1 , int r1 , int l2 , int r2 ){
        int ans = 0 , sum = 0, up  = 0, left = 0 ,leftup = 0;
        prefixSum3rdMethod(arr);
        sum = arr[l2][r2];
        if(r1>1)
            left = arr[l2][r1-1];
        if (l1>1)
            up=arr[l1-1][r2];
        if (l1>1&&r1>1)
            leftup=arr[l1-1][r1-1];

        ans = sum - up - left + leftup;

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter of Row and column of matrix ");
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] matrix = new int[row][col];
        int totalElement = row *col;
        System.out.println("please enter " + totalElement+"Element");
        for (int i = 0 ; i< row ; i++){
            for (int j = 0 ; j<col;j++){
                matrix[i][j]= input.nextInt();
            }
        }
        System.out.println("pleasr enter a rectangle boundary ");
        int l1 = input.nextInt();
        int r1 = input.nextInt();
        int l2 = input.nextInt();
        int r2 = input.nextInt();
        System.out.println("Rectangular sum "+ prefixSum(matrix,l1,r1,l2,r2));
        System.out.println("Rectangular sum "+ prefixSum_method2(matrix,l1,r1,l2,r2));
        System.out.println("Rectangular sum "+ prefixSum_method3rd(matrix,l1,r1,l2,r2));

    }
}
