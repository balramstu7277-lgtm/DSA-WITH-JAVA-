package Recursion.src;

public class keypadConmbination {
    static  void  combiantion(String digit ,String[] key ,String result){
        // base case
        if(digit.length()==0){
            System.out.println(result + " ");
            return;
        }
        int currentnum = digit.charAt(0)-'0'; //2
        String currentChoice = key[currentnum];// 'abc'
        for(int i = 0 ; i<currentChoice.length();i++){
            combiantion(digit.substring(1), key, result + currentChoice.charAt(i));
        }
    }
    public static void main(String[]args){
        String str ="235e";
        String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combiantion(str, key, "");
    }
}