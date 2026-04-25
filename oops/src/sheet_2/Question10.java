package sheet_2;
class  book {
    String title ;
    int price ;

    // constructor
    book(String title , int price){
        this.title = title;
        this.price = price;
    }
    // copy constructor
    book(book b){
        this.title = b.title;
        this.price = b.price;
    }
    // display method

    void display(){
        System.out.println("Title :- "+ title + " Price :-  " + price);
    }
}

public class Question10 {
     public static void main(String[] args){
         book b1 = new book("java",500);
         book b2 = new book(b1);
         b2.display();
     }
}
