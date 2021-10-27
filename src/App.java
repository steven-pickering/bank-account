import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final char ACCOUNT_A = 'A';
        final char ACCOUNT_B = 'B';
        final char ACCOUNT_C = 'C';
        final char ACCOUNT_X = 'X';

        double bankAInterestRate = 1.5;
        double bankBInterestRate = 2;
        double bankCInterestRate = 1.5;
        double bankXInterestRate = 5;

        System.out.println("Enter amount of money > ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int years = 0;
        System.out.println("Enter years > ");
        years = scanner.nextInt();

        System.out.println("Select bank account A, B, C or X and press enter");
        char bankAccount = scanner.next().charAt(0);

        switch (bankAccount) {
            case ACCOUNT_A:
                System.out.println("Account A ");
                double amountAfterInterestAccA = interestCalculation(amount, bankAInterestRate, years);
                System.out.println("Amount after interest is > " + amountAfterInterestAccA);
                break;
            case ACCOUNT_B:
                System.out.println("Account B ");
                double amountAfterInterestAccB = interestCalculation(amount, bankAInterestRate, years);
                System.out.println("Amount after interest is > " + amountAfterInterestAccB);
                break;
            case ACCOUNT_C:
                System.out.println("Account C ");
                double amountAfterInterestAccC = interestCalculation(amount, bankAInterestRate, years);
                System.out.println("Amount after interest is > " + amountAfterInterestAccC);
                break;
            case ACCOUNT_X:
                System.out.println("Account X ");
                double amountAfterInterestAccX = interestCalculation(amount, bankAInterestRate, years);
                System.out.println("Amount after interest is > " + amountAfterInterestAccX);
                break;
            default:
                System.out.println("No account selected");


        }

    }

    static double interestCalculation(double amount, double rate, int years) {
//
        return amount * rate * years;
    }
}



