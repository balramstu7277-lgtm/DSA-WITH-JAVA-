import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int decimal_number = input.nextInt();

        int answer = 0;
        int power = 1;// power of 10

        while (decimal_number>0){
            int parity = decimal_number % 2;
            answer +=(parity*power);
            power= power*=10;
            decimal_number/=2;

        }
        System.out.println(answer);
    }
}
