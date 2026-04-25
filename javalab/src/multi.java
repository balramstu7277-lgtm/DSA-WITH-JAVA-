class multiThread extends Thread{
    public void run(){
        for(int i= 0 ;i<10;i++){
            System.out.println("i ma a child Thread");
        }
        System.out.println(Thread.currentThread().getName());
    }

}
public class multi {
    static void main(String[] args) {
        multiThread m1 = new multiThread();
        m1.start();

       for(int i = 0; i< 10; i++){
            System.out.println("i am a parent Thread");
        }
        System.out.println(Thread.currentThread().getName());
    }

}
