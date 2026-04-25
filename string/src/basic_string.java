import java.util.Scanner;

public class basic_string {
    public static void main(String[] args){
        // take input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();// take complete input
        String name2 = sc.next(); // space ka bad read nahi karta  hai
        System.out.println(name);
        System.out.println(name2);

        // function to find length of string

        String str = "balram";
        System.out.println(str.length()); // print length of string
        char ch = str.charAt(3); // to access the character from string
        System.out.println(ch);

        // find index of a character
        System.out.println(str.indexOf('a')); // print index first occurrence of a character




    }
}
