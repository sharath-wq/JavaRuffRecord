import java.io.*;
import java.util.Scanner;

public class MergeTwoArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int aSize, bSize, i = 0, j = 0, k = 0;
    int a[] = new int[20];
    int b[] = new int[20];

    System.out.println("Enter the size of the first array: ");
    aSize = sc.nextInt();
    System.out.println("Enter the elements of the first array: ");
    for (i = 0; i < aSize; i++) {
      a[i] = sc.nextInt();
    }

    System.out.println("Enter the size of the second array: ");
    bSize = sc.nextInt();
    System.out.println("Enter the elements of the second array: ");
    for (i = 0; i < bSize; i++) {
      b[i] = sc.nextInt();
    }

    int res[] = new int[aSize + bSize];
    i = 0;

    while (i < aSize) {
      res[k] = a[i];
      i += 1;
      k += 1;
    }

    while (j < bSize) {
      res[k] = b[j];
      j += 1;
      k += 1;
    }
    // sorting
    // for (i = 0; i < res.length; i++) {
    //   for (j = i; j < res.length; j++) {
    //     if (res[j] > res[j + 1]) {
    //       int temp = res[j];
    //       res[j] = res[j + 1];
    //       res[j + 1] = temp;
    //     }
    //   }
    // }

    System.out.println("Array after merging: ");
    for (i = 0; i < res.length; i++) {
      System.out.print(res[i] + ", ");
    }
  }
}
