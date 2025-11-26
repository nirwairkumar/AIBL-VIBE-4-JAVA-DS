package Java.session4.inclass;
/**
 * Problem Statement:
 * Override toString() to show book info. Override equals() to compare books by content. In main, create two
 * books with the same data, print them, and compare with == and .equals().
 *
 * Input:
 * None.
 * Output:
 * Two toString() lines, one line for ==, and one line for .equals().
 * Example:
 * Book 1: &quot;Species&quot; by John Baher
 * Book 2: &quot;Species&quot; by John Baher
 * b1 == b2: false
 * b1.equals(b2): true
 * <p>
 * Concepts Used: toString(), .equals(), object comparison.
 * <p>*/
class Book_69{
    private final String title;
    private final String author;

    // constructor to initialize title and author
    public Book_69(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override toString() to print book info clearly
    @Override
    public String toString(){
        return "\"" + title + "\" by " + author;
    }

    //Override equals() to compare content, not memory address
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // same reference
        if (obj == null || getClass() != obj.getClass()) return false; // null or different type
        Book_69 other = (Book_69) obj;
        return title.equals(other.title) && author.equals(other.author);
    }
}

public class Example69_BookEquality {
    public static void main(String[] args) {
        Book_69 b1 = new Book_69("Species", "John Baher");
        Book_69 b2 = new Book_69("Species", "John Baher");

        System.out.println("Book 1: " + b1);
        System.out.println("Book 2: " + b2);

        // == compares object references (memory location)
        System.out.println("b1 == b2: "+ (b1==b2));;  //false

        //.equals() compares content due to our override
        System.out.println("b1.equals(b2): "+ b1.equals(b2)); //true
    }
}
