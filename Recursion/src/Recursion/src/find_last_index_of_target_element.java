package Recursion.src;

public class find_last_index_of_target_element {
    static void last_index(int[]arr,int index,int element){
        // Base case
        if(index <= 0){
            return ;
        }
        if(arr[index]==element){
            System.out.println(index);
            return;
        }
        last_index(arr, index- 1, element);
    }
    public static void main(String [] args){
        int[] arr = {1,2,3,4,3,5};
        last_index(arr, arr.length-1, 3);
    }
}
