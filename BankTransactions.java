import java.io.*;
import java.util.Scanner;

class Bank {
    int total = 100;

    void withdrawn(int withdrawl) {
        if (total >= withdrawl) {
            System.out.println("withdrawn: " + withdrawl);
            total = total - withdrawl;
            System.out.println("Balance after withdrawal: " + total);
        } else {
            System.out.println("You can not wihtdraw " + withdrawl);
            System.out.println("Your balance is: " + total);
        }

    }

    void deposit(int deposit) {
        System.out.println("Deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: " + total);
    }

    void checkBalance() {
        System.out.println("Your current balance is " + total);
    }

}

public class BankTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        int ch = 0;

        do {
            System.out.println("Press 1 for Withdraw\nPress 2 for Deposit\nPress 3 to check balance\npress 4 to exit\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the withdrawal amount: ");
                    int withdrawAmt = sc.nextInt();
                    obj.withdrawn(withdrawAmt);
                    break;

                case 2:
                    System.out.println("Enter the amount to be Deposit: ");
                    int depositAmt = sc.nextInt();
                    obj.deposit(depositAmt);
                    break;

                case 3:
                    obj.checkBalance();
                    break;

                default:
                    return;
            }
        } while (ch != 4);

    }
}
