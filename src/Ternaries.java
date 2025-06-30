import java.util.Scanner;

public class Ternaries {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Ternary operators
//        int score = 70;
//        int number = 3;
//
//        int hours = 13;
//
//        String timeOfDay = (hours < 12) ? "AM" : "PM";
//
//        if (score >= 60) {
//            System.out.println("pass");
//        } else {
//            System.out.println("fail");
//        }
//
//        String passedOrFail = (score >= 60) ? "Pass" : "Fail";
//
//        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
//        System.out.println(passedOrFail);
//        System.out.println(evenOrOdd);
//        System.out.println(timeOfDay);

//        TEMPERATURE CONVERTER

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F)");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 /9 : (temp * 9 / 5) + 32;

//        I dont have degree symbol
        System.out.printf("The temperature in %s is %.2f", unit, newTemp);

        scanner.close();
    }
}
