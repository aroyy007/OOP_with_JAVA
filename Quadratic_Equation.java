//Quadratic Problem
import java.lang.Math;
public class Quadratic_Equation {

    public static void main(String[] args) 
  {
        int a = 1, b = -5, c = 6;

        double x1 = (((-b) + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
        double x2 = (((-b) - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
        
        System.out.print("First root of this quadratic equation is : " + x1 + "\n");

        System.out.print("Second root of this quadratic equation is : " + x2 + "\n");

    }
}

