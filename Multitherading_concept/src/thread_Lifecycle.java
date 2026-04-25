class LifecycleThread extends Thread{
    @Override
    public void run(){
        System.out.println("running state");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class thread_Lifecycle {
    public static void main(String[]args) throws InterruptedException {
        LifecycleThread c1 = new LifecycleThread();
        System.out.println(c1.getState());
        c1.start();
        System.out.println(c1.getState());
        Thread.sleep(100);
        System.out.println(c1.getState());
        c1.join();
        System.out.println(c1.getState());

    }
}
