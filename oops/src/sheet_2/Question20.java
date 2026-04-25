package sheet_2;
class ATM{
     private  int balance = 0 ;

     void deposit (int amount){
         balance = balance + amount;
         System.out.println("diposit successfully your balance is :- " + balance);
     }
     void withdrawn (int amount){
         if(balance > amount){
             System.out.println("insufficient balance");
         }else {
             balance = balance - amount;
             System.out.println("withdrawn successfully your balance is :- " + balance);
         }
     }
}

public class Question20 {
    public static void main(String [] args){
        ATM A =new ATM();
        A.deposit(1000);
        A.withdrawn(500);
    }
}
