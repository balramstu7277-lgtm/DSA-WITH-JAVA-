class methodC extends Thread{
    @Override
    public void run() { // method 1
        for(int i = 0 ;i<10;i++){
            try{
                Thread.sleep(1000); // method 3
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Threads is running...");

    }
}
public class threadMethod {
    public static void main(String[] args) throws InterruptedException {
        methodC m1 = new methodC();
        m1.start();// method 2
        m1.join();
        System.out.println("hello");
    }

}
