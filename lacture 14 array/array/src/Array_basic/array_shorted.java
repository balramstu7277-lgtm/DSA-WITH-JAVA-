package Array_basic;

import java.util.Arrays;
import java.util.Scanner;

public class array_shorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("please enter a " + i + " element :-");
            arr[i] = input.nextInt();
        }
        int[] ans = smallestAndLargest(arr);

        System.out.println("smallest :-"+ ans[0]);
        System.out.println("largest  :-"+ ans[1]);

    }
    public static int[] smallestAndLargest(int []arr){
        Arrays.sort(arr);
         int [] ans = {arr[0],arr[arr.length-1]};
                return ans;
    }

    public static class occurrence_of_last_element {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int [] arr = new int[size];
            for (int i=0; i<size;i++){
                System.out.print("please enter a "+ i +" element :-");
                arr[i] = input.nextInt();
            }
            last_occurrence(arr);
            System.out.println("last  Repeating number "+last);

        }
        static int last = 0;
        public static int last_occurrence(int [] arr){
            for (int i = 0 ;i<arr.length;i++){
                for (int j = i + 1; j<arr.length;j++){
                    if (arr[i]==arr[j]){
                        last = arr[i];
                    }
                }
            }
            return -1;
        }
    }
}
