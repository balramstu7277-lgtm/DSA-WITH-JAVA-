import java.util.Enumeration;

//Given an  array of positive or negative  integer , Segregate  them  in linear in time  and  constant space
// the output should print  all negative number , followed  by all positive  number
public class Quedtion2 {
    // Display array
    static void dispaly(int[]arr){
        for (int val :arr){
            System.out.print(val + " ");

        }
    }
    static void partition (int []arr){
        int n = arr.length;
        int l = 0 ;
        int r = n-1;
        while(l < r){
            while (arr[l]<0) l++;
            while (arr[r]>=0) r--;
            if(l<r){
                int temp = arr[l];
                arr[l]= arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

    }
    public static void main(String[] args){
        int []arr = {-13,20,7,0,-4,-13,11,-5,-13};
        partition(arr);
        dispaly(arr);
    }
}
