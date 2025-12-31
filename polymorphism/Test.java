// Vehicle class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
//Bike class
class Bike extends Vehicle {
    void run(){
    System.out.println("Bike is running safely");
    }
}
//Test class
public class Test {
    public static void main(String[] args){
        Vehicle v;
        v = new Vehicle();
        v.run();

        v = new Bike();
        v.run();

    }
}
