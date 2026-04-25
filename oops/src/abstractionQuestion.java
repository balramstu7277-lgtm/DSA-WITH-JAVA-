abstract class animals{
    abstract void eat();
    abstract void sleep();
    void run(){
        System.out.println("Animal run first");
    }
}
class lions extends animals{
    @Override
    void eat() {
        System.out.println("lion eats");
    }
    @Override
    void sleep() {
        System.out.println("lion sleep");
    }
}
public class abstractionQuestion {
    public static void main(String [] args){
        animals A1 = new lions();
        A1.eat();
        A1.sleep();
        A1.run();
    }
}
