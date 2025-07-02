import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
//        && = AND;
//        || = OR;
//        ! = NOT

        Scanner scanner = new Scanner(System.in);


        double temp = 10;
        boolean isSunny = false;

//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is GOOD");
//            System.out.println("Its sunny outside");
//        } else if (temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is GOOD");
//            System.out.println("Its cloudy outside");
//        } else if (temp > 30 || temp < 0) {
//            System.out.println("The weather is bad");
//        }

//        username must be between 4 to 12 chars
//        username must not contain spaces or underscores

        String username;

        System.out.println("Enter your username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("username must be between 4 to 12 chars");
        } else if (username.contains(" ") || username.contains("_")){
            System.out.println("User name must not contain spaces or underscores");
        }else {
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}
