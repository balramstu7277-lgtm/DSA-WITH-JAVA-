// function overloading
class clgStudent{
    String name ;
    int age ;

    public void printInfo(String name ){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name , int age){
        System.out.println(name + " " + age );
    }

}
public class polymorphism_concept {
    public static void main(String[] args){
        clgStudent s1 = new clgStudent();
        s1.name = "Balram kumar rana";
        s1.age = 20;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name,s1.age);
    }
}
