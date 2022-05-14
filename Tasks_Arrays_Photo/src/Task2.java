import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Let's create an random integer array of numbers from 1 to 100! \nPlease, enter the size of the array: ");
        int n = scanner.nextInt();
        System.out.println();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
         array[i] = (int) (100 * Math.random() + 1);
        }

        System.out.println("You've just created random integer array " + Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        double average = (double)sum / n;

        System.out.println("Max number in the array is " + max + "; \nMin number in the array is " + min + "; \nAverage number is " + average);

    }
}
