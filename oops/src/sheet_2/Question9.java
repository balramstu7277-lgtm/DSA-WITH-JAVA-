package sheet_2;
class Counter {

    static int count = 0;

    Counter() {
        count++;
    }

    void display() {
        System.out.println("Object count: " + count);
    }
}

public class Question9 {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        c1.display();

        Counter c2 = new Counter();
        c2.display();

        Counter c3 = new Counter();
        c3.display();
    }
}

