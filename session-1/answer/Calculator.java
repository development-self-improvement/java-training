import java.util.Scanner;

/**
 * Using what we have learned so far, let's make a very simple
 * calculator.  It should ask the user the following:
 * 1 - First number
 * 2 - Operator (+, -, *, /)
 * 3 - Second number
 * 
 * Then after that, we should spit out the result (or an error if we don't understand the operator).
 */
public class Calculator {
    
    public static void main(String[] args) {
        // Set up the reader
        Scanner scan = new Scanner(System.in);

        // Ask for (and store) the first number
        System.out.println("What is the first number you would like?");
        int numberOne = scan.nextInt();

        // Ask for (and store) the operator
        System.out.println("What is the operator?");
        String operator = scan.next().trim();

        // Ask for (and store) the second number
        System.out.println("What is the two number you would like?");
        int numberTwo = scan.nextInt();

        // Print out the equation
        System.out.print(numberOne + operator + numberTwo + "=");

        // Evaluate the expression
        // 
        // Please Note:
        // If you are using a string for the operator, you will need to use the `.equals` method
        // to compare the values
        if(operator.equals("+")) {
            System.out.println(numberOne + numberTwo);
        }
        else if(operator.equals("-")) {
            System.out.println(numberOne - numberTwo);          
        }
        else if(operator.equals("/")) {
            System.out.println(numberOne / numberTwo);          
        }
        else if(operator.equals("*")) {
            System.out.println(numberOne * numberTwo);          
        }
        else {
            System.out.println("Invalid operator");
        }

        // Clean up
        scan.close();
    }
}