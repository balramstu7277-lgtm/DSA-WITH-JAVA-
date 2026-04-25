class Shape{
    public void area(){
        System.out.println("Dispaly area ");
    }
}
class triange extends Shape{
    public void area(int l , int h){
        System.out.println(0.5*l*h);
    }
}
class circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class inharitance {
    public static void main(String [] args){
        triange t1 = new triange();
        t1.area(6,24 );
        circle c1 = new circle();
        c1.area(5);
        c1.area();

    }

}
