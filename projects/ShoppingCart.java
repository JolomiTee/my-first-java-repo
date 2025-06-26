import java.util.Scanner;

public class ShoppingCart {
    public static void main (String[] args) {
        // Shopping cart program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy? :");
        item = scanner.nextLine();

        System.out.print("What is the price of each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nyou have bought " + quantity + " " + item + "(s)");
        System.out.println("Your total is: " + currency + total);

        scanner.close();

    }
}
