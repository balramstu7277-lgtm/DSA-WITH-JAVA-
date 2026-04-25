class College{
    String name ;
    int age ;
    void print(String name){
        this.name = name;
        System.out.println(name);
    }
    void print(int age){
        this.age= age;
        System.out.println(age);
    }
    void print(String name , int age ){
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
}

public class constructor_overloding {
    public static void main(String[] args){
        College c1 = new College();
        c1.print("name");
        c1.print(20);
        c1.print("Balram", 20);
    }
}
