package Recursion.src;

public class find_array_is_shorted {
    static boolean arrayshorted(int []arr , int index){
        // Base case
        if(index == arr.length-1){
            return false;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return arrayshorted(arr, index+1);
    }
    public static void main(String[]args){
        int[]arr = {1,0,3,10,5,6};
        if(arrayshorted(arr, 0)){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
