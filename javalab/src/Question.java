class B {
    private int C2 = 0;

    synchronized void inc() {
        C2++;
    }

    public int get() {
        return C2;
    }
}

class MyThread extends Thread {

    B obj;

    MyThread(B obj) {
        this.obj = obj;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            obj.inc();
        }
    }
}

public class Question {

    public static void main(String[] args) {

        B obj = new B();

        MyThread T1 = new MyThread(obj);
        MyThread T2 = new MyThread(obj);
        MyThread T3 = new MyThread(obj);

        T1.start();
        T2.start();
        T3.start();

        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(obj.get());
    }
}