import java.util.Scanner;

public class Main {

    public static final double MINLOAN = 1000.00, MAXLOAN = 99999999, MIN_INTEREST = 1.00, MAX_INTEREST = 8.00;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]){

    } // end main



    //Starting modules and functions

    //MODULES

    //FUNCTIONS

    public static double getDouble(String msg) {
        System.out.println(msg);
        while (!keyboard.hasNextDouble()) {
            keyboard.nextLine();
            System.err.println("Invalid number. Try again.");
        }
        double number = keyboard.nextDouble();
        keyboard.nextLine(); //flushes the buffer
        return number;
    }

    public static double validationLoanInput(double loan){
        while(loan < MINLOAN || loan > MAXLOAN ){
            System.err.println("Invalid Loan Input Amount");
            String msg = "Please, enter your loan amount between 1000 and 99,999,999";
            loan = getDouble(msg);
        }
        return loan;
    }

    public static double validationFirstInterestRate(double firstInterest){
        while(firstInterest < MIN_INTEREST || firstInterest > MAX_INTEREST){
            System.err.println("Invalid First Interest Rate Amount");
            String msg = "Please, enter your first interest rate between 1.00 and 8.00";
            firstInterest = getDouble(msg);
        }
            return firstInterest;
    }

} // end class Main
