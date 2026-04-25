package Recursion.src;

import java.util.Scanner;

public class fibonacci {
    static int fibonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 0 ; i<number; i++){
            System.out.println(fibonacci(i));
        }
    }
}
