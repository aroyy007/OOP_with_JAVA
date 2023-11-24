/*Write a Java program to create a class called Shape with a method 
called getArea(). Create a subclass called Rectangle that overrides 
the getArea() method to calculate the area of a rectangle. */

package Inheritance;

class Shape {
    public void getArea() {
        System.out.println("Shape Area");
    }
}

class Rectangle extends Shape {
    private double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void getArea() {
        System.out.println("Rectangle Area is " + l * b);
    }
}

class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        System.out.println("Circle Area is " + Math.PI * r * r);
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);
        s.getArea();
        r.getArea();
        c.getArea();
    }

}
