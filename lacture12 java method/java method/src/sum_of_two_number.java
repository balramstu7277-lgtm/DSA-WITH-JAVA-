import java.util.Scanner;

public class sum_of_two_number {
    public static void main(String[] args) {
        System.out.println("welcome to new calculator ");
        int first_number;
        int second_number;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a first number ");
         first_number = input.nextInt();
        System.out.println("please enter a second  number ");
        second_number = input.nextInt();
        sum(first_number,second_number);

    }
    public static void sum (int a , int b){
        int sum = a+b;
        System.out.println("sum of two number is :-"+sum);

    }

}
