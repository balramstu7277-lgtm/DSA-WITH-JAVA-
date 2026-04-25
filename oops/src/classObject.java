public class classObject {
    public static class Student{ // user define datatype . also called class
        String name;
        int roll ;
        double cgpa;

        // print method in class
        void print(){
            System.out.println(name + " " + roll + " " + cgpa + " ");
        }
    }
    public static void main(String[] args){
        Student s1 = new Student(); // declaration
        s1.name = "Balram kumar rana";
        s1.roll = 13;
        s1.cgpa = 8.34;
        s1.print();

    }
}
