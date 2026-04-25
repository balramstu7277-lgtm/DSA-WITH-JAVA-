class bal extends Exception{
    private double amount  ;
    bal(double amount){
        this.amount = amount;
    }
}
class check extends Exception{
    private double balance ;
    public void setBalance(double amount) {
         balance = amount;
    }
    public double withdrawl(double amount) throws Exception {
        if(balance < amount) {
            throw new Exception("insufficant balance");
        }
        else {
            balance = balance - amount;
        }
        return balance;
    }
    public double getbalance(){
       return balance ;
    }
}
public class costomException {
    public static void main(String [] args) throws Exception {
        check c1 = new check();
        c1.setBalance(1000);
        double balance = c1.withdrawl(500);
        System.out.println("your balance is "+balance);
        double amount =c1.getbalance();
        System.out.println(amount);
    }
}
