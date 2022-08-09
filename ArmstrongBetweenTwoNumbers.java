import java.io.*;
import java.util.Scanner;

public class ArmstrongBetweenTwoNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int low, high;

    System.out.println("Enter the lower limit: ");
    low = sc.nextInt();
    System.out.println("Enter the upper limit: ");
    high = sc.nextInt();

    System.out.println(
      "Armstrong Numbers within " + low + " and " + high + " is: "
    );
    for (int i = low + 1; i < high; ++i) {
      int num = 0;
      int dig = (int) Math.log10(i) + 1;
      for (int temp = i; temp != 0; temp /= 10) {
        int rem = temp % 10;
        num += Math.pow(rem, dig);
      }
      if (i == num) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
