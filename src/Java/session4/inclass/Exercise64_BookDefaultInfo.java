package Java.session4.inclass;
/**
 * Problem Statement:
 * Use constructor chaining with this() so the default constructor calls the parameterized one with default values
 * (e.g., &quot;Unknown Title&quot;, &quot;Unknown Author&quot;, 2000). Create a default book and print its details via a method.
 * Input:
 * None.
 * Output:
 * One line with the default book’s info.
 * Example:
 * Unknown Title by Unknown Author (2000)
 *  <p>
 *  Concepts Used: Constructor chaining, this() call.
 *  <p>
 *      */

class Book_64 {
    public String title;
    public String author;
    public int year;

    // Default constructor chaining to parameterized one
    public Book_64() {
        this("Untitled", "Unknown Author", 2000);
    }

    //Parameterized constructor
    public Book_64(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year  = year;
    }

    // Method to display book information
    public void displayInfo(){
        System.out.println(title + " by " + author + " ("+ year+")");
    }
}
public class Exercise64_BookDefaultInfo {
    public static void main(String[] args) {
        Book_64 defaultBook = new Book_64();
        defaultBook.displayInfo();
    }
}
