import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (10 * Math.random() + 1);
        }
        int[] copyArray = Arrays.copyOf(array, array.length);
        System.out.println("Array " + Arrays.toString(array) + " has been generated.");
        Arrays.sort(array);
        System.out.print("Enter a number from 1 to 10: ");
        int number = scanner.nextInt();
        System.out.println();
        if (Arrays.binarySearch(array, number) < 0) {
            System.out.println("Number " + number + "is absent in the array");
        } else
            System.out.println("Number " + number + " is in the array. This is array without the number: " + Arrays.toString(exceptNumber(copyArray, number)));
    }

    private static int[] exceptNumber(int[] array, int number) {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                n++;
            }
        }
        int[] newArray = new int[array.length - n];
        int m = 0;
        for (int i = 0; i < newArray.length; i++) {
            int q = i + m;
            for (int j = q; j < array.length; j++) {
                if (array[j] != number) {
                    newArray[i] = array[j];
                    break;
                } else {
                    m++;
                }
            }
        }
        return newArray;
    }


}


