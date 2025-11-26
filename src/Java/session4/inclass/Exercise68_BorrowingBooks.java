package Java.session4.inclass;
/**
 * Problem Statement:
 * In Member, overload borrowBook() with two versions: no-arg (generic message) and one that accepts
 * bookTitle. In main, create a member and call both methods.
 * Input:
 * None.
 * Output:
 * Two lines reflecting the two borrow actions.
 * Example:
 * Sophia borrowed a book.
 * Sophia borrowed: The Alchemist
 * <p>
 * Concepts Used: Method Overloading.
 * <p>
 *     */
class Member_68 {
    private final String name;

    //constructor to initialize member name
    public Member_68(String name) {
        this.name = name;
    }

    //overloaded method with no arguments;
    public void borrowBook() {
        System.out.println(name+ " borrowed a book.");
    }

    //overloaded method with book title
    public void borrowBook(String bookTitle) {
        System.out.println(name + " borrowed: " + bookTitle);
    }
}

public class Exercise68_BorrowingBooks {
    public static void main(String[] args) {
        Member_68 member = new Member_68("Sophia");
        Member_68 member2 = new Member_68("john");
        member2.borrowBook();
        member.borrowBook();
        member.borrowBook("The Alchemist");
    }
}
