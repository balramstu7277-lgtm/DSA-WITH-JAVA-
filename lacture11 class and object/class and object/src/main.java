class student{
    int rollnumber = 21;

    String studentName = "Balram kumar rana" ;
}
public class main {
    public static void main(String[] args) {
        student student1 = new student();
        System.out.println(student1.rollnumber);
        System.out.println(student1.studentName);
        student student2 = new student();
        student2.rollnumber = 30;
        student2.studentName= "Aman";
        System.out.println(student2.studentName);
        System.out.println(student2.rollnumber);
    }


}
