package homeworkweek_3;

import java.util.Scanner;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18_sumOfArray {
    public int[] numbers;

    public Programme_18_sumOfArray(int number) {
        numbers = new int[number];
    }

    public void readValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + numbers.length + " numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public int total() {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Programme_18_sumOfArray arraySum = new Programme_18_sumOfArray(size);
        arraySum.readValues();

        int sum = arraySum.total();
        System.out.println("Sum of the array values: " + sum);


    }

}
