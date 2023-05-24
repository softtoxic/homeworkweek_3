package homeworkweek_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the numeric array: ");
        int numericSize = scanner.nextInt();
        int[] numericArray = new int[numericSize];

        System.out.println("Enter the elements of the numeric array:");
        for (int i = 0; i < numericSize; i++) {
            numericArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the string array: ");
        int stringSize = scanner.nextInt();
        String[] stringArray = new String[stringSize];

        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < stringSize; i++) {
            stringArray[i] = scanner.next();
        }

        sortNumericArray(numericArray);
        sortStringArray(stringArray);

        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));


    }

    public static void sortNumericArray(int[] array) {
        Arrays.sort(array);
    }

    public static void sortStringArray(String[] array) {
        Arrays.sort(array);
    }
}
