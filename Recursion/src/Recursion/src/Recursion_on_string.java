package Recursion.src;

import java.util.Scanner;

public class Recursion_on_string {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a name ");
        String name = input.nextLine();
        System.out.println(name);
        // print all the character like as array
        for(int i = 0 ; i <name.length();i++){
            System.out.println(name.charAt(i));
        }

        // print substring
        String s = "Balram";
        System.out.println(s.substring(1,4));// [1,4)
        System.out.println(s.substring(2)); // end index is optional


    }
}
