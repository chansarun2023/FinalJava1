import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter any non-numeric value to finish):");

        // Keep reading input until a non-numeric value is entered
        while (scanner.hasNext()) {
            // Read the next input as a string
            String input = scanner.next();

            // Check if the input is numeric
            if (isNumeric(input)) {
                // If numeric, convert it to integer and display
                int number = Integer.parseInt(input);
                System.out.println("Input number: " + number);
            } else {
                // If non-numeric, break the loop
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is numeric
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  // Regular expression to match numeric strings
    }
}
