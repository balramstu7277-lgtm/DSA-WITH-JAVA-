package Array_basic;

class  array{
    void demoArray(){
        int[] age = new int[5];
        age[0]= 10;
        age[1]= 35;
        age[2]= 57;
        age[3]= 58;
        age[4]= 16;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
    }
}
public class array_example {
    public static void main(String[] args) {
        array obj = new array();
        obj.demoArray();
    }
}
