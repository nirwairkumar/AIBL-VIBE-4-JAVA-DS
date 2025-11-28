package Java.session4.homework;
/**
 * Problem Statement:
 * Create a Car_65 with private fields brand, model, year, plus public getters and setters. In setYear(), validate
 * that year &gt;= 1886. In main, set fields, attempt an invalid year (print a validation message), then set a valid year
 * and print a final summary (brand, model, year).
 * Input:
 * None.
 * Output:
 * A validation message (if the first year is invalid) and one final summary line.
 * Example:
 * Year must be 1886 or later.
 * Toyota Camry 2015*/

class Car_75{
    private String brand;
    private String model;
    private int year;

    //
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    //
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    //
    public int getYear(){
        return year;
    }
    public void setYear(int launchYear){
        if(launchYear>=1886){
            this.year = launchYear;
        } else{
            System.out.println("launch year is invalid, please enter a valid year.");
        }
    }
}

public class Problem75_CarEncapsulation {
    public static void main(String[] args){
        Car_75 Car1 = new Car_75();
        Car1.setBrand("BMW");
        Car1.setModel("740d M Sport");
        Car1.setYear(1800);
        Car1.setYear(2023);

        System.out.println(Car1.getBrand()+" "+Car1.getModel()+" "+ Car1.getYear());
    }
}
