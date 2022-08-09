import java.io.*;
import java.util.Scanner;

public class SmallestAndLargest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements: ");
    int num = sc.nextInt();

    int array[] = new int[num];
    System.out.println("Enter the elemets of the array");

    for (int i = 0; i < num; i++) {
      array[i] = sc.nextInt();
    }

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    System.out.println(
      "Smallest: " +
      array[0] +
      "\nLargest: " +
      array[num - 1] +
      "\nSecond Largest" +
      array[num - 2]
    );
  }
}
