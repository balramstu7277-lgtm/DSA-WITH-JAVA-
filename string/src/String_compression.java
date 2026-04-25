public class String_compression {
    public static void main(String[] args){
        String str = "aaabbbbccddddeeee";
        String ans  = " " + str.charAt(0);
        int count = 1;
        for(int i = 1 ; i <str.length();i++){
            char  current = str.charAt(i);
            char  previous = str.charAt(i-1);
            if (current == previous){
                count++;
            }
            else {
                if(count >1 )ans += count;
                count = 1;
                ans += current;
            }
        }
        if(count>1)ans += count;
        System.out.println(ans);
    }
}
