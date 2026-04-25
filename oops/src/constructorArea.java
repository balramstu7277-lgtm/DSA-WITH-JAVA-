// example of method overloading
class AreaCal{
    int side ;
    int l;
    int b;
    void area(int side){
        this.side = side;
        System.out.println(side*side);

    }
    void area (int l ,int b){
        this.l = l;
        this.b= b;
        System.out.println(l*b);
    }
}
public class constructorArea {
    public static void main(String[] args){
        AreaCal a1 = new AreaCal();
        a1.area(5);
        a1.area(2,3);
    }
}
