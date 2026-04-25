package prefix_array;

import java.util.Scanner;

public class Range_Query {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a size of array");
        int size = input.nextInt();
        int[] arr = new int[size+1];
        System.out.print("please enter a " +size+ " elements :-");
        for (int i = 1; i <= size; i++) {
            arr[i] = input.nextInt();
        }
        int[] prefSum = makePrefixArray(arr);
        System.out.println("please enter a Query ");
        int k = input.nextInt();
        while (k-- > 0){
            System.out.println("enter a range ");
            int l = input.nextInt();// l denote a left side;
            int r = input.nextInt();// r denote a right side ;
            int ans ;
            if (l==0){
             ans =prefSum[r];
            }
            else
            {
                ans = prefSum[r]-prefSum[l-1];
            }
            System.out.println("Sum from index " + l + " to " + r + " is: " + ans);
        }

    }
    public static int[] makePrefixArray(int[]arr){
        int n = arr.length;
        for (int i = 1 ; i < n ; i++){
            arr[i]= arr[i]+arr[i- 1];
        }
            return arr;
    }
}
