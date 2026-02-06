import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}


public class MainClass {

     static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("You are eligible!");
        }
    }
    public static void main(String[] args) {


          Scanner sc = new Scanner(System.in);
           try {
            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine()); // may throw NumberFormatException

            checkAge(age); // may throw InvalidAgeException

        } catch (NumberFormatException e) {
            System.out.println("Please enter numbers only!");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Execution completed.");
        }

        sc.close();

    }
}
