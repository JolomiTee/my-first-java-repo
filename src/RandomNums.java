
import java.util.Scanner;
public class RandomNums {
    public static void main (String[] arg) {
//        Random random = new Random();
//
//        int number1;
//        double number2;
//        boolean isHeads;
//
//        number1 = random.nextInt(1,14);
//        number2 = random.nextDouble(1,66);
//        isHeads = random.nextBoolean();
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(isHeads);

        Scanner scanner = new Scanner(System.in);

//      Find the hypotenuse of a triangle (ra)
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Value of a? : ");
//        a = scanner.nextDouble();
//
//        System.out.print("Value of b? : ");
//        b = scanner.nextDouble();
//
//        double a_square = Math.pow(a, 2);
//        double b_square = Math.pow(b, 2);
//
//        double sum = a_square + b_square;
//
//        c = Math.sqrt(sum);
//
//        System.out.println("The hypotenuse of the triangle is: " + c);

//      circumference = 2 * Math.Pi * radius;
//      area = Math.PI * Math.pow(radius, 2);
//      volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is %.1f cm", circumference);
        System.out.printf("The area is %.1f cm2", area);
        System.out.printf("The volume is %.1f cm3", volume );


        scanner.close();
    }
}
