abstract class Abs {
    abstract void call();
}

public class Human extends Abs {
    @Override
    void call() {
        System.out.println("Hello, I'm Human!");
    }
}

public class Robot extends Abs {
    @Override
    void call() {
        System.out.println("Hello, I'm Robot!");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Abs a1 = new Human(); 
        Abs a2 = new Robot(); 
        a1.call();
        a2.call();
    }
}
