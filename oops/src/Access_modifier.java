import jdk.dynalink.beans.StaticClass;
// encapsulation
class Account{
    public String name ;// public Access modifier
    protected String email; // protected Access modifier
    private String password;//private Access modifier

    // getters and setters
    public String getPassword(){
        return  this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

}
public class Access_modifier {
    public static void main(String []args){
        Account A1 = new Account();
        A1.name ="Balram kumar rana";
        A1.email ="balramranahzb1122@gmail.com";
        A1.setPassword("1234");
        System.out.println(A1.getPassword());
    }
}
