package Recursion.src;

import java.util.Scanner;

public class PrintMultiple {
    static void multiple(int n , int k){
        // base case
        if(k==0){
            System.out.println(n);
            return ;
        }
        // recursive relation
        multiple(n,k-1) ;
        // self work
        System.out.println(n*k);
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print a multiple ");
        int n = input.nextInt();
        System.out.println("Enter a value of k ");
        int k = input.nextInt();
        multiple(n, k);
    }
}
