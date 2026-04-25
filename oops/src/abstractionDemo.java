abstract class animal {
    abstract void sound();
}

class tiger extends animal {
    void sound() {
        System.out.println("Roar");
    }
}

class lion extends animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class abstractionDemo {
    public static void main(String[] args) {
        animal A1 = new lion();
        A1.sound();

        animal A2 = new tiger();
        A2.sound();
    }
}
