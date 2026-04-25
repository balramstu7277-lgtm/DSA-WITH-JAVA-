package Recursion.src;

import java.util.Scanner;

public class GCD_3rd_method {
    static int gcd (int x , int y ){
        if(y == 0){
            return x;
        }
        return gcd(y, x%y);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a first number");
        int x = input.nextInt();
        System.out.println("please enter a second number ");
        int y = input.nextInt();
        System.out.println(gcd(x, y));
    }
}
