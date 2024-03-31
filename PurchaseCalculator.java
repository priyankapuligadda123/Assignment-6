import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int purchasedQuantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = 0;

        if (purchasedQuantity > 50) {
            totalExpenses = purchasedQuantity * pricePerItem * 0.9;
        } else if (purchasedQuantity >= 25 && purchasedQuantity <= 50) {
            totalExpenses = purchasedQuantity * pricePerItem * 0.95;
        } else {
            totalExpenses = purchasedQuantity * pricePerItem;
        }

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }
}
