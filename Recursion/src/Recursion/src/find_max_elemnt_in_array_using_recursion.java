package Recursion.src;

public class find_max_elemnt_in_array_using_recursion {
    static int maxElement(int[]arr , int index){
        // base case
        if(index == arr.length-1){
            return arr[index];
        }
       int maxElement= maxElement(arr,index+1);

        return Math.max(arr[index],maxElement );
    }

    static void main() {
        int []arr ={1,5,8,9,65,6};
       int max = maxElement(arr, 0);
        System.out.println(max);
    }
}
