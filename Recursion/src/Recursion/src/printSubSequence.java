package Recursion.src;

public class printSubSequence {
    static  void printSubSequence(String s , String currentAns){
        // base case
        if(s.length()==0){
            System.out.println(currentAns);
            return;
        }
       //s = "abc , currentAns = " "
       char current = s.charAt(0); // a
       String remaningString = s.substring(1); // bc

        // current  character -> chooses to be  a part of  currentAns
        printSubSequence(remaningString, currentAns+current); // bc , a

        // current character -> do not chooses to be a part of currentAns
        printSubSequence(remaningString,currentAns);
    }

    static void main(String[] args) {
        printSubSequence("abc", "");
    }
}
