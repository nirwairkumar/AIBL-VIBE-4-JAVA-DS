package Java.session4.homework;

/**
 * Problem Statement:
 * Create a Car_62 (or similar) with fields brand, model, year and a method displayInfo() that prints them. Use
 * this to reference fields. In main, set fields and call displayInfo().
 * Input:
 * None.
 * Output:
 * One line with brand, model, and year, printed by displayInfo().
 * Example:
 * Tesla Model S (2023)*/

class Car_72{
    String brand;
    String model;
    int year;

    public void showDetails(){
        if(this.brand.equals("Untitled")){
            System.out.println(this.brand+", "+this.model+", "+this.year);
        } else {
            System.out.print(this.brand+", "+this.model+", "+this.year+" ");
        }
    }


}
public class Problem72_CarDisplayInfo {
    public static void main(String[] args){
        Car_73 Car2 = new Car_73("BMW", "740d", 2023);
        Car_73 Car3 = new Car_73("Lamborghini", "Urus SE", 2018);

        Car2.showDetails();
        Car3.showDetails();
    }
}
