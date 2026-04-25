package sheet_2;
abstract class employee{
    abstract int getsalary();
}
class intern extends employee{

    @Override
    int getsalary() {
        return 10000;
    }
}
class manager extends employee{
    @Override
    int getsalary() {
        return 500000;
    }
}

public class Question23 {
    public static void main(String[] args){
        employee e1 = new intern();
        employee e2 = new manager();
        System.out.println(e1.getsalary());
        System.out.println(e2.getsalary());
    }
}
