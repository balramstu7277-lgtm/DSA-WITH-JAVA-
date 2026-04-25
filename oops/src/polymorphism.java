public class polymorphism {
     static class cat {
         void sound(){
             System.out.println("meow meow");
         }
     }
     static class dog {
         void sound (){
             System.out.println("bhow bhow");
         }
     }
     static class human{
         void sound(){
             System.out.println("hello guys");
         }
     }

     public static void main(String[] args){
         cat c1 = new cat();
         dog d1 = new dog();
         human balram = new human();
         balram.sound(); // polymorphism
         c1.sound();
         d1.sound();
     }
}
