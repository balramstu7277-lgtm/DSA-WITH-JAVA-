package sheet_2;
class bankAccount {
    static int count = 0;
    bankAccount(){
        count++;
    }
    void createBankAccount(){
        System.out.println("Bank Account has created successfully :- " + count);
    }
}

public class Quesion21 {
    public static void main(String[] args) {
        bankAccount p1 = new bankAccount();
        p1.createBankAccount();
        bankAccount p2 = new bankAccount();
        p2.createBankAccount();
    }


}
