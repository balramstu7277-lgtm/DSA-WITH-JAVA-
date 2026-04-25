package prefix_array;

import java.util.Scanner;

public class Array_utility {

    public class ArrayUtllity {
        public static  int[] inputArray(){
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a number of element  ");
            int size = input.nextInt();
            int[] numsArray = new int[size];
            //take input array
            int i=0 ;
            while (i<size){
                System.out.print("please enter a number" + (i+1) + ": ");
                numsArray[i]= input.nextInt();
                i++;

            }
            return numsArray;
        }

        public static  int[][] input2DArray(){
            Scanner input = new Scanner(System.in);
            System.out.print("please enter a number of Row ");
            int Row = input.nextInt();
            System.out.print("please enter a number of columns ");
            int coll = input.nextInt();
            int[] [] numsArray = new int[Row] [coll];
            //take input array
            int i=0 ;
            while (i<Row){
                int  j =  0;
                while (j<coll){
                    System.out.print("please enter a rows" + (i+1) + ": " +"and"+"columns"+(j+1)+" :");
                    numsArray[i] [j]= input.nextInt();
                    j++;
                }
                i++;

            }
            return numsArray;
        }
        public static void displayArray(int[] Arr) {
            int i = 0;
            while (i < Arr.length) {
                System.out.print(Arr[i] + " ");
                i++;
            }
            System.out.println();
        }

    }

}
