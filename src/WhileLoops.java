import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);

//        String name = "";
//
//        while (name.isEmpty()){
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);


//        String response = "";
//
//        while (!response.equals("Q")){
//            System.out.println("You are a gamer");
//            System.out.println("Press Q to quit");
//            response = scanner.next().toUpperCase();
//        }
//        System.out.println("You have quit the game");

        int age;

//        System.out.println("Enter your age: ");
//        age =  scanner.nextInt();
//
//        while (age < 0){
//            System.out.println("Your age cant be negative");
//            System.out.println("Enter your age: ");
//            age =  scanner.nextInt();
//        }

//        do{
//            System.out.println("Your age cant be negative");
//            System.out.println("Enter your age: ");
//            age =  scanner.nextInt();
//        } while (age < 0);
//
//        System.out.println("You are " + age + " years old ");

//        int number = 0;
//
//        do {
//            System.out.println("Enter a number between 1 - 10");
//            number = scanner.nextInt();
//        } while (number < 1 || number > 10);
//
//        System.out.println("You picked " + number);


//        NUMBER GUESSING GAME

        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 50;
        int randomNumber = random.nextInt(min, max+1);


        System.out.println(randomNumber);
        System.out.printf("Guess a number between %d - %d\n", min, max);

        do {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low, try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct!, the number was: " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        } while(guess != randomNumber);

//        System.out.println("You have won");
        scanner.close();
    }
}
