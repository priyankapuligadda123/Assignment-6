import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        
        if (userInput % 7 == 0 && userInput % 13 == 0) {
            int quotient7 = userInput / 7;
            int remainder7 = userInput % 7;
            int quotient13 = userInput / 13;
            int remainder13 = userInput % 13;
            
            System.out.println(userInput + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + quotient7 + ", Remainder: " + remainder7);
            System.out.println("Quotient when divided by 13: " + quotient13 + ", Remainder: " + remainder13);
        } else {
            System.out.println(userInput + " is not divisible by both 7 and 13.");
        }
        
        scanner.close();
    }
}
