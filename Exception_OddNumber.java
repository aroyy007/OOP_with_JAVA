import java.util.Scanner;

class OddNumber extends Exception 
{
    public OddNumber() {
        super("You have entered an odd number");
    }
}

public class Exception_OddNumber 
{
    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);

        int num;
        boolean done = false;

        while (!done) 
        {
            try 
            {
                System.out.print("Enter a number: ");
                num = in.nextInt();

                if (num % 2 == 0) 
                {
                    System.out.println("Success!! your number is " + num);
                    done = true;
                } 
                else 
                {
                    throw new OddNumber();
                }
            } 
            catch (OddNumber e) 
            {
                System.out.println(e.getMessage());
                System.out.println("Try again!!");
            }
        }
        in.close();
    }

}
