package sheet_2;
class Person {

    void display() {
        System.out.println("This is Person class");
    }
}

class Student extends Person {

    void display() {
        super.display();
        System.out.println("This is Student class");
    }
}


public class Question19 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();
    }
}
