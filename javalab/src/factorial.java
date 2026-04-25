public class factorial {
    public int fact(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ;i++){
            fact*= i;
        }
        return fact ;
    }

    public static void main(String[] args) {
        factorial f1 = new factorial();
        System.out.println(f1.fact(10));

    }
}
