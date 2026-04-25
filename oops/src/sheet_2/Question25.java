package sheet_2;

import java.io.*;
import java.util.*;

class Book {

    private String title;
    private String author;
    private int id;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("ID: " + id + " Title: " + title + " Author: " + author);
    }

    int getId() {
        return id;
    }

    String getData() {
        return id + "," + title + "," + author;
    }
}

class Library {

    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully");
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    void searchBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                System.out.println("Book Found:");
                b.display();
                return;
            }
        }
        System.out.println("Book not found");
    }

    void saveToFile() throws Exception {
        FileWriter fw = new FileWriter("books.txt");
        for (Book b : books) {
            fw.write(b.getData() + "\n");
        }
        fw.close();
        System.out.println("Books saved to file");
    }

    protected void finalize(){
       System.out.println("Library object destroyed");
    }
}

public class Question25 {

    public static void main(String[] args) throws Exception {

        Library lib = new Library();

        Book b1 = new Book(1, "Java Programming", "James Gosling");
        Book b2 = new Book(2, "Python Basics", "Guido Van Rossum");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("\nAll Books:");
        lib.displayBooks();

        System.out.println("\nSearch Book:");
        lib.searchBook(1);

        lib.saveToFile();
    }
}