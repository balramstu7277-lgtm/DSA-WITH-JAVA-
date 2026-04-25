package Recursion.src;

import java.util.Scanner;

public class fibonacci_question {
    static int fibbo (int n){
        //Base case
        if(n==0 || n == 1){
            return n;
        }
        //recursive relation
        return fibbo(n-1)+fibbo(n-2);
    }
    //main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(fibbo(i));
        }
    }
}
