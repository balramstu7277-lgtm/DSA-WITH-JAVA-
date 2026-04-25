package Recursion.src;

import java.util.Scanner;

public class calculate_power {
    static double power (int p , int q){
        // base case
        if(q==0){
            return 1;
        }
        // if power is negative
        if (q<0){
            return 1.0/ power(p,-q);
        }
        // recursive relation
       return power(p,q-1)*p;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int p = input.nextInt();
        System.out.println("enter a power");
        int q = input.nextInt();
        System.out.println("power of number is "+power(p,q));
    }
}
