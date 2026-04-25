package Recursion.src;

import java.util.Scanner;

public class sum_of_number {
    static int sum (int n){
        if(n==0){
           return 0;
        }
       return  sum(n-1)+n;

    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();
        System.out.println(sum(num));
    }
}
