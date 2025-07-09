import java.util.Random;
import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
//        String name = "Taiwo";
//        int age= 22;
//
//        happyBirthday(name, age);
//        double result = square(5);
//        System.out.println(result);

//        System.out.println(cube(3));
//        String fullname = getFullName("Spongebob", "Square pants");
//        System.out.println(fullname);

//        System.out.println(ageCheck(23));

//        System.out.println(add(2,3, 4));

//        String pizza = bakePizza("flat bread", "mozarella", "pineapple");
//        System.out.println(pizza);

//        JAVA BANKING PROGRAM FOR BEGINNERS

//        DECLARE VARS
//        double balance = 10.99;
//        boolean isRunning = true;
//        int choice;
//
//        while (isRunning) {
//            System.out.println("**************");
//            System.out.println("BANKING PROGRAM");
//            System.out.println("**************");
//            System.out.println("1. Show Balance");
//            System.out.println("2. Deposit");
//            System.out.println("3. Withdraw");
//            System.out.println("4. Exit");
//            System.out.println("**************");
//
//
//            System.out.print("Enter your choice (1-4): ");
//            choice = scanner.nextInt();
//
//
//        DISPLAY MENU
//            switch (choice){
//        showBalance()
//                case 1 -> showBalance(balance);
//        deposit()
//                case 2 -> balance += deposit();
//        withdraw()
//                case 3 -> balance -= withdraw(balance);
//        exit
//                case 4 -> isRunning = false;
//                default -> System.out.println("Enter a number between 1 - 4");
//            }
//        }
//
//
//        System.out.println("****************");
//        System.out.println("Thank you have a nice day");
//        System.out.println("****************");
//
//        scanner.close();

//        JAVA DICE ROLLING PROGRAM

//        DECLARE VARS
            Random random = new Random();
            int numOfDice;
            int total = 0;

        System.out.println("Enter the # of dice you want to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            System.out.println("Dice rolled");
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1,7);
                printDie(roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("# of dice must be greater than 0");
        }

//        CHECK NUMBER OF DICE > 0
//
//                ROLL ALL DICE
//
//                DISPLAY ASCII ART

        scanner.close();
    }


    static void printDie(int roll){
        String dice1 = """
                ---------
                |       |
                |   0   |
                |       |
                ---------
                """;

        String dice2 = """
                ---------
                | 0     |
                |       |
                |     0 |
                ---------
                """;
        String dice3 = """
                ---------
                | 0     |
                |   0   |
                |     0 |
                ---------
                """;
        String dice4 = """
                ---------
                | 0   0 |
                |       |
                | 0   0 |
                ---------
                """;
        String dice5 = """
                ---------
                | 0   0 |
                |   0   |
                | 0   0 |
                ---------
                """;
        String dice6 = """
                ---------
                | 0   0 |
                | 0   0 |
                | 0   0 |
                ---------
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

            default -> System.out.println("Invalid roll");
        }

    }


//    static void showBalance(double balance) {
//        System.out.printf("Your available balance is $%.2f\n", balance);
//    }
//
//    static double deposit () {
//        double amount;
//
//        System.out.println("Enter an amount to be deposited");
//        amount = scanner.nextDouble();
//
//        if (amount < 0) {
//            System.out.println("Amount cant be negative");
//            return 0;
//        } else {
//            return amount;
//        }
//
//    }
//
//    static double withdraw(double balance){
//        double amount;
//
//        System.out.println("Enter amount to withdraw");
//        amount = scanner.nextDouble();
//
//        if (amount > balance) {
//            System.out.println("Insufficient funds");
//            return 0;
//        } else if (amount < 0) {
//            System.out.println("Amount cant be negative");
//            return  0;
//        } else {
//            return  amount;
//        }
//    }





//    static void happyBirthday (String name, int age) {
//        System.out.println("Happy birthday to you");
//        System.out.printf("Happy birthday to %s\n", name);
//        System.out.printf("You are %d years old\n", age);
//        System.out.println("Happy birthday to you");
//    }
//
//    static double square(double number) {
//        return  number * number;
//    }
//
//    static double cube(double number) {
//        return number + number + number;
//    }
//
//    static String getFullName(String first, String last){
//        return first + " " + last;
//    }
//
//    static boolean ageCheck (int age){
//        if (age >= 18) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    OVERLOADED FUNCTIONS

//    static double add(double a, double b){
//        return  a + b;
//    }
//
//    static double add (double a, double b, double c) {
//        return a + b + c;
//    }

//    static  String bakePizza (String bread) {
//        return bread + " pizza";
//    }
//
//    static  String bakePizza (String bread, String cheese) {
//        return cheese + " " + bread + " pizza";
//    }
//
//    static  String bakePizza (String bread, String cheese, String topping) {
//        return topping + " " + cheese + " " + bread + " pizza";
//    }

}
