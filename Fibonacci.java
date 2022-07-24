import java.io.*;
import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    int limit, firstTerm = 0, secondTerm = 1;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit: ");
    limit = sc.nextInt();

    System.out.println("Fibonacci Series till " + limit + ":");

    while (firstTerm < limit) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
