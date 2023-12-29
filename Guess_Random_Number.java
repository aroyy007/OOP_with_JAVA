package JAVA.Game;

import java.util.Scanner;
import java.util.Random;

// Class representing the game logic
class Game {
    private int randomNum;     // The randomly generated number to be guessed
    private int inputNum;      // The user's input number
    private int noOfGuesses = 0;  // Counter for the number of guesses made by the user

    // Constructor to initialize the game with a random number
    public Game() {
        Random rand = new Random();
        this.randomNum = rand.nextInt(100);
    }

    // Method to take user input
    public void takeUserInput() {
        noOfGuesses++; // Counting the number of guesses

        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number between 1 and 100
        System.out.print("Enter a number between 1 and 100: ");
        this.inputNum = sc.nextInt();

        // Closing the scanner not recommended here to avoid closing System.in
        //sc.close();
    }

    // Getter method to retrieve the number of guesses made
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter method to set the number of guesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Method to check if the user's guess is correct
    public boolean isCorrectNumber() 
    {
        if (inputNum == randomNum) 
        {
            // Displaying the result when the guess is correct
            System.out.println("You guessed " + randomNum + " right in " + noOfGuesses + " attempts\n");
            return true;
        } 
        else if (inputNum < randomNum) 
        {
            // Providing feedback when the guess is too low
            System.out.println("Too low...");
            System.out.println("Try again\n");
        } 
        else if (inputNum > randomNum) 
        {
            // Providing feedback when the guess is too high
            System.out.println("Too high...");
            System.out.println("Try again\n");
        }
        return false;
    }
}

// Main class to execute the random number guessing game
public class Guess_Random_Number {
    public static void main(String[] args) {
        // Creating an instance of the Game class
        Game game = new Game();

        boolean isCorrect = false;

        // Main game loop
        while (!isCorrect) 
        {
            // Taking user input and checking if the guess is correct
            game.takeUserInput();
            isCorrect = game.isCorrectNumber();
        }
    }
}
