package sheet_2;
class findArea {
    void area (int side){
        System.out.println(side * side);
    }
    void area (int l , int b){
        System.out.println(l * b);
    }

}
public class Question4 {
    public static void main(String []args){
        findArea a1 = new findArea();
        a1.area(4);
        a1.area(4,5);
    }
}
