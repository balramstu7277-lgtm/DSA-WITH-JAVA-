package Recursion.src;

import java.util.Scanner;
import java.util.Stack;

public class print_sum_of_n_number {
    public static void print(int num){
        if(num==1){
            System.out.println("1");
            return;
        }
        print(num -1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plrase enter a number ");
        int number = input.nextInt();
        print(number);
    }
}
