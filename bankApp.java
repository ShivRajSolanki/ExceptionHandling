import java.util.Scanner;


// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class bankApp {
    static int balance = 5000;

    // Withdraw Method
    static void withdraw(int amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter withdraw amount:");
            int amt = sc.nextInt();

            withdraw(amt);

        }
        catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("Thank you for using Bank App 🙂");
        }

        sc.close();

}
}
