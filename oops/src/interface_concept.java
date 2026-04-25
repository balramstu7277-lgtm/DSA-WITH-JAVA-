// interface concept
interface Animals{
    void sleep();
    void  eat ();
}
class Lions implements Animals{
    @Override
    public void sleep() {
        System.out.println("yes");
    }
    @Override
    public void eat(){
        System.out.println("lion eats");
    }
}
public class interface_concept {
    public static void main(String[] args){
        Lions l1 = new Lions();
        l1.eat();
        l1.sleep();
    }

}
