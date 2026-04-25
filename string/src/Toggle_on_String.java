import jdk.dynalink.beans.StaticClass;

import java.time.chrono.IsoChronology;

public class Toggle_on_String {
    public static void main(String[]args){
        String str = "Balram";
        for(int i = 0 ; i < str.length();i++){
            boolean flag = true ; // for capital
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asci = (int)ch;// find asci value of character
            if(asci >= 97) flag = false;
            if(flag == true){
                asci += 32;
                char dh = (char) asci; // convert asci to character
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
            else {
                asci -= 32;
                char dh = (char) asci;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
