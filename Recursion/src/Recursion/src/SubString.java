package Recursion.src;

import java.util.ArrayList;

public class SubString {
    static ArrayList<String> getsubString(String s){
    ArrayList<String> ans = new ArrayList<>();
    // base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char current = s.charAt(0); // to find the curent string
        ArrayList<String> smallAns = getsubString(s.substring(1)); // recursive relation
        // smallAns a hai ["bc","b","c"," "]
        for(String ss : smallAns ){
            ans.add(ss);
            ans.add(current+ss);
        }
        return  ans;
    }
     public static  void main(String[] args){
        ArrayList<String> ans =  getsubString("abc");
        for (String ss: ans){
            System.out.println(ss);
        }
     }
}
