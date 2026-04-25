public class numberPalandrome {
    public static void palandrome(int num){
        int n = num;
        int rev = 0;
        int digit = 0;
        while (num!=0){
            digit = num % 10;
            rev = rev*10+ digit;
            num = num/10;
        }
        if(n == rev){
            System.out.println("number is palandrome");
        }
        else
        {
            System.out.println("number is not palandrome");
        }
    }

    static void main(String[] args) {
        palandrome(12321);
    }
}
