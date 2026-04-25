package Recursion.src;

import java.util.Scanner;

public class factorial {
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int smallproblem = factorial(n-1);
        return n*smallproblem;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        System.out.println(factorial(number));
    }
}
