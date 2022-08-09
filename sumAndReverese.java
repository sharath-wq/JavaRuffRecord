import java.io.*;
import java.util.Scanner;

public class sumAndReverese {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, sum = 0, rev = 0, d;

    System.out.println("Enter the number: ");
    num = sc.nextInt();

    while (num != 0) {
      d = num % 10;
      num = num / 10;
      sum = sum + d;
      rev = rev * 10 + d;
    }
    System.out.println("Sum of digits: " + sum);
    System.out.println("Reverse of the number: " + rev);
  }
}
