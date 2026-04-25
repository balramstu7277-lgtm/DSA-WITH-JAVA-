public class Bubble_short {
    static void bubble(int []arr){
        int n = arr.length;
        for(int i = 0 ; i<n-1;i++){
            for(int j = 0 ; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j ,j+1);
                }
            }
        }
    }
    static void swap (int[]arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String []args){
        int []arr ={7,6,4,5,1,2};
        bubble(arr);
        for(int i =0 ;i< arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
