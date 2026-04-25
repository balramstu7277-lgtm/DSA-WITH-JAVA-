public class Question4 {
        static int SearchElement(int[]arr, int target ){
            int n = arr.length;
            int start = 0 , end = n-1;
            while (start<= end){
                int mid = start + (end - start)/2;
                if(target == arr[mid]){
                    return mid;
                } else if (arr[start]== arr[mid] && arr[end]==mid) {
                    start++;
                    end++;
                    
                } else if (target <= arr[mid]) {
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
            int [] arr ={1,1,1,2,2,3,1};
            System.out.println(SearchElement(arr, 2  ));
        }
    }


