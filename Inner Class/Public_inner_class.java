
//public inner class
class Demo1 {
    void show() {
        System.out.println("I am in Demo class");
    }
}

class Anonymous {
    Demo1 d = new Demo1() {
        void show() {
            super.show();
            System.out.println("I am in Anon class");
        }
    };
}

public class Public_inner_class {
    public static void main(String[] args) {
        Anonymous a = new Anonymous();
        a.d.show();
    }
}
