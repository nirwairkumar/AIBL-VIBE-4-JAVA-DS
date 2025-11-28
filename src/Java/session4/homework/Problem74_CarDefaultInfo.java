package Java.session4.homework;

/**
 * Problem Statement:
 * Use constructor chaining with this() so the no-arg constructor calls the parameterized one with default values
 * (e.g., &quot;Unknown Brand&quot;, &quot;Unknown Model&quot;, 2000). In main, create a default car and print details via a method
 * (e.g., displayInfo()).
 * Input:
 * None.
 * Output:
 * One line with the default car’s info.
 * Example:
 * Unknown Brand Unknown Model (2000)*/

class Car_74{
    String brand;
    String model;
    int year;

    public Car_74(){
        this("Untitled", "Unknown", 2000);
    }

    public Car_74(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void showDetails(){
            System.out.println(this.brand+", "+this.model+", "+this.year);
    }
}


public class Problem74_CarDefaultInfo {
    public static void main(String[] args) {
        Car_74 Car1 = new Car_74();
        Car_74 Car2 = new Car_74("BMW", "740d", 2023);
        Car_74 Car3 = new Car_74("Lamborghini", "Urus SE", 2018);

        Car1.showDetails();
        Car2.showDetails();
        Car3.showDetails();
    }

}
