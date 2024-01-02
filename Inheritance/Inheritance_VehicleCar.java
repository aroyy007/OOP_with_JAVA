/*Write a Java program to create a class called Vehicle with a method called 
drive(). Create a subclass called Car that overrides the drive() method to 
print "Repairing a car". */

package Inheritance;

class Vehicle {
    public void drive() {
        System.out.println("Vehicle Drive");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleCar {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.drive();
        c.drive();
    }

}
