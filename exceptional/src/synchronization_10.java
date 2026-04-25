import javax.lang.model.element.NestingKind;

class counter{
    private  int count ;
    public counter(int count){
        this.count = count;
    }
    public  void incCount(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
class Mythread extends Thread{
    private counter count;
    public Mythread(counter count){
        this.count = count;
    }
    @Override
    public void run(){
        count.incCount();
    }
}
public class synchronization_10 {
    public static void main(String[] args) {
        counter obj = new counter(6);
        Mythread t1 = new Mythread(obj);
        Mythread t2 = new Mythread(obj);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println("kuch to gadbad hai");
        }

        System.out.println(obj.getCount());
    }
}
