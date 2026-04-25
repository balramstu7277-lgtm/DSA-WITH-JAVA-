class myThread extends Thread{
    @Override
    public void run() {
        for(; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class JavaThread {
    public static void main(String[]args){
        myThread m1 =new Mythread();
        m1.start();
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
