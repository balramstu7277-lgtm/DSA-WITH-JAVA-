package question;

import java.util.Scanner;

class Solution {
    public static  int[] getNoZeroIntegers(int n) {
        for (int a = 1 ; a< n ; a++){
            int b = n - a ;
            if(isValid(a) && isValid(b)){
                return new int[]{a, b};
            }
        }
        return new int[0];
    }
    public static boolean isValid(int num){
        while (num>0){
            if (num % 10 == 0 ){
                return false;
            }
            else {
                num = num / 10;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number :- ");
        int num = input.nextInt();
        int [] ans = getNoZeroIntegers(num);
        for(int i = 0 ; i < ans.length; i++){
            System.out.print(ans[i]);
        }

    }
}
