import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();
        int vector[] = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Negative numbers:");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

        scanner.close();
    }
}
