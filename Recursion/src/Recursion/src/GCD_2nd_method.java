package Recursion.src;

import java.util.Scanner;

public class GCD_2nd_method {
    static int gratest(int x,int y){
        while (x%y!=0){
            int remender = x%y;
            x = y ;
            y = remender;

        }
        return y;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a first number ");
        int x = input.nextInt();
        System.out.println("Enter a second number ");
        int y = input.nextInt();
        System.out.println(gratest(x,y));
    }
}
