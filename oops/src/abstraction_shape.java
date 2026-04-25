abstract class shape {
    int side ;
    shape(int side){
        this.side = side;
    }
    abstract int area ();
}
class Shape1 extends shape{
    Shape1(int side) {
        super(side);
    }

    @Override
    int area(){
        int Area = side*side ;
        return Area;
    }
}
public class abstraction_shape {
    public static void main(String[] args){
        shape s1 = new Shape1(5);
        System.out.println(s1.area());

    }
}
