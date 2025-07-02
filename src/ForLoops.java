import java.util.Scanner;

public class ForLoops {
    public static  void main (String[] args) throws InterruptedException {
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How many seconds to countdown from?");
//        int start = scanner.nextInt();
//
//
//        for (int i = start; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }

//        System.out.println("Happy new YEAR!");

        // break = break out of a loop (STOP)
        // continue = skip current iterations of a loop (SKIP)

//        for (int i = 0; i < 10; i++){
//            if (i == 5) {
//                System.out.println("");
//                continue;
//            }
//
//            System.out.println(i + "");
//        }S

//        NESTED LOOPS
//        for (int i = 1; i < 3; i++) {
//            for (int j = 1; j < 9; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        
        Scanner scanner = new Scanner(System.in);
        
        int row;
        int column;
        char symbol;

        System.out.println("Enter the # of rows: ");
        row = scanner.nextInt();

        System.out.println("Enter the # of columns: ");
        column = scanner.nextInt();

        System.out.println("Enter the # of rows: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
 