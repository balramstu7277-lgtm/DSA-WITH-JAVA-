public class insertation {
    static void insertationShort(int[]arr){
        for(int i = 1 ; i<arr.length;i++){
            int j = i;
            while (j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,5,3,2,7,9,8};
        insertationShort(arr);
        for(int val :arr){
            System.out.println(val);
        }
    }
}
