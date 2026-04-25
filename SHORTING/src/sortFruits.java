public class sortFruits {
    static void fruitSorting(String[]arr){
        int n = arr.length;
        for(int i =0 ; i<n;i++){
            int minindex = i;
            for(int j = i+1;j<n ;j++){
                if(arr[j].compareTo(arr[minindex])<0){
                    minindex = j;
                }
            }
            String  temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex]=temp;

        }
    }
    public static  void main(String[] args){
        String [] arr ={"kiwi","mango","apple","banana","graps"};
        fruitSorting(arr);
        for(String val :arr){
            System.out.print(val + " ");
        }
    }
}
