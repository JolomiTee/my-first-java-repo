
import java.util.Scanner;

public class InterestCalculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter compound time per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.print("The amount after " + years + " is: $" + amount);



        scanner.close();
    }
}
