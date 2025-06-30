import java.util.Scanner;

public class EnhancedSwitch {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String day;
//        System.out.print("Enter a day: ");
//        day = scanner.nextLine();

//        switch (day) {
//            case "Monday" -> System.out.println("It is a Monday");
//            case "Tuesday" -> System.out.println("It is a Tuesday");
//            case "Wednesday" -> System.out.println("It is a Wednesday");
//            case "Thursday" -> System.out.println("It is a Thursday");
//            case "Friday" -> System.out.println("TGIF");
//            case "Saturday" -> System.out.println("It is a weekend");
//            case "Sunday" -> System.out.println("It is a new week");
//            default -> System.out.println(day + " is not a day");
//
//        }

//        to circumvent unreachable code warning by the IDE
//        switch (day){
//            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
//            case "Saturday", "Sunday" -> System.out.println("It the weekend");
//            default -> System.out.println("It is not a day");
//        }


//        CALCULATOR APP

        double num1;
        double num2;
        char symbol;
        double result = 0;
        boolean validOperator = true;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /, ^)");
        symbol = scanner.next().charAt(0);

        System.out.println("Enter the second number");
        num2 = scanner.nextDouble();

        switch (symbol) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case  '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Invalid Operator");
                validOperator = false;
            }
        }


        if (validOperator) {
            System.out.println(result);
        }


        scanner.close();
    }
}
