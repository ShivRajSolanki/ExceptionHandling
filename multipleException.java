public class multipleException {
    public static void main(String[] args) {
        try {

            int a = 10 / 0;

        }
        //from java 7 we can write multiple exception in single catch block
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Handled multiple exceptions");
        }

        System.out.println("Done");

        //and the other way is use multiple catch blocks 
    }
    }

