import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Enter strings (enter an empty string to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        // Display the size of the list
        System.out.println("How many items are in this list: " + strings.size());

        scanner.close();
    }
}



