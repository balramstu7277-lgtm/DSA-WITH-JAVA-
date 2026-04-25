package Recursion.src;

import java.util.Scanner;

public class print_natural_number {
    static void print_natural_number(int n)
    {
        if(n==1){
            System.out.println("1");
            return;
        }
        print_natural_number(n-1);
        System.out.println(n);
    }

    static void main() {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        print_natural_number(number);
    }

}
