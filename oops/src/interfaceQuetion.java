interface vechica{
    void speedup(int inc );
    void Break(int dec);
}
class Cars implements vechica{
    int Speed = 0;
    @Override
    public void speedup(int val) {
        Speed = Speed+val;
        System.out.println("your speed is : " + Speed);
    }

    @Override
    public void Break(int val ) {
        Speed = Speed-val;
        System.out.println("your break is applyed :- " + Speed);
    }
}
public class interfaceQuetion {
    public static void main(String[] args){
        Cars c1 = new Cars();
        c1.speedup(100);
        c1.Break(20);
        vechica v1 = new Cars();
        v1.speedup(1000);
        v1.Break(99);
    }

}
