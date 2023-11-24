/*Write a Java program to create a class called Animal with a method called 
makeSound(). Create a subclass called Cat that overrides the makeSound() 
method to bark.*/

package Inheritance;

class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat Sound");
    }
}

public class Inheritance_AnimalCar {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        a.makeSound();
        c.makeSound();
    }

}
