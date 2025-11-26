package Java.session4.inclass;
/**
 * Problem Statement:
 * Create a Member class with private fields (name, memberId, joinYear), and public getters/setters. In
 * setJoinYear(), validate joinYear &gt;= 2000. In main, set fields, attempt an invalid year (show validation
 * message), then set a valid year and print a summary.
 * Input:
 * None.
 * Output:
 * A validation message if an invalid year is set, followed by a final summary line.
 * Example:
 * Join year must be 2000 or later.
 * Alice joined in 2010
 * <p>
 * Concepts Used: Encapsulation, private fields, public accessors, validation.
 * <p>
 */

class Member_65{
    private String name;
    private String memberId;
    private int joinYear;

    //Getter and Setter for name
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter and Setter for memberId;
    public String getMemberId(){
        return memberId;
    }
    public void setMemberId(String memberId){
        this.memberId = memberId;
    }

    //Getter and Setter for joinYear with validation;
    public int getjoinYear(){
        return joinYear;
    }
    public void setJoinYear(int joinYear){
        if (joinYear>=2000){
            this.joinYear=joinYear;
        } else {
            System.out.println("Join year must be 2000 or later.");
        }
    }
}

public class Exercise65_MemberProfile {
    public static void main(String[] args) {
        Member_65 M = new Member_65();
        M.setName("Alice");
        M.setMemberId("M123");
        M.setJoinYear(1995); //Invalid, should trigger validation message
        M.setJoinYear(2010); //valid

        System.out.println(M.getName() + " joined in " + M.getjoinYear());
    }
}

