// find the target element in a given rotated sorted array using binary search
public class Question3 {
    static int SearchElement(int[]arr, int target ){
        int n = arr.length;
        int start = 0 , end = n-1;
        while (start<= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                else {
                    end = mid -1 ;
                }
            }else {
                if(target>=arr[start] && target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr ={3,4,5,1,2};
        System.out.println(SearchElement(arr, 5 ));
    }
}
