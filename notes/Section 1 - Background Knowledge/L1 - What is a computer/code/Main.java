import java.util.List;
import java.util.LinkedList;
import java.lang.StringBuilder;

public class Main {
    static List<Integer> decimalToBinary(int n) {
        LinkedList<Integer> binaryDigits = new LinkedList<Integer>();
        while(n != 0) {
            int remainder = n % 2;
            binaryDigits.addFirst(remainder);
            n = n / 2; // Java throws away remainder in integer division
        }
        return binaryDigits;
    }

    static <T> String ListJoin(List<T> list) {
        StringBuilder builder = new StringBuilder();
        list.forEach((x) -> builder.append(x.toString()));
        return builder.toString();
    }

    public static void main(String[] args) {
        int n = 5414;
        List<Integer> binaryDigits = decimalToBinary(n);
        System.out.println("Received: " + Integer.toString(n));
        System.out.println("Binary List: " + binaryDigits.toString());
        System.out.println("Binary String: " + ListJoin(binaryDigits));
    }
}