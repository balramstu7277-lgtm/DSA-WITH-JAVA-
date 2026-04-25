package Recursion.src;

import java.util.Scanner;

public class palindrome_number {
    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        int rev = reverse(num , 0);
        if(num == rev){
            System.out.println("number is palindrome number");
        }
        else{
            System.out.println("number is not a palindrome number");
        }
    }
}
