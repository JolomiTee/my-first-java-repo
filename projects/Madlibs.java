
import java.util.Scanner;

public class SectionTwo {
//    public static  void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//
//       System.out.println("Enter base of triangle: ");
//       int base = scanner.nextInt();
//       scanner.nextLine();
//
//       System.out.println("Enter height of triangle: ");
//       int height = scanner.nextInt();
//       int multiplier = base * height;
//
//       double area = 0.5 * multiplier;
//       System.out.println("The area of the triangle is: " + area);
//        scanner.close();
//    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String adjective1;
        String noun1;
        String verb1;
        String adjective2;

        System.out.println("Enter a name: ");
        name = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter another noun: ");
        noun1 = scanner.nextLine();

        System.out.println("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.println("Enter one more adjective: ");
        adjective2 = scanner.nextLine();

        System.out.println("Today i saw" + name + "\n he was wearing a " + adjective1 + " shirt and \n" +
                "he was just a" + noun1 + ". \nI hope he is happy with " +  verb1 + "and \nfull of " + adjective2
        );
        scanner.close();
    }
}
//  NOTES
//
/*
when accepting an integer first then a sting, sometimes there is new line character like `/n` which is passed
into the reading buffer, and triggers the submission of an empty string to the
scanner asking for a string. example:
    System.out.print("What is your age");
    int age = scanner.nextInt()
    scanner.nextLine() // Fix for empty string passing

    System.out.print("What is your favourite color");
    int color = scanner.nextLine()

    when you input an int, it is read as <value>/n whit `/n` being the character for a new line
    which is then passed to the next input reader as a value, resulting in an empty output for
    the color

    to fix, after the `int age = scanner.nextInt()` add a `scanner.nextLine()`
 */
