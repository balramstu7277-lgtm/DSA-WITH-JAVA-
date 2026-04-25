package Recursion.src;

import java.util.Scanner;

public class alternate_addition_and_subtraction {
    static int alternate(int n){
        // base case
        if(n==0){
            return 0;
        }
        // if number is even then value is negative
        if(n%2!=0) {
            return alternate(n - 1) + n;
        }
            return alternate(n-1) - n;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number ");
        int num = input.nextInt();
        System.out.println(alternate(num));

    }
}
