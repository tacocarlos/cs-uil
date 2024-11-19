import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

// TODO: Implement Scoreboard by creating inner class
public class HiLo {
    public static final int DEFAULT_RANGE_MAX = 100;
    public static final int STARTING_INCORRECT_GUESSES = -1;

    Random randGenerator;
    public int rangeMax;

    Scanner userInput;
    int playerGuess;
    int targetValue;

    int incorrectGuesses = STARTING_INCORRECT_GUESSES;

    public HiLo(InputStream inputStream, int rangeMax) {
        randGenerator = new Random();
        this.rangeMax = rangeMax;
        this.userInput = new Scanner(inputStream);
    }

    public HiLo(int rangeMax) {
        this(System.in, rangeMax);
    }

    public HiLo() {
        this(System.in, DEFAULT_RANGE_MAX);
    }

    private void generateGuess() {
        this.targetValue = randGenerator.nextInt(rangeMax);
    }

    public void setRangeMax(int rangeMax) {
        this.rangeMax = rangeMax;
    }

    public void play() {
        this.generateGuess();

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
            " incorrect guesses to figure out the number"
        );

        this.cleanUp();
    }

    private void cleanUp() {
        incorrectGuesses = STARTING_INCORRECT_GUESSES;
    }
}
