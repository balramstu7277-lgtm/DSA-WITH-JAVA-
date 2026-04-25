import jdk.jshell.spi.ExecutionControl;

class student {
    String name ;
    private int roll = 13 ;
    double cgpa;

    // print function
    public void print(){
        System.out.println(name + " " + roll + " "+cgpa  );
    }

}
public class private_keyword {
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Balram kumar rana";
       //  s1.roll  is private hai to ham usko change nahi kar sakt hai
        s1.print();// lakin ham suko kisi or function ka through acces

    }

}
