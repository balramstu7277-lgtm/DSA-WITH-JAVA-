package Array_basic;

import java.util.Scanner;

public class occurrence_of_first_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int [] arr = new int[size];
        for (int i=0; i<size;i++){
            System.out.print("please enter a "+ i +" element :-");
            arr[i] = input.nextInt();
        }

        System.out.println("first Repeating number "+first_occurrence(arr));

    }

    public static int first_occurrence(int [] arr){
        for (int i = 0 ;i<arr.length;i++){
            for (int j = i + 1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                   return arr[i];
                }
            }
        }
        return -1;
    }
}
