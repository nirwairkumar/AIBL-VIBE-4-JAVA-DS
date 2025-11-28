package Java.session4.homework;

/**
 * Problem Statement:
 * Override toString() to show a car’s details. Override equals() to compare cars by content (e.g., brand and
 * model and/or year). In main, create two cars with the same data, print both, then compare using == and
 * .equals().
 * Input:
 * None.
 * Output:
 * Two toString() lines, then one line for == and one for .equals().
 * Example:
 * Car 1: Toyota Camry (2020)
 * Car 2: Toyota Camry (2020)
 * c1 == c2: false
 * c1.equals(c2): true*/

class Car_79{
    final String brand;
    final String model;
    final int year;

    public Car_79(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString(){
        return "\"" + brand + "\" " + model + "("+year+")";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Car_79 other = (Car_79) obj;
        return brand.equals(other.brand) && model.equals(other.model);
    }
}

public class Problem79_CarEquality {
    public static void main(String[] args){
        Car_79 Car1 = new Car_79("BMW", "740d M sport", 2023);
        Car_79 Car2 = new Car_79("BMW","740d M sport", 2023);

        System.out.println("Car1: " + Car1.brand +" "+ Car1.model +" "+Car1.year);
        System.out.println("Car2: " + Car2.brand +" "+ Car2.model +" "+Car2.year);

        System.out.println("Car1=Car2: "+ (Car1==Car2));
        System.out.println("Car1.equals(Car2): "+ (Car1.equals(Car2)));
    }
}
