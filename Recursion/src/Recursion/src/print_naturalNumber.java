package Recursion.src;

import java.util.Scanner;

public class print_naturalNumber {
    public static void naturalNumber(int num){
        if (num ==1){
            System.out.println("1");
            return;
        }
        System.out.println(num);
        naturalNumber(num - 1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number>=1){
            System.out.println("invalid input please enter a valid input ");
        }
        naturalNumber(number);
    }
}
