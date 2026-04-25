package Recursion.src;

public class gcd {
    static void devision(int x,int y){
        int max = Math.min(x, y);
       for (int i = max;i>=0;i--){
           if(x %i ==0 && y % i == 0){
               System.out.println(i);
               break;
           }
       }
    }

    static void main() {
        devision(12, 16);
    }
}
