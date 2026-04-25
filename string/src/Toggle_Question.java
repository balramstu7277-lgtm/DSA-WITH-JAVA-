import java.util.*;

public class Toggle_Question {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // Toggle
        for(int i = 0 ; i <str.length()-1;i++){
            // check latter is capital or small
            boolean flag = true; // true for capital
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asic = (int)ch;
            if(asic >= 97) flag =  false; // small letter
            if(flag == true){
                asic += 32;
                char dh = (char)asic;
                str.setCharAt(i, dh);
            }
            else {
                asic -= 32;
                char dh = (char) asic;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}
