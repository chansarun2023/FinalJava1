import java.util.Scanner;

public class Project1{
    public static void main(String[] args) {
        int[] numbers = inputNumbers();
        viewNumbers(numbers);
    }

    public static int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (enter 'end' to quit):");

        int[] numbers = new int[5];
        int index = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            int number = Integer.parseInt(input);
            if (index >= numbers.length) {
                numbers = resizeArray(numbers, numbers.length * 2);
            }
            numbers[index] = number;
            index++;
        }

        int[] trimmedNumbers = new int[index];
        System.arraycopy(numbers, 0, trimmedNumbers, 0, index);

        return trimmedNumbers;
    }


    public static void viewNumbers(int[] numbers) {
        System.out.println("Input numbers:");
        for (int number : numbers) {
            System.out.print(number+"\t");
        }
    }

    public static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}