import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();

        System.out.print("Input second number: ");
        int b = in.nextInt();

        int c = a * b;
        System.out.println(a + " x " + b + " = " + c);

        int d = a + b;
        System.out.println(a + " + " + b + " = " + d);

        int e = a - b;
        System.out.println(a + " - " + b + " = " + e);

        int f = a / b;
        System.out.println(a + " / " + b + " = " + f);

        int g = a % b;
        System.out.println(a + " % " + b + " = " + g);

        in.close();
    }
}
