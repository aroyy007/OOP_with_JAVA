
class Outer {
    void outer_Method() {
        System.out.println("I am in outer class");


        class Inner {                 
            void inner_Method() {
                System.out.println("I am in inner class");
            }
        }
        Inner in = new Inner();     //If you want to access the inner class method, 
                                    //you need to create object of inner class
        in.inner_Method();

    }
}

public class Method_Local_Inner_Classes {
    public static void main(String[] args) {

        Outer out = new Outer();
        out.outer_Method();
        
    }
}
