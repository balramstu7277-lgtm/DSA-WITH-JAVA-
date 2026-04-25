public class SelectionShort {
    static void SelectionShort(int []arr){
        int n = arr.length;
        for(int i = 0 ; i< n-1 ; i++){// i represent the current index
            // find minimum element  in unshorted part of arry
            int minindex = i;
            for(int j = i+1 ; j<n;j++){
                if(arr[j]<arr[minindex]){ // for descending  arr[j]>arr[minindex]
                    minindex = j;
                }
            }
            //Swap current element  and  minimum element -> current  index  i will have  correct  element 
           if(minindex!=i){
               int temp = arr[i];
               arr[i]= arr[minindex];
               arr[minindex]=temp ;
           }
        }
    }
    public static void main(String[] args){
        int []arr = {1,5,9,4,3,6};
        SelectionShort(arr);
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
