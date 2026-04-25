abstract class bank{
    abstract void Intrest();
}
class sbi extends bank{
    @Override
    void Intrest(){
        System.out.println("SBI interest Rate is 6% ");
    }
}
class HDFC extends bank{
    @Override
    void Intrest() {
        System.out.println("HDFC interest is 7%");
    }
}
public class abstraction_bank {
    public static void main(String[]args){
        bank cus1 = new sbi();
        cus1.Intrest();
        bank cus2 = new HDFC();
        cus2.Intrest();
    }
}
