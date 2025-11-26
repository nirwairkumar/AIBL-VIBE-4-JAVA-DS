package Java.session4.inclass;

/**
 * Problem Statement:
 * Add a method displayInfo() that prints a book’s title, author, and year. Use this to reference fields. In main,
 * create one book, set fields, and call displayInfo().
 * Input:
 * None.
 * Output:
 * A single line with the book’s title, author, and year.
 * Example:
 * To Kill a Mockingbird by Harper Lee (1960)
 * <p>
 *  * Concepts Used: Methods, this, object behaviors.
 *  * <p>*/

class Book_62{
    public String title;
    public String author;
    public int year;

    // Method
    public void displayInfo(){
        System.out.println(this.title + " by "+ this.author +"("+this.year+")");
    }
}
public class Exercise62_BookDetails {
    public static void main(String[] args){

        Book_62 book = new Book_62();
        book.title = "To Kill a Mockingbird";
        book.author = "Herber Lee";
        book.year = 1960;

        book.displayInfo();

    }
}
