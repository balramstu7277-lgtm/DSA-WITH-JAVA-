package Array_basic;

import java.util.Scanner;

public class array_is_shorted_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("please enter a " + i + " element :-");
            arr[i] = input.nextInt();
        }
        isshorted(arr);
        System.out.println("is shorted  "+ isshorted(arr));
    }
    public static boolean isshorted(int []arr ) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                check= false;
                break;
            }
        }
        return check;
    }

    public static class target_sum_triplets {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("please enter a " + i + " element :-");
                arr[i] = input.nextInt();
            }
            System.out.println("please enter a target element ");
            int target = input.nextInt();
            find_pairs(arr,target);
            System.out.println(ans);
        }
        static int ans = 0;
        public static int find_pairs(int[] arr,int target){
            for (int i=0; i<arr.length;i++){
                for (int j = i +1; j<arr.length;j++){
                    for (int k = j+1 ; k< arr.length;k++){
                        if (arr[i] + arr[j] +arr[k]==target) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
