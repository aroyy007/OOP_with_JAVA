package JAVA.Game;

import java.util.Scanner;

public class Calculator_v1_0_0 {
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to the Calculator!");
        boolean turn_On = true;

        while (turn_On) {
            System.out.println("\t\tWhat would you like to do?\n");
            System.out.println("\tIf you would like to add, type '+' ");
            System.out.println("\tIf you would like to subtract, type '-' ");
            System.out.println("\tIf you would like to multiply, type '*' ");
            System.out.println("\tIf you would like to divide, type '/' ");

            System.out.println("Enter your full expression: ");
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();

            double result = 0;

            for (int i = 0; i < expression.length(); i++) 
            {
                if (expression.charAt(i) == '+') 
                {
                    result = Double.parseDouble(expression.substring(0, i))
                            + Double.parseDouble(expression.substring(i + 1, expression.length()));
                } 
                else if (expression.charAt(i) == '-') 
                {
                    result = Double.parseDouble(expression.substring(0, i))
                            - Double.parseDouble(expression.substring(i + 1, expression.length()));
                } 
                else if (expression.charAt(i) == '*') 
                {
                    result = Double.parseDouble(expression.substring(0, i))
                            * Double.parseDouble(expression.substring(i + 1, expression.length()));
                } 
                else if (expression.charAt(i) == '/') 
                {
                    result = Double.parseDouble(expression.substring(0, i))
                            / Double.parseDouble(expression.substring(i + 1, expression.length()));
                }
            }

            System.out.println("The result is: " + result);

            System.out.println("Would you like to continue? (Y/N)");
            String answer = sc.nextLine();
            if ("Y".equals(answer)) {
                turn_On = true;
            } else if ("N".equals(answer)) {
                turn_On = false;
            } else {
                System.out.println("Invalid input");
            }
        }

    }
}
