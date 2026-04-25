package Array_basic;

import java.util.Scanner;

public class maximum_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a size of arr :- ");
        int size = input.nextInt();
        int [] arr = new int[size];
        for (int i=0; i<size;i++){
            System.out.print("please enter a "+ i +" element :-");
            arr[i] = input.nextInt();
        }
        int count = 0;
        for (int i= 0 ; i< arr.length;i++){
            if (arr[i]>count){
                count= arr[i];
            }
        }
        System.out.println(count);
    }

    public static class presentQuery {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a size of arr :- ");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("please enter a " + i + " element :-");
                arr[i] = input.nextInt();

            }
                System.out.println("please enter a number of queries");
                int queries = input.nextInt();
                int [] freq = makefreuencyArray(arr);
                while (queries>0){
                    System.out.println("please enter a number to be searched");
                    int x = input.nextInt();
                    if (freq[x]>0){
                        System.out.println("yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                    queries--;
                }
            }
        public static int []makefreuencyArray(int[]arr){
            int[] freq = new int[100005];
            for(int i = 0 ; i<arr.length;i++){
                freq[arr[i]]++;
            }
            return freq;
        }
       }

    public static class reverse_array_using_swap_method {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            System.out.print("original java_basic.array is :-");
            print(arr);
            System.out.println();
            System.out.print("reverse  java_basic.array is :-");
            reverse(arr);
            print(arr);


        }
        public static void reverse (int arr[]){
            int i = 0;
            int j = arr.length-1;
            while (i<j){
                swap(arr,i,j);
                i++;
                j--;

            }
        }
        public static void swap(int []arr,int i , int j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
        public static void print (int []arr){
            for (int i = 0; i <arr.length;i++){
                System.out.print(arr[i]);
            }
        }
    }

    public static class swap_method2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter a first number :- ");
            int first = input.nextInt();
            System.out.println("please enter a second number :- ");
            int second = input.nextInt();
            System.out.println("value befoe swaping");
            System.out.println("a"+first);
            System.out.println("b"+second);
            swap(first,second);


        }
        public static void swap(int a , int b){
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("value after swaping");
            System.out.println("a :- "+a);
            System.out.println("b :- "+b);

        }
    }

    public static class swap_of_number {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter a first number :- ");
            int first = input.nextInt();
            System.out.println("please enter a second number :- ");
            int second = input.nextInt();
            System.out.println("value befoe swaping");
            System.out.println("a"+first);
            System.out.println("b"+second);
            swap(first,second);


        }
        public static void swap(int a , int b){
            int temp = a;
             a = b;
             b= temp;

            System.out.println("value after swaping");
            System.out.println("a :- "+a);
            System.out.println("b :- "+b);

        }
    }
}
