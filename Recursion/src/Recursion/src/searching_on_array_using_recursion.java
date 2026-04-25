package Recursion.src;

public class searching_on_array_using_recursion {
    static boolean search(int[]arr,int index , int element){
        // base case
        if(index == arr.length){
            return false;
        }
        // self work
        if(arr[index]== element){
            return true;
        }
        // recursive relation
      return   search(arr , index +1, element);

    }

    static void main() {
        int []arr = {1,5,6,4,6,5,6,8,};
        int element = 8;
        if(search(arr, 0, element)){
            System.out.println("element is found");
        }
        else {
            System.out.println("element is not found");
        }
    }
}
