package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount: ");
    int n = scanner.nextInt();
    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Enter a number: ");
      vect[i] = scanner.nextInt();
    }

    System.out.println("Negative numbers:");

    for (int i = 0; i < vect.length; i++) {
      if (vect[i] < 0) {
        System.out.println(vect[i]);
      }
    }

    scanner.close();
  }
}
