package Recursion.src;

import java.util.Scanner;

public class plandrome_string {
    static String plandrome (String str , int index){
        if(index == str.length()){
            return "";
        }
        String SmallAns = plandrome(str, index+1);
        return SmallAns + str.charAt(index);
    }
//  static boolean plandrome2(String str , int l , int r){
//        //if(l>=r){
//            return true;
//        }
//        return (str.charAt(l) == str.charAt(r)  && plandrome2(str, l+1, r-1));
//    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = input.nextLine();
        String reverse = plandrome(s, 0);
        System.out.println(reverse);
        if(reverse.equals(s)){
            System.out.println("String  is planderome number");
        }
        else {
            System.out.println("String  is not a plandrome ");
        }
        //System.out.println(plandrome2(s, 0, s.length()-1));
    }
}
