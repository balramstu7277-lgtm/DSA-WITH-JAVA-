package Array_basic;

import java.util.Scanner;

public class last_occurrence_of_element {
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
    static int count = -1;
    public static int occurrence (int []arr,int number ){
        for (int i = 0 ; i <arr.length;i++){
            if(number == arr[i]){
                count= count =i;
            }
            else
            {
                System.out.println("your element not found in java_basic.array element");
            }
        }
        return count;
    }

    public static class reverse_array {
        public static void main(String[] args) {
            int[] arr ={1,2,3,4,5};
            System.out.print("orignal java_basic.array is :-");
            prinArray(arr);
            System.out.println();
            int [] ans = reverseArray(arr);
            System.out.print("Your reverse java_basic.array is :- ");
            prinArray(ans);
        }
        public static int[] reverseArray(int[]arr){
            int n = arr.length;
            int [] ans = new int[n];
            int j = 0;


            for (int i = n-1; i>= 0 ; i--){
                ans[j++] = arr[i];
            }
            return ans;
        }
        public static void prinArray(int[]arr){
            for (int i = 0 ; i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static class Rotate_array_by_k_in_place {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("please enter a " + i + " element :-");
                arr[i] = input.nextInt();
            }
            System.out.println("please enter a value of k to Rotate a java_basic.array");
            int k = input.nextInt();
            System.out.println("Original java_basic.array :- ");
            print(arr);
            System.out.println();
            rotateInPlace(arr,k);
            System.out.println("Rotated java_basic.array :-");
            print(arr);



        }
        public static void swap(int []arr,int i , int j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
        public static void reverse(int[]arr,int i,int j){
            while (i<j){
                swap(arr,i,j);
                i++;
                j--;
            }

        }
        public static void rotateInPlace(int []arr, int k){
                int n = arr.length;
            k = k % n;

            reverse(arr ,0 , n-k-1);
            reverse(arr,n-k,n-1);
            reverse(arr,0,n-1);
        }
        public static void print(int []arr){
            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i]);
            }
        }
    }

    public static class second_smallest_number {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("welcome to java_basic.array manipulation");
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("please enter a " + i + " element :-");
                arr[i] = input.nextInt();
            }
            second_minvalue(arr);
            System.out.println(second_small);
        }
        public static int find_minvlue(int [] arr){
            int max = Integer.MAX_VALUE;
            for (int i = 0 ; i< arr.length;i++){
                if (arr[i]<max){
                    max=arr[i];
                }
            }
            return max;
        }
        static int second_small;
        public static int second_minvalue(int []arr){
            int max = find_minvlue(arr);
            for (int i = 0 ; i < arr.length;i++){
                if(arr[i]==max){
                    arr[i]=Integer.MAX_VALUE;
                }
            }
            second_small = find_minvlue(arr);
            return second_small;
        }
    }

    public static class second_largest_number {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("welcome to java_basic.array manipulation");
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("please enter a " + i + " element :-");
                arr[i] = input.nextInt();
            }
            second_maxvalue(arr);
            System.out.println(second_max);
        }
        public static int find_maxvlue(int [] arr){
            int max = Integer.MIN_VALUE;
            for (int i = 0 ; i< arr.length;i++){
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        static int second_max;
        public static int second_maxvalue(int []arr){
            int max = find_maxvlue(arr);
            for (int i = 0 ; i < arr.length;i++){
                if(arr[i]==max){
                    arr[i]=Integer.MIN_VALUE;
                }
            }
            second_max = find_maxvlue(arr);
            return second_max;
        }
    }

    public static class target_sum_of_array_pairs {
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
                    if (arr[i] + arr[j]==target) {
                        ans++;
                    }
                }
            }
            return ans;
        }
    }

    public static class search_element_in_array {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int [] arr = new int[size];
            for (int i=0; i<size;i++){
                System.out.print("please enter a "+ i +" element :-");
                arr[i] = input.nextInt();
            }
            System.out.println("please enter a element in java_basic.array you want to search element");
            int number = input.nextInt();
            int index = 0;
            for (int i = 0 ; i< arr.length;i++){
                if (number==arr[i]){
                    index= i;
                }
                else
                {
                    System.out.println("-1");
                }
            }
            System.out.println("your index number is "+index);
        }
    }

    public static class sum_of_all_element_in_array {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int [] arr = new int[size];
            for (int i=0; i<size;i++){
                System.out.print("please enter a "+ i +" element :-");
                arr[i] = input.nextInt();
            }
            int sum = 0 ;
            for (int i= 0 ; i< arr.length;i++){
               sum += arr[i] ;
            }
            System.out.println(sum);
        }
    }

    public static class stractly_equal {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("please enter a " + i + " element :-");
                arr[i] = input.nextInt();
            }
            System.out.println("please enter a element you want check occurrence of element ");
            int number = input.nextInt();
            occurrence(arr, number);
            System.out.println(count);
        }
        static int count = 0;
        public static int occurrence (int []arr,int number ){
            for (int i = 0 ; i <arr.length;i++){
                if(number > arr[i]){
                    count= count =i;
                }
                else
                {
                    System.out.println("your element not found in java_basic.array element");
                }
            }
            return count;
        }
    }

    public static class traversing_array {
        public static void main(String[] args) {
            int [] arr = {2,5,8,4,6,8,7,9,6,4,3};

            for (int i= 0 ; i< arr.length;i++) {
                System.out.println(arr[i]);
            }

            for (int age :arr){
                System.out.println(age);
            }

            // multi java_basic.array

            int [][] multi = {{1,2,3,},{4,5,6,},{7,8,9}};
            System.out.println("this is multi java_basic.array");
            for (int i = 0 ; i< multi.length;i++){
                for (int j = 0 ; j< multi[i].length;j++){
                    System.out.println(multi[i][j]);
                }
            }
        }
    }
}
