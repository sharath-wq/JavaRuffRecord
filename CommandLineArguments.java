public class CommandLineArguments {

  public static void main(String args[]) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int sum = num1 + num2;
    int diff = num1 - num2;
    int prod = num1 * num2;
    int quo = num1 / num2;
    int rem = num1 % num2;

    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    System.out.println(
      "The difference of " + num1 + " and " + num2 + " is " + diff
    );
    System.out.println(
      "The product of " + num1 + " and " + num2 + " is " + prod
    );
    System.out.println(
      "The quotient of " + num1 + " and " + num2 + " is " + quo
    );
    System.out.println(
      "The remainder of " + num1 + " and " + num2 + " is " + rem
    );
  }
}
