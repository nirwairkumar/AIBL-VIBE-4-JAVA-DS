package Java.session4.inclass;

class Car{
    String brand;
    int year;

    // constructor;
    public Car(String b, int y){
        this.brand = b;
        this.year = y;
    }
    //Method;
    public String showDetails(){
        return "Brand-"+this.brand;
//        System.out.println("Brand:- " + brand);
//        System.out.println("Year:- " + year);
    }

}
public class selfTrial {
    public static void main(String[] args){
        Car C1 = new Car("BMW", 2025);         // creating object;
        Car C2 = new Car("BMW M 750 i", 2023);  // creating object;
        Car C3 = new Car("Lemburghini", 2026);  // creating object;
//        C1.showDetails();                     // C1 action

        System.out.println(C1.showDetails() +"\n"+ C2.showDetails() +"\n"+ C3.showDetails());
    }

}
