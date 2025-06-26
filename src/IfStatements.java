import java.util.Scanner;

public class IfStatements  {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student?: ");
        isStudent = scanner.nextBoolean();

//        GROUP 1
        if (name.isEmpty()){
            System.out.println("You didnt enter your name");
        } else {
            System.out.println("Hello " + name + "!");
        }

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }


//        GROUP 2
        if (age >= 65) {
            System.out.println("You are a senior");
        } else if (age >= 18) {
            System.out.println("You are an adult");
        }else if (age < 0) {
            System.out.println("You havent been born yet");
        } else if (age == 0) {
            System.out.println("You are just a child");
        } else {
            System.out.println("You are a child");
        }

        scanner.close();
    }
}
