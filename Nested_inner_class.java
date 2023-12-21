
class Outer {
    // private void outerMethod() {
    // System.out.println("inside outerMethod");
    // }

    private static void outerMethod() { // if static, then no need to create
        // object of outer class
        System.out.println("inside outerMethod");
    }

    // A static inner class
    static class Inner {
        public static void display() {
            System.out.println("inside static nested class");
            // Outer obj = new Outer(); // if outerMethod() is not static, then create
            // object of outer class
            // obj.outerMethod();

            // if outerMethod() is static, then no need to create object of outer class
            outerMethod();
        }
    }
}

public class Nested_inner_class {
    public static void main(String[] args) {
        Outer.Inner.display();
    }
}
