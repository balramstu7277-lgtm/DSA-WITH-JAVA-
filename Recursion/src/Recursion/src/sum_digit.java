package Recursion.src;

import java.util.Scanner;

public class sum_digit {
    static int sum (int n){
        if(n >=0 && n<=9){
            return n;
        }
        return sum(n/10)+sum(n%10);
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        System.out.println(sum(number));
    }
}
