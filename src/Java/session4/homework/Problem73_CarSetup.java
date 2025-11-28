package Java.session4.homework;
/**
 * Problem Statement:
 * Add a default constructor and a parameterized constructor to initialize brand, model, and year. In main, create
 * a default car and a parameterized car, then print both.
 * Input:
 * None.
 * Output:
 * Two lines: first the default-initialized values, then the parameterized values.
 * Example:
 *
 * Untitled, Unknown, 2000
 * Dune, Frank Herbert, 1965
 *
 * If your car example uses real car data, this line would instead reflect cars, e.g.
 * Toyota, Camry, 2020 and Tesla, Model S, 2023.
 * Adjust to your actual code’s print format.*/

class Car_73{
            String brand;
            String model;
            int year;

            public Car_73(){
                this.brand = "Untitled";
                this.model = "Unknown";
                this.year = 2000;
            }

            public Car_73(String brand, String model, int year) {
                this.brand = brand;
                this.model = model;
                this.year = year;
            }

            public void showDetails(){
                if(this.brand.equals("Untitled")){
                    System.out.println(this.brand+", "+this.model+", "+this.year);
                } else {
                    System.out.print(this.brand+", "+this.model+", "+this.year+" ");
                }
            }
        }
public class Problem73_CarSetup {
    public static void main(String[] args){
        Car_73 Car1 = new Car_73();

        Car_73 Car2 = new Car_73("BMW", "740d", 2023);
        Car_73 Car3 = new Car_73("Lamborghini", "Urus SE", 2018);

        Car1.showDetails();
        Car2.showDetails();
        Car3.showDetails();
    }

}
