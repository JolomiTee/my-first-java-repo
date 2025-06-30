import java.util.Scanner;

public class StringMethods {
    public static void main (String[] args) {
//        String name = "Jolomi Tee";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf("t");
//        int lastIndex = name.lastIndexOf("o");

//        name = name.toUpperCase();
//        name = name.toLowerCase();

//        name = name.trim();
//        name = name.replace("o", "a");

//        if (name.isEmpty()){
//            System.out.print("Your name is empty");
//        } else {
//            System.out.print("Hello " + name);
//        }

//        System.out.print(name.contains(" "));

//        if (name.equals("Jolomi Tee")){
//            System.out.print("Your name cant be password");
//            if (name.equalsIgnoreCase("Inflexible")){
//                return;
//            }
//        } else {
//            System.out.print("Hello " + name);
//        }

//        SUBSTRING METHOD

        Scanner scanner = new Scanner(System.in);
//        String email;
//        String username;
//        String domain;
//
//
//        System.out.print("Enter your email: ");
//        email = scanner.nextLine();
//
//        if (email.contains("@")){
//            int domainPrefix = email.indexOf("@");
//
//            username = email.substring(0, domainPrefix);
//
//            domain = email.substring(domainPrefix + 1);
//
//            System.out.printf("Your username is %s, your domain is %s", username, domain);
//        } else {
//            System.out.print("Invalid email, must contain '@'");
//        }

//        WEIGHT CONVERSION PROGRAM

//        Declare variables
            double weight;
            double newWeight;
            int choice;

//        Welcome message
            System.out.println("Weight conversion program");
            System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Select an option (1 or 2): ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;

            System.out.printf("The new weight in kgs is %.2f kgs", newWeight);
        }
else
        if(choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;

            System.out.printf("The new weight in lbs is %.2f lbs", newWeight);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
