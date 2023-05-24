package homeworkweek_3;
/** Write a java program to print the numbers between 1 to 100 which can be divided by 3
*and 5 separately
 */
public class Programme_11_Divided {
    public static void main(String[] args) {

        Programme_11_Divided numbers = new Programme_11_Divided();

        System.out.println("Numbers divisible by 3:");
        numbers.divideBy3();

        System.out.println("Numbers divisible by 5:");
        numbers.divideBy5();
    }

    public void divideBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public void divideBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
