package Java.session4.homework;

/**
 * Problem Statement:
 * In a Car_68 class, overload startEngine() with two versions:
 * ● startEngine() (no args) prints a generic start message.
 * ● startEngine(String sound) prints Starting engine with sound: &lt;sound&gt;.
 * In main, call both methods.
 * Input:
 * None.
 * Output:
 * Two lines, reflecting the two calls.
 * Example:
 * Starting engine...
 * Starting engine with sound: Vroom
 * */

class Car_78{
    String sound;
    public void startEngine(){
        System.out.println("Engine is starting");
    }
    public void startEngine(String sound){
        this.sound = sound;
        System.out.println("Engine is starting with sound: "+ "<"+sound+">");
    }
}
public class Problem78_CarStartEngine {
    public static void main(String[] args){
        Car_78 Car1 = new Car_78();

        Car1.startEngine();
        Car1.startEngine("smooth");
    }
}
