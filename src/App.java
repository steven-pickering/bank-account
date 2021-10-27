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

        System.out.println("Select bank account A, B, C or X and press enter");

        char bankAccount = scanner.next().charAt(0);


        switch (bankAccount) {
            case ACCOUNT_A -> System.out.println("Account A ");
            case ACCOUNT_B -> System.out.println("Account B ");
            case ACCOUNT_C -> System.out.println("Account C ");
            case ACCOUNT_X -> System.out.println("Account X ");
            default -> System.out.println("No account selected");
        }

    }
}

