import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a binary number");
        int binary_number = sc.nextInt();

        int ans =  0; // converted decimal number
        int power = 1 ; // 2^0 = 1
        while (binary_number>0){
            int unit_digit = binary_number % 10;
            ans+=(unit_digit * power);
            binary_number = binary_number/10;
            power= power*2;
        }
        System.out.println(ans);


    }
}
