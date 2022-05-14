import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {3, 9, 42, 17, 6};
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            array2[i] = 2 + i * 14 - (15 / (i + 1));
        }
        System.out.println("Two arrays has been created with a size 5. Let's see!");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < 5; i++) {
            sum1 = sum1 + array1[i];
            sum2 = sum2 + array2[i];
        }
        double average1 = (double) sum1 / 5;
        double average2 = (double) sum2 / 5;
        System.out.println("The average of first array is " + average1);
        System.out.println("The average of second array is " + average2);
        if ((average1 - average2) < 0) {
            System.out.println("The average of second array is bigger");
        } else if (((average1 - average2) > 0)) {
            System.out.println("The average of first array is bigger");
        } else if (Math.abs(average1 - average2) < 0.000001) {
            System.out.println("The averages of first and second arrays are the same");
        }

    }
}
