public class pass_by_value_0r_pass_br_referance {
    static void changevalue(int a){
         a *= 100;
        System.out.println("value inside a function  "+ a);
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before value is change "+ a);
        changevalue(a);
        System.out.println("before value is change "+ a);
    }
}
