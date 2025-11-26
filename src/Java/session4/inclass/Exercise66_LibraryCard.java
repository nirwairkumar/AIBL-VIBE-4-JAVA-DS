package Java.session4.inclass;
/**
 * Problem Statement:
 * Create an immutable LibraryCard class with a final String cardNumber set only via constructor. In main, create
 * a card and print the card number.
 * Input:
 * None.
 *
 * Output:
 * One line showing the card number.
 * Example:
 * Library Card Number: LC1001
 * <p>
 * Concepts Used: final, immutability, one-time initialization.
 * <p>
 * */

final class LibraryCard_66 {
    private final String cardNumber;

    // Constructor initializes final field
    public LibraryCard_66(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    //Getter for card Number;
    public String getCardNumber(){
        return cardNumber;
    }

    /*-   ====== setter not possible because this is one time set(final)=====
    // Setter for card Number;
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
     */
}

public class Exercise66_LibraryCard {
    public static void main(String[] args) {
        LibraryCard_66 card = new LibraryCard_66("LC1001");

//        card.cardNumber = "LC333"; // not allowed bcz final field cannot be reassigned

        System.out.println("Library Card Number: " + card.getCardNumber());
    }

}
