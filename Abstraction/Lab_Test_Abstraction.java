package Practice1;

abstract class Vehicle {
    private String model, make;

    public Vehicle(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public abstract void showSignal();

    public void showDetails() {
        System.out.println(model + " " + make);
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}

class Car extends Vehicle {
    String type = "Car";
    int serialNo;

    public Car(String model, String make, int serialNo) {
        super(model, make);
        this.serialNo = serialNo;
    }

    public void showSignal() {
        System.out.println("Blinking");
    }

    public void showDetails() {
        System.out.println(type + " " + getModel() + " " + getMake() + " " + serialNo);
    }
}

public class Lab_Test_Abstraction {
    public static void main(String[] args) {
        Vehicle c1 = new Car("Toyota", "Corolla", 1234);
        c1.showDetails();
        c1.showSignal();
    }
}
