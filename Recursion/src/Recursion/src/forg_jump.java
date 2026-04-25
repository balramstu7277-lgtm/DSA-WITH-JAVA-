public class forg_jump {
    static int frogJump (int[]arr , int index){
        int n= arr.length;
      if(index == n-1){
          return 0;
      }
      int option1 = Math.abs(arr[index]-arr[index+1]) + frogJump(arr , index+1);
      if(index == n-2){
          return option1;
      }
      int option2 = Math.abs(arr[index]-arr[index+1]) + frogJump(arr , index+2);
      return Math.min(option1, option2);
    }

    public static void main(String[] args){
        int[]arr = {10,30, 40, 20};
        System.out.println( frogJump(arr, 0));

    }

}
