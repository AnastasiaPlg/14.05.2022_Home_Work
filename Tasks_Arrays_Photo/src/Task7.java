import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = (int) (100 * Math.random() + 1);
        }

        System.out.println("The array has been created! Here it is: \n" + Arrays.toString(ints));
        int n = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (ints[j] < ints[i]) {
                n = ints[j];
                ints[j] = ints[i];
                ints[i] = n;
                }
            }
        }
        System.out.println("Let's sort the array in ascending order by the bubble method: \n" + Arrays.toString(ints));
    }
}
