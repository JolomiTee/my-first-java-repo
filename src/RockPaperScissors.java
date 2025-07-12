import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args) {
        // ROCK PAPER SCISSORS
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // DECLARE VARIABLES
//        String[] choices = {"rock", "paper", "scissors"};
//        String playerChoice;
//        String computerChoice;
//        String playAgain = "yes";
//
//        do {
//            // GET CHOICE FROM THE USER
//            System.out.println("Enter you move (rock, paper or scissors");
//            playerChoice = scanner.nextLine().toLowerCase();
//
//            if (
//                    !playerChoice.equals("rock") &&
//                            !playerChoice.equals("paper") &&
//                            !playerChoice.equals("scissors")
//            ){
//                System.out.println("Invalid choice");
//                continue;
//            }
//
//
//            // GET RANDOM CHOICE FROM THE COMPUTER
//            computerChoice = choices[random.nextInt(3)];
//            System.out.println("Computer choice: " + computerChoice);
//
//            // CHECK WIN CONDITIONS
//            if (playerChoice.equals(computerChoice)) {
//                System.out.println("its a tie!");
//            } else if (
//                    playerChoice.equals("rock") && computerChoice.equals("scissors") ||
//                            playerChoice.equals("paper") && computerChoice.equals("rock") ||
//                            playerChoice.equals("scissors") && computerChoice.equals("paper")
//            ) {
//                System.out.println("You win!");
//            } else {
//                System.out.println("You lose!");
//            }
//
//            // ASK TO PLAY AGAIN
//            System.out.println("Play again (Y/N)?");
//            playAgain = scanner.nextLine().toLowerCase();
//        } while (playAgain.equals("yes"));
//
//        // GOODBYE MESSAGE
//        System.out.println("Thanks for playing");
//

//        JAVA SLOT MACHINE
         // DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;
        
        // DISPLAY WELCOME MESSAGE
        System.out.println("*********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: \uD83C\uDF52, \uD83C\uDF49, \uD83C\uDF57, \uD83C\uDF65, \uD83C\uDF47 ");
        System.out.println("*********************");

        // PLAY ID BALANCE > 0
        while (balance > 0) {
            System.out.println("Current Balance: $" +  balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
                System.out.println("Current Balance: $" +  balance);

            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

           payout = getPayout(row, bet);
           if (payout > 0) {
               System.out.println("You won $" + payout);
               balance += payout;
           } else {
               System.out.println("Sorry you lost this round");
           }

            System.out.println("Do you want to play again?");
           playAgain = scanner.nextLine().toUpperCase();
           if (!playAgain.equals("Y")){
               break;
           }
        }

        System.out.println("Game over, your final balance is $" + balance);
        // ENTER BET AMOUNT
        //      VERIFY IF BET > BALANCE
        //      VERIFY IF BET > 0
        //      SUBTRACT BET FROM BALANCE
        // SPIN ROW
        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🍗", "🍥", "🍇"};
        String[] row = new String[3];

        Random random = new Random();


        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];

        }
//        System.out.println(row[0] + row[2] + row[1]);

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("****************");

    }

    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2]) ){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍗" -> bet * 5;
                case "🍥" -> bet * 10;
                case "🍇" -> bet * 20;
                default -> 0;
            };
        } else  if (row[0].equals(row[1]) ){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍗" -> bet * 4;
                case "🍥" -> bet * 5;
                case "🍇" -> bet * 10;
                default -> 0;
            };
        } else  if (row[1].equals(row[2]) ){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍗" -> bet * 4;
                case "🍥" -> bet * 5;
                case "🍇" -> bet * 10;
                default -> 0;
            };
        }


        return 0;
    }
}
