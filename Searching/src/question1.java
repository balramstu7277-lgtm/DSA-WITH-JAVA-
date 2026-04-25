//find the first occurrence of a given element x given that the give array is sorted if on occurrence of x found the return -1
public class question1 {
    static int firstOcc (int[]arr, int target){
        int n = arr.length;
        int start = 0 , end = n-1;
        int occ = -1 ;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                occ = mid;
                end = mid -1;
            } else if (target<arr[mid]) {
                end = mid -1;
            }else {
                start =mid+1;
            }

        }
        return  occ ;
    }
    public static void main(String[]args){
        int[]arr = {1,5,5,6,6,7,8,9};
        System.out.println(firstOcc(arr, 5));

    }
}
