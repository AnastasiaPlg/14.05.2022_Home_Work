import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(10 * Math.random() + 1);
        }
        int[] copyArray = Arrays.copyOf(array, array.length);
        System.out.print("Enter a number from 1 to 10: ");
        int number = scanner.nextInt();
        Arrays.sort(array);
        int n = Arrays.binarySearch(array, number);
        if (n >= 0) {
            System.out.println("Number " + number + " is present in array " + Arrays.toString(copyArray));
        } else System.out.println("Number " + number + " is absent in array " + Arrays.toString(copyArray));




    }
}
