abstract class btech{
    abstract void  section();
    void spacelization(){
        System.out.println("we have cse , AIMl");
    }
}
class Section extends btech{
    @Override
   void section() {
        System.out.println("We have 8 section");
    }

}
public class Abstraction_btech {
    public static void main(String []args){
        Section s1 = new Section();
        s1.section();
        s1.spacelization();
    }
}
