import java.util.Scanner;

public class UserNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        
        char choice;
        
        try {
            do {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                
                if (number > largestNumber) {
                    largestNumber = number;
                }
                if (number < smallestNumber) {
                    smallestNumber = number;
                }
                
                sum += number;
                count++;
                
                System.out.print("Do you want to try again? (Y/N): ");
                choice = scanner.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');
