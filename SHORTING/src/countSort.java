public class countSort {
    static int findMax (int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void basicCountShort(int []arr){
       int max = findMax(arr); // find the largest element of the array
        int[] count = new int[max+1];
        for(int i = 0 ; i< arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0 ;
        for(int i = 0 ; i < count.length;i++){
            for (int j = 0 ; j<count[i];j++){
                arr[k++]= i ;
            }
        }
    }
    static void display(int[]arr){
        for(int val : arr){
            System.out.print(val);
        }
    }
    static void countSort(int[]arr){
        int n = arr.length;;
        int []output = new int[n];
        int max = findMax(arr); // find the largest element of the array
        int[] count = new int[max+1];
        for(int i = 0 ; i< arr.length;i++){ // make frequency array
            count[arr[i]]++;
        }
        //  prefix sum array of count array
        for(int i = 1; i<count.length;i++){
            count[i]+=count[i]-1;
        }

        // Find the element of each index in the original array
        for(int i = n-1 ;i>=0;i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all element of output to arr
        for(int i = 0 ; i<n ;i++){
            arr[i]= output[i];
        }
    }
    public static  void main(String[] args){
        int[]arr = {1,4,8,4,7,4,8,7};
        basicCountShort(arr);
        display(arr);
        System.out.println("");
        countSort(arr);
        display(arr);
    }
}
