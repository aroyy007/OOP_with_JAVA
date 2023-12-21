package Practice1;

//static inner class
class Demo {
    void show() {
        System.out.println("I am in Demo class");
    }
}

class Anon {
    static Demo d = new Demo() {
        void show() {
            super.show();
            System.out.println("I am in Anon class");
        }
    };
}

public class Static_inner_class {
    public static void main(String[] args) {
        Anon.d.show();
    }
}
