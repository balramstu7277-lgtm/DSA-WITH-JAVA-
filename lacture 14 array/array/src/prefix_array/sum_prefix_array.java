package prefix_array;

public class sum_prefix_array {
    public static void main(String[] args) {
       int [] arr = Array_utility.ArrayUtllity.inputArray();
        System.out.println("original array");
        print(arr);
        System.out.println();
        System.out.println("prefix sum array");
        makePrefixArray(arr);
        print(arr);

    }
    public static int[] makePrefixArray(int[]arr){
        int n = arr.length;
        for (int i=1; i<n;i++){
            arr[i]= arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void print(int[]arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
