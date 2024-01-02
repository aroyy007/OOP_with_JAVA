
//Multithreading using Runnable interface
class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {

        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");

    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {

        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
    }
}
public class M_Threading_Run_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();  //Runnable target = new Runnable()
        Thread gun1 = new Thread(bullet1);    //Thread(Runnable target)

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
