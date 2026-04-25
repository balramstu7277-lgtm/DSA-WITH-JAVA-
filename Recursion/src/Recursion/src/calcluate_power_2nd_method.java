package Recursion.src;

import java.util.Scanner;

public class calcluate_power_2nd_method {
    // second method
    static int power (int p , int q){
        // Base case
        if (q==0) {
            return 1;
        }
        // recursive relation
       // if power is even
        if(q%2 == 0){
            return power(p,q/2)*power(p,q/2);
        }
        // if power is odd then
        else {
            return power(p,q/2)*power(p,q/2)*p;
        }

    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int p = input.nextInt();
        System.out.println("Enter a power ");
        int q = input.nextInt();
        System.out.println(power(p,q));

    }
}
