import java.io.*;
import java.util.Scanner;

public class TraceAndTranspose {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows, cols, i, j, trace = 0;
    int matrix[][] = new int[20][20];

    System.out.println("Enter the Number of rows: ");
    rows = sc.nextInt();
    System.out.println("Enter the Number of columns: ");
    cols = sc.nextInt();

    System.out.println("Enter the Elements of the Matrix: ");
    for (i = 0; i < rows; i++) {
      for (j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    System.out.println("Entered Matrix is: ");
    for (i = 0; i < rows; i++) {
      for (j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
        if (i == j) {
          trace += matrix[i][j];
        }
      }
      System.out.println();
    }

    System.out.println("Trace of the Matrix is: " + trace);
    System.out.println("Transpose of the Matrix is: ");
    for (i = 0; i < rows; i++) {
      for (j = 0; j < cols; j++) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }
}
