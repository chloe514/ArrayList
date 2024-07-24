import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    private ArrayList<Integer> numbers;
    private Scanner scanner;

    public SumOfList() {
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

    public int calculateSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfList sumOfList = new SumOfList();

        System.out.println("Enter integers to sum. Enter 0 to finish.");
        sumOfList.addNumbers();

        int totalSum = sumOfList.calculateSum();
        System.out.println("Sum of the numbers entered: " + totalSum);

        sumOfList.scanner.close(); // Close the scanner when done
    }
}

