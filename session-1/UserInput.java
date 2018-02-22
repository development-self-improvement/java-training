import java.util.Scanner;

/**
 * The easiest way to interact with the user in Java is through the command line.
 * This will give a quick example of how to do it.
 */
public class UserInput {

    public static void main(String[] args) {
        // There is an output stream built into Java, this is System.out.
        // We are able to use this to print out comments to the user.
        // https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html
        // The following line will print "Hello World" to the console
        System.out.println("Hello World");

        // Grabbing the user's input we are able to use the "Scanner" class in
        // conjunction with the built in System.in Input Stream to read in the user's
        // input.
        // https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html
        Scanner scan = new Scanner(System.in);

        // The Scanner class has a lot of different methods which return different data types.
        // Please refer to the documentation for more details:
        // https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        
        // This line will read in from the user's input and store the value into "x"
        int x = scan.nextInt();
    }
}