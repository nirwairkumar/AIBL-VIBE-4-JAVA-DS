package Java.session4.homework;

/**
 * Problem Statement:
 * Define a Car_61 class with public fields brand, model, and year. In main, create two Car_61 objects, assign
 * values, and print their attributes.
 * Input:
 * None.
 * Output:
 * Two lines, each printing one car’s brand, model, and year on a single line.
 * Example:
 * Toyota Camry 2020
 * Honda Civic 2019*/

class Car_71 {
    String brand;
    String model;
    int year;

}


public class Problem71_CarDetails {
    public static void main(String[] args) {
        //First car details;
        Car_71 Car1 = new Car_71();
        Car1.brand = "BMW";
        Car1.model = "740d M Sport";
        Car1.year = 2023;

        // Second car details
        Car_71 Car2 = new Car_71();
        Car2.brand = "Lamborghini";
        Car2.model = "Urus SE";
        Car2.year = 2018;

        //Printing details;
        System.out.println("First car: " + Car1.brand +" "+ Car1.model +"(" +Car1.year+")");
        System.out.println("Second Car: "+ Car2.brand+" "+ Car2.model+"("+Car2.year+")");
    }
}
