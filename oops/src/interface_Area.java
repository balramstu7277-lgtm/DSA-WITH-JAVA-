interface calculation{
    void area(int b , int h);
}
class tringleArea implements calculation{
    //@Override
    double Area = 1;
    public void area(int b, int h) {
        try {
            Area = 0.5 * b * h;
        } catch (Exception e) {

        }
        System.out.println(Area);
    }
}
public class interface_Area {
    public static void main(String[] args){
        tringleArea a1 = new tringleArea();
         a1.area(5,8);
    }
}
