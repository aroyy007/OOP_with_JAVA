import java.util.Scanner;

public class Ex_4 {

    public static double cal(int nom, int denom) throws ZeroDivision, NegativeValue {
        double quotient;

        if (denom == 0) {
            throw new ZeroDivision();
        }

        if (nom < 0 || denom < 0) {
            throw new NegativeValue();
        }

        quotient = nom / (float) denom;

        return quotient;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nom, denom;
        double quotient;

        System.out.print("Input nominator : ");
        nom = in.nextInt();

        System.out.print("Input denominator : ");
        denom = in.nextInt();

        boolean done = false;

        while (!done) {
            try {
                quotient = cal(nom, denom);
                System.out.println("Success!! Answer is : " + quotient);
                done = true;
            }

            catch (ZeroDivision e) {
                System.out.println(e.getMessage());
                System.out.println("Try Again!!");
            }

            catch (NegativeValue e) {
                System.out.println(e.getMessage());
                System.out.println("Try Again!!");
            }
        }
        in.close();
    }
}

class ZeroDivision extends Exception {
    
    public ZeroDivision() {
        super("Zero Division Error");
    }
}

class NegativeValue extends Exception {
   
    public NegativeValue() {
        super("Negative Value Error");
    }
}
