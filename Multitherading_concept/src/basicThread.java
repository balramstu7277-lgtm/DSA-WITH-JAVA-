class Mythread extends  Thread{
    @Override
    public void run() {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println("Hello World");
        }
    }
}
public class basicThread {
    public static void main(String[] args){
        Mythread m1 = new Mythread();
        m1.start();
        for(int i = 0 ; i<= 1000; i++){
            System.out.println("main function");
        }
    }
}
