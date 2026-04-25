//Given an array Where all its element are sorted int increasing order except two  swapped element ,
//sort it in linear time .Assume there are no duplicate in the array.
public class Question1 {
    // display array
    static void display(int[]arr){
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
    static void sortArray(int[]arr){
        int n = arr.length;
        int x = -1 , y = -1;
        if(n<= 1){
            return; // edge case
        }
        // process all adjacent element
        for(int i = 1; i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x == -1){
                    x = i-1;
                    y = i;
                }
                else
                {
                    y = i;
                }
            }
        }
        // swap x , y in num
        QuickSort.swap(arr, x, y);

    }
    public static void main(String[] args){
        int [] arr = {3,8,6,7,5,9,10};
        sortArray(arr);
        display(arr);
    }
}
