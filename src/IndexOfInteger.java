import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    private ArrayList<Integer> numbers;
    private Scanner scanner;

    public IndexOfInteger() {
        numbers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addNumbers() {
        while (true) {
            try {
                System.out.print("Enter an integer (enter 0 to finish): ");
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                numbers.add(num);
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
    }

    public void findIndex() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        try {
            System.out.print("Enter the number to find its index: ");
            int target = scanner.nextInt();
            int index = numbers.indexOf(target);

            if (index != -1) {
                System.out.println("Index of " + target + " is: " + index);
            } else {
                System.out.println(target + " not found in the list.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }

    public static void main(String[] args) {
        IndexOfInteger indexOfInteger = new IndexOfInteger();

        System.out.println("Enter integers. Enter 0 to finish.");
        indexOfInteger.addNumbers();

        System.out.println("\nFinding index of a number in the list.");
        indexOfInteger.findIndex();

        indexOfInteger.scanner.close(); // Close the scanner when done
    }
}

