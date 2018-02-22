/**
 * This class is used to demonstrate the "if" statement.
 */
public class IfStatements {
    public static void main(String[] args) {
        int x = 0;

        // An if statement is built as follows:
        // This will check if the variable "x" equals the value of 1
        if(/* condition */x == 1) {
            // If it matches the number 1, then we print out "One"
            System.out.println("One");
        }

        // Then we continue with the application
        // An if statement can also have an else block.  This will happen if none of the cases are true.
        if(false) {
            // Since the condition is never hit, this shouldn't ever be executed
            System.out.println("I shouldn't hit here");
        }
        else {
            // Because the top if statement was false, we fall into the else block
            System.out.println("I should always hit here");
        }

        // We can also test multiple conditions
        // These however, will only match a single one and then stop
        if(x == 1) {
            System.out.println("One");
        }
        else if(x == 2) {
            System.out.println("Two");
        }
        else if(x == 1) {
            // This will never happen because we already have a condition for x == 1
            System.out.println("I don't get hit");
        }
    }
}