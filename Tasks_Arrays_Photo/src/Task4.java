import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.print("Let's create an array of random integers! \nPlease enter an array size between 6 and 10: ");

        while (true) {
            int n = scanner.nextInt();
            System.out.println();
            if (n >= 6 && n <= 10) {
                 array = new int[n];
                break;
            } else if (n < 6) {
                System.out.print("The number is too small! Please, try again. \nEnter an array size between 6 and 10: ");
            } else if (n > 10) {
                System.out.print("The number is too big! Please, try again. \nEnter an array size between 6 and 10: ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(20 * Math.random() + 1);
        }
        System.out.println("The array has been created! Here it is: " + Arrays.toString(array));
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n++;
            }
        }
        if (n > 0) {
            int[] newArray = new int[n];
            int m = 0;
            for (int i = 0; i < n; i++) {
                int q = i + m;
                for (int j = q; j < array.length; j++) {
                    if (array[j] % 2 == 0) {
                        newArray[i] = array[j];
                        break;
                    } else {
                        m++;
                    }
                }
            }
            System.out.println("Let's create an array of even numbers that we have in our array of random integers! Here it is: ");
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println("There are no any even numbers in our array of random integers!");
        }
    }
}

