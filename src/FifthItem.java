import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
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

        // Display the fifth item in the list
        if (strings.size() >= 5) {
            System.out.println("The fifth item in the list is: " + strings.get(4));
        } else {
            System.out.println("You entered less than 5 strings.");
        }

        scanner.close();
    }
}



