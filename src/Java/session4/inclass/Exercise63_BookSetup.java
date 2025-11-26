package Java.session4.inclass;

import java.awt.print.Book;

/**
 * Problem Statement:
 * Add a default constructor and a parameterized constructor to initialize title, author, and year. In main, create a
 * default book and a parameterized book, and print their details.
 * Input:
 * None.
 * Output:
 * Two lines: one for the default-initialized book, one for the parameterized book.
 * Example:
 *
 * Untitled, Unknown, 2000
 * Dune, Frank Herbert, 1965
 * <p>
 * Concepts Used: Constructor, Overloading, Initialization.
 * <p>
 *     */

class Book_63 {
    public String title;
    public String author;
    public int year;

    // default constructor
    public Book_63() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.year = 2000;
    }

    // Parameterized constructor
    public Book_63(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

}

public class Exercise63_BookSetup {
    public static void main(String[] args) {
        Book_63 B1 = new Book_63();

        Book_63 B2 = new Book_63("Dune", "Frank Herbert", 1965);

        System.out.println("Book 1: "+ B1.title +", "+ B1.author+", "+B1.year);
        System.out.println("Book 2: "+ B2.title +", "+ B2.author+", "+B2.year);
    }
}


//=====Output====================
/*-
Book 1: Untitled, Unknown, 2000
Book 2: Dune, Frank Herbert, 1965
*/
//===============================