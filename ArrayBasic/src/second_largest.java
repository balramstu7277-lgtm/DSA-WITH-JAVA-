public class second_largest {
    public static int Findmax(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int Second_max;
    public static int secondMax(int[]arr){
       int max = Findmax(arr);

       for(int i = 0;i< arr.length;i++){
           if(arr[i]==max){
               arr[i]=Integer.MIN_VALUE;
           }
       }
         Second_max = Findmax(arr);
       return Second_max;
    }
    public static void main(String[]args){
        int[]arr = {1,7,8,9,4,7,0,10};
        System.out.println(secondMax(arr));
    }
}
