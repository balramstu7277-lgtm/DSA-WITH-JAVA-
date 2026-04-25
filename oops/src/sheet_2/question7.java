package sheet_2;
abstract class payment {
    abstract void makepyment();
}
class CreditCard extends payment{
    @Override
    void makepyment() {
        System.out.println("payment successful using CreditCard");
    }
}

class upi extends payment{
    @Override
    void makepyment(){
        System.out.println("payment successful using upi");
    }
}

public class question7 {
   public static void  main(String[] args){
       payment c1 = new CreditCard();
       c1.makepyment();
       upi u1 = new upi();
       u1.makepyment();
   }
}
