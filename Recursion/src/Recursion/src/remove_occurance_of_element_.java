package Recursion.src;

import com.sun.jdi.InconsistentDebugInfoException;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.Scanner;

public class remove_occurance_of_element_ {
    // without passing index
    static String removeChar (String st , char s){
        if(st.length()== 0){
            return "";
        }
        String SmallAnswer = removeChar(st.substring(1), s); //  Remove all occurrence form index 1 to end
        char cureent = st.charAt(0);// To find current element on String
        // self work
        if(cureent != s){
            return cureent+ SmallAnswer; // add current element on substring
        }else {
            return SmallAnswer;
        }

    }
    static String remove(String str ,int index ,char s){
        // base case
        if(index == str.length()){
            return "";
        }
        // Recursive work
        String samllAnswer = remove(str, index+1, s);
        char current = str.charAt(index);
        // self work
        if(str.charAt(index)!=s){
            return current + samllAnswer;
        }
        else {
            return samllAnswer;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string");
        String str = input.nextLine();
        System.out.println(remove(str, 0, 'a'));
        System.out.println(removeChar(str, 'a'));

    }
}
