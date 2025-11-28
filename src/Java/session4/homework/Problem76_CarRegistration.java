package Java.session4.homework;
/**
 * Create an immutable Registration class with a final String plateNumber set only via constructor. In main,
 * construct a registration and print the plate number.
 * Input:
 * None.
 * Output:
 * One line showing the plate number.
 * Example:
 * Registration Plate: 8ABC123*/

class Car_76{
    final String plateNumber;

    protected Car_76(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void showDetails(){
        System.out.println("Registration Plate: "+ plateNumber);
    }
}

public class Problem76_CarRegistration {
    public static void main(String[] args) {
        Car_76 Car1 = new Car_76("TN W 2025");

        System.out.println(Car1.plateNumber);
    }
}
