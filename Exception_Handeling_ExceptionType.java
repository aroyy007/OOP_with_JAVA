import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {
    public static void main(String[] args) 
    {
        
        Scanner obj = new Scanner(System.in);

        int a;
        boolean done = false;

        while (!done) 
        {
            try 
            {
                System.out.println("Enter a valid number: ");
                a = obj.nextInt();

                System.out.println("Success!! your number is " + a);
                done = true;
            }

            catch (InputMismatchException e) 
            {
                obj.nextLine();
                
                System.out.println(e.getMessage());
                System.out.println("Try again!!");
            }
        }
        obj.close();
    }

}
