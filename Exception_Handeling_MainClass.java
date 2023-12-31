import java.util.Scanner;

public class Exception_Handeling_MainClass 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nom, denom;
        double quotient;

        System.out.print("Input nominator : ");
        nom = in.nextInt();

        System.out.print("Input denominator : ");
        denom = in.nextInt();

        boolean done = false;

        while (!done) 
        {
            try 
            {
                if (denom == 0) 
                {
                    throw new ZeroDivision();
                }

                else if (nom < 0 || denom < 0) {
                    throw new NegativeValue("Negative Value");
                }

                quotient = nom / (float) denom;
                System.out.println("Success!! Answer is : " + quotient);
                done = true;
            }

            catch (ZeroDivision e) 
            {
                System.out.println(e.getMessage());
                System.out.println("Try Again!!");
            }

            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try Again!!");
            }
        }

        in.close();
    }
}

class ZeroDivision extends Exception {
    
    public ZeroDivision() {
        super("Zero Division!!");
    }

    public ZeroDivision(String txt) {
        super(txt);
    }
}

class NegativeValue extends Exception {

    public NegativeValue() {
        super("Negative Value!!");
    }

    public NegativeValue(String txt) {
        super(txt);
    }

}
