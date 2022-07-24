import java.io.*;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

  public static void main(String args[]) {
    int x1, x2, y1, y2;
    double distance;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the x1 point");
    x1 = sc.nextInt();
    System.out.println("Enter the y1 point");
    y1 = sc.nextInt();
    System.out.println("Enter the x2 point");
    x2 = sc.nextInt();
    System.out.println("Enter the y2 point");
    y2 = sc.nextInt();

    distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.println(
      "Distance Between" +
      "(" +
      x1 +
      "," +
      y1 +
      ")," +
      "(" +
      x2 +
      "," +
      y2 +
      ")===>" +
      distance
    );
  }
}
