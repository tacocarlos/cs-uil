import java.util.Scanner;

public class ScannerEcho {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = keyboard.nextLine();
        System.out.println("You Entered: " + text);
        keyboard.close();
    }
}