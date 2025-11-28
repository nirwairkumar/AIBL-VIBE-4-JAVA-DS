package Java.session4.homework;

/**
 * */


class Car_80 {
    final String brand;
    final String model;
    final int year;

    public Car_80(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void showDetails(){
        System.out.println(this.brand+" "+ this.model+" "+ this.year);
    }
}
public class Problem80_GarbageCollection {
        public static void main(String[] args){
            Car_80 Car1 = new Car_80("Lamborghini", "Urus SE", 2018);
            Car_80 Car2 = new Car_80("BMW", "740i M sport", 2023);

            System.out.println(Car1.brand+" "+ Car1.model+" "+ Car1.year);
            System.out.println(Car2.brand+" "+ Car2.model+" "+ Car2.year+"\n");
            Car1.showDetails();
            Car2.showDetails();

            Car1 = null;

            System.gc();

            System.out.println("book1 has been set to null and is now eligible for garbage collection.");

//            Car1.showDetails(); // giving error
            Car2.showDetails();

        }
}

