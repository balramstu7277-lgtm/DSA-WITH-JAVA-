package sheet_2;
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Question18 {
    public static void main(String[] args) {

        Animal a;        // base class reference
        a = new Dog();   // derived class object

        a.sound();       // method call
    }
}
