import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int r1, r2, c1, c2;
        System.out.println("Enter the real and complex part of the first number: ");
        r1 = in.nextInt();
        c1 = in.nextInt();

        System.out.println("Enter the real and complex part of the second number: ");
        r2 = in.nextInt();
        c2 = in.nextInt();

        Real a1 = new Real(r1, c1);
        Real a2 = new Real(r2, c2);

        Real a3 = new Real();
        Real a4 = new Real();

        a4 = a3.add(a1, a2);
        System.out.print("\nThe sum is: " + a4.real + " + " + a4.complex + "i");
    }
}

class Real {
    int real, complex;

    public Real(int real, int complex) {
        this.real = real;
        this.complex = complex;
    }

    public Real() {
        // System.out.println("Answer is coming : ");
    }

    public Real add(Real a1, Real a2) {
        Real a3 = new Real();
        a3.real = a1.real + a2.real;
        a3.complex = a1.complex + a2.complex;
        return a3;
    }
}
