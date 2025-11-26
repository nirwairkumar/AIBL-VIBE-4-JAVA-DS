package Java.session4.inclass;

/**
 * Problem Statement:
 * Define a Book class with public fields (title, author, year). In main, create two Book objects, assign values, and
 * print their attributes.
 * Input:
 * None.
 * Output:
 * Two lines showing each book’s title, author, and year.
 * Example:
 * The Train by George Green (1949)
 * A Children&#39;s by Amanda Owen (2021)
 * <p>
 *  Concepts Used: Class, Object, Attributes, new keyword.
 * <p>
 */

class Book_61{
    public String title;
    public String author;
    public int year;

}
public class Exercise61_BookTracker {
    public static void main(String[] args){
        Book_61 Book1 = new Book_61();  //first book object initiation
        Book1.title = "The Train";
        Book1.author = "George Green";
        Book1.year = 1949;

        //second book initiation
        Book_61 Book2 = new Book_61();  //Second book object initiation
        Book2.title = "A Children's";
        Book2.author = "Amanda Owen";
        Book2.year = 2021;

//        printing the books
        System.out.println(Book1.title + Book1.author + Book1.year);
        System.out.println(Book2.title + Book2.author + Book2.year);
    }
}
