import com.sun.source.doctree.ParamTree;
import jdk.dynalink.beans.StaticClass;

public class Question3 {
    static void display(int [] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int[] arr, int x , int y ){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;

    }
    static  void sort (int[]arr){
        int low = 0 , mid = 0 , hi= arr.length-1;
        // Explore th e unknown  region
        while (mid <= hi){
            if(arr[mid]== 0){
                swap(arr, mid , low);
                mid++;
                low++;
            } else if (arr[mid]==1) {
                mid++;
            }else {
                swap(arr, mid, hi);
                hi--;
            }
        }

    }

    public static void main(String[]args){
        int[]arr = {2,2,0,0,1,1,2,0,1,0};
        sort(arr);
        display(arr);

    }
}
