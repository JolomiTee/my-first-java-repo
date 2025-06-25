
import java.util.Scanner;

public class SectionTwo {
    public static  void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter base of triangle: ");
       int base = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Enter height of triangle: ");
       int height = scanner.nextInt();
       int multiplier = base * height;

       double area = 0.5 * multiplier;
       System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}
//  NOTES
//
/*
when accepting an integer first then a sting, sometimes there is new line chavacter like `/n` which is passed
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
