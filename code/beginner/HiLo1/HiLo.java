import java.util.Random;
import java.util.Scanner;

public class HiLo {

    public static final int MAX_POSSIBLE_VALUE = 100;

    public static void Play() {
        Random randGenerator = new Random();
        Scanner userInput = new Scanner(System.in);

        int incorrectGuesses = -1; // we add one to incorrectGuesses at start of loop, so if we set to -1 then corrects to 0 at first iteration
        int playerGuess;
        int targetValue = randGenerator.nextInt(MAX_POSSIBLE_VALUE); // generates value in range [0, MAX_POSSIBLE_VALUE)

        do {
            incorrectGuesses++;
            System.out.print("Enter your guess: ");
            playerGuess = userInput.nextInt();
            if (playerGuess < targetValue) {
                System.out.println("Too Low!");
            } else if (playerGuess > targetValue) {
                System.out.println("Too Hi!");
            }
        } while (playerGuess != targetValue);

        System.out.println(
            "You took " +
            Integer.toString(incorrectGuesses) +
            " guesses to figure out the number"
        );

        userInput.close();
    }

    public static void main(String args[]) {
        Play();
    }
}
