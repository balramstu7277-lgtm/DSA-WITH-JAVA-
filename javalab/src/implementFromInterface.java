class A implements Runnable {
    public void run() {
        System.out.println("hii Thread");
    }
}
public class implementFromInterface {
    static void main(String[] args) {
        A c1 =new A();
        Thread t1 = new Thread(c1);
        t1.start();
    }

}
