import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    // Declare variables
    int number = (int) (Math.random() * 100);
    Scanner scanner = new Scanner(System.in);

    // Constructor
    public GuessingGame() {
        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name)");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Welcome, " + name + "!");

        // Get the user's guess
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        //getting a random number
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int tries = 0;
        while (true) {
            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next(); //need to progress past bad input
                System.out.println("That's not an integer, try again");
                continue;
            }
            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }
            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + tries + " tries!");
                break; //exits the loop when the guess is correct
            }
        }
    }
}
