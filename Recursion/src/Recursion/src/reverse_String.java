package Recursion.src;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class reverse_String {
    static String reverse(String str , int index){
        //Base case
        if(index == str.length()){
            return"";
        }
        String smallAns = reverse(str, index+1);
        return smallAns + str.charAt(index);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a string :- ");
        String str = input.nextLine();
        System.out.println(reverse(str, 0));

    }
}
