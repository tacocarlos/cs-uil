import java.lang.StringBuilder;
import java.util.Scanner;

public class Average {

    // utility function -- pretty prints an array of any type
    public static <T> void PrintArray(T[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }

        System.out.print(arr[arr.length - 1]);
        System.out.println(']');
    }

    // echos message from System.in
    public static void EchoInput() {
        Scanner userInput = new Scanner(System.in); // create scanner with System.in as input stream
        System.out.print("> ");
        String message = userInput.nextLine(); // get user input until they hit `Enter`
        System.out.println(message);
    }

    // echos the first argument
    public static void EchoArg(String[] args) {
        System.out.print("Given Args: ");
        PrintArray(args); // print args array for fun

        if (args.length == 0) {
            System.out.println("Missing arg!");
        }

        System.out.println(args[0]);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            EchoArg(args);
        } else {
            EchoInput();
        }
    }
}
