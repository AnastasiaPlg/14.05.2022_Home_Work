import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Let's sort these names alphabetically: " + Arrays.toString(names));
        System.out.println();
    }
}
