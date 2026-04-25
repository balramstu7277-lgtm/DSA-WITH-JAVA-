public class QuickSort {
    static  int partition(int[]arr , int start , int end){
        int pivot = arr[start];
        int count = 0;
        for(int i = start+1 ; i <= end; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotindex = start + count;
        swap(arr, start, pivotindex);
        int i =start , j =  end;
        // element lesser or equal left of pivotindex , greater right side of pivotindex
        while (i< pivotindex && j >pivotindex){
           while (arr[i]<=pivot){
               i++;
           }
           while (arr[j]>pivot){
               j--;
           }
           if(i<pivotindex && j > pivotindex){
               swap(arr, i, j);
               i++;
               j--;
           }
        }
        return pivotindex;
    }
    static void QickShort(int []arr ,int start , int  end){
          if(start >= end){
              return;
          }
          int pi = partition(arr, start, end);
          QickShort(arr, start, pi-1);
          QickShort(arr, pi+1, end);
      }

    static void diaplay(int []arr){
        for(int val :arr){
            System.out.print(val);
        }
    }
    static void swap(int[] arr , int x , int y){
        int temp  = arr[x];
        arr[x]= arr[y];
        arr[y]= temp;
    }
    public static void main(String[] args){
        int [] arr = {4,7,5,8,6,2,1,9};
        System.out.println("Array before sorting");
        diaplay(arr);
        System.out.println();
        QickShort(arr, 0, arr.length-1);
        System.out.println("Array after sorting");
        diaplay(arr);

    }
}
