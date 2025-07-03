import java.util.Scanner;

public class StaticArrayJava {
    public static void main(String[] args) {
        int[] numbers = new int[10];  // Static array of size 10
        Scanner input = new Scanner(System.in);

        // Populate array with user input
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Print all values
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        input.close();
    }
}