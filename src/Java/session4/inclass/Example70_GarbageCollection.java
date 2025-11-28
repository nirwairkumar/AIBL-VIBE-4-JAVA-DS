package Java.session4.inclass;

/**
 * Problem Statement:
 * Create two car objects and print their details. Set one reference to null, invoke System.gc(), and print a final
 * line indicating that the nulled reference is now eligible for garbage collection.
 * Input:
 * None.
 * Output:
 * Two lines for the cars, then a line noting GC eligibility.
 * Example:
 * Toyota Camry (2020)
 * Honda Civic (2019)
 * car1 has been set to null and is now eligible for garbage collection.*/

public class Example70_GarbageCollection {
    public static void main(String[] args) {
        //Creating two Book_70 objects
        Book_70 book1 = new Book_70("Atomic Habits");
        Book_70 book2 = new Book_70("Deep work");

        // Display details of each book
        book1.printDetails();
        book2.printDetails();

        //Set book1 reference to null - making it eligible for  garbage collection
        book1 = null;

        // Suggest garbage collection (JVM may or may not run it immediately)
        System.gc();

        System.out.println("book1 has been set to null and is now eligible for garbage collection.");

        //checking
//        book1.printDetails();   //giving error
        book2.printDetails();

    }
}

