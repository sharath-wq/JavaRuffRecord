import java.io.*;
import java.util.Scanner;

public class ArmstrongBetweenTwoNumbers {

  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    int lowerLimit, upperLimit;

    System.out.println("Enter the Lower Limit: ");
    lowerLimit = sc.nextInt();
    System.out.println("Enter the Upper Limit: ");
    upperLimit = sc.nextInt();

    for (int i = lowerLimit; i < upperLimit; i++) {
      int check, rem, sum = 0;
      check = i;
      while (check != 0) {
        rem = check % 10;
        sum = sum + (rem * rem * rem);
        check = check / 10;
      }

      if (sum == i) {
        System.out.println(" " + i + " is an Armstrong number.");
      }
    }
  }
}
