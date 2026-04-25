package Recursion.src;

import java.util.Scanner;

public class number_of_digit {
    static int count(int n){
        if(n>=0&&n<=9){
            return 1;
        }
        return 1 + count(n/10);
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        System.out.println(count(number));
    }
}
