public class reverseArray {
    public static void reverse(int[]arr){
        int n = arr.length-1;
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void display(int[]arr){
        for(int val :arr){
            System.out.print(val+ " ");
        }
    }

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};
        display(arr);
        System.out.println(" ");
        reverse(arr);
        display(arr);

    }
}
