import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = ((i + 1) * 3 - 5) * (i + 2);
        }

        System.out.println("The array has been created! Here it is: \n" + Arrays.toString(array));

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println("Let's replace every element of the array with odd index with 0: \n" + Arrays.toString(array));



    }
}
