////////////////////////////////////////////////////////////////////
// Gaetano Spagnoli 2147977
// Ruben Spadiliero 2075522
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Inserisci un numero (1-1000): ");
    int number = scanner.nextInt();

    System.out.println();
    System.out.println(RomanPrinter.print(number));

    scanner.close();
  }
}
