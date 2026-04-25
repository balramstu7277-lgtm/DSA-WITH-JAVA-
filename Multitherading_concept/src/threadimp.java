class balram implements Runnable{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class threadimp {
    static void main(String[] args) {
        balram b1 = new balram();
        Thread t1 = new Thread(b1);
        t1.start();
        for (;;){

            System.out.println(Thread.currentThread().getName());
        }

    }
}
