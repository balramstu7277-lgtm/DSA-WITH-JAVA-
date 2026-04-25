package Array_basic;

import java.util.Scanner;

public class occurrence_of_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int [] arr = new int[size];
        for (int i=0; i<size;i++){
            System.out.print("please enter a "+ i +" element :-");
            arr[i] = input.nextInt();
        }
        System.out.println("please enter a element you want check occurrence of element ");
        int number = input.nextInt();
        occurrence(arr,number);
        System.out.println(count);

    }
    static int count = 0;
    public static int occurrence (int []arr,int number ){
        for (int i = 0 ; i <arr.length;i++){
            if(number == arr[i]){
                count=count+1;
            }
            else
            {
                System.out.println("your element not found in java_basic.array element");
            }
        }
        return count;
    }
}
