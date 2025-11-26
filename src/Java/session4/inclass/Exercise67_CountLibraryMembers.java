package Java.session4.inclass;
/**
 * Problem Statement:
 * Add a static counter totalMembers to Member that increments in the constructor. Provide static int
 * getTotalMembers(). In main, create several members and print the total.
 * Input:
 * None.
 * Output:
 * One line with the total member count.
 * Example:
 * Total Library Members: 3
 * <p>
 * Concepts Used: static variables and methods.
 * <p>
 * */

class Member_67 {
    private static int totalMembers = 0;
    private final String name;

    // constructor that increments the static counter
    public Member_67(String name) {
        this.name = name;
        totalMembers++;
    }

    public static int getTotalMembers(){
        return totalMembers;
    }

}


public class Exercise67_CountLibraryMembers {
    public static void main(String[] args) {

        new Member_67("John");
        new Member_67("Emma");
        new Member_67("Liam");

        System.out.println("total Library Members: " + Member_67.getTotalMembers());
    }
}
