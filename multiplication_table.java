import java.util.Scanner;

public class sum 
{
    public static void main(String[] args) 
  {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int a = in.nextInt();

        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(a + "x" + i + "=" + a * i);
        }
    }
}
