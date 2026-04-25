package sheet_2;
class shape{
    void area (){
        System.out.println("area of shape");
    }
}
class circle extends shape{
    double r ;
    circle ( double r){
        this.r = r;
    }
    void area(int r){
        System.out.println(3.14 *r *r);
    }
}
class rectangle extends  shape{
    int l , b;
    rectangle(int l , int b){
        this.l = l ;
        this.b = b;

    }
     void area(int l , int b){
         System.out.println(l*b);
     }
}
class triange extends  shape{
    double b , h ;
    triange(double b , double h){
        this.b = b;
        this.h = h;
    }
    void area (double b , double h){
        System.out.println(0.5 *b*h);
    }
}

public class Question6 {
    public static void main(String []args){
        shape s1 = new shape();
        rectangle r1 = new rectangle(4,5);
        circle c1 = new circle(6);
        triange t1 = new triange(5 ,8);
        s1.area();
        r1.area(4,5);
        c1.area(6);
        t1.area(5,8);
    }
}
