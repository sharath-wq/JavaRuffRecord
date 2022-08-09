import java.io.*;
import java.util.Scanner;

public class BaseConversion {

  public static void main(String[] args) {
    int p, r, digit, count = 0, i;
    char array[] = new char[20];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the decimal number: ");
    int num = sc.nextInt();

    System.out.println("Enter teh base to be converted: ");
    int base = sc.nextInt();

    p = num;
    do {
      r = p % base;
      digit = '0' + r;
      if (digit > '9') {
        digit += 7;
      }
      array[count] = (char) digit;
      count++;
      p = p / base;
    } while (p != 0);
    System.out.println("\nBase " + base + "Equivalent of num " + num + " is: ");
    for (i = count - 1; i >= 0; --i) {
      System.out.print(array[i]);
    }
    System.out.println("\n");
  }
}
