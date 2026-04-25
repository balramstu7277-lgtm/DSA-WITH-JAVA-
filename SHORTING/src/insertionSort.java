public class insertionSort {
    static void insertation(int [] arr){
        int n = arr.length;
        for (int i = 1 ; i <n ;i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp ;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {4,5,2,3,7};
        insertation(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
}
