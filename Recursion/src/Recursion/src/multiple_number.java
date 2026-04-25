package Recursion.src;

public class multiple_number {
    static void multiple(int n ,int k){
        if(k==0){
            System.out.println(n);
            return;
        }
        multiple(n,k-1);
        System.out.println(n*k);
    }

    static void main() {
        multiple(8, 9);
    }
}
