package Recursion.src;

public class find_index_of_an_array {
    static void find_index(int[]arr , int index, int element){
        if(index == arr.length){
            return ;
        }
        if(arr[index]== element){
            System.out.println(index);
        }
        find_index(arr,index+1, 8);
    }

    static void main(String[] args) {
        int []arr = {7,8,9,4,5,6,8,7,9,8,45,8,6,8,8};
        find_index(arr, 0, 8);
    }
}
