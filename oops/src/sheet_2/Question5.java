package sheet_2;
class vechical {
    void milage(){
        System.out.println("vechical milage ");
    }
}
class car extends vechical{
    void milage(){
        System.out.println("this is car milage");
    }
}
class bike extends vechical{
    void milage(){
        System.out.println("this is bike milage");
    }
}

public class Question5 {
    public static void main(String [] args ){
        vechical v1 = new car();
        v1.milage();
        vechical v2 = new bike();
        v2.milage();

    }
}
