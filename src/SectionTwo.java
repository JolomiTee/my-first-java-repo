
import java.util.Scanner;

public class SectionTwo {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name  = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your GPA?: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a Student? (true/false");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa + ", not bad");

        if (isStudent) {
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are not enrolled as a student");
        }
        scanner.close();
    }
}
