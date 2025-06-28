public class PrintStatement {
    public static void main (String[] args) {
/*
        printf() is a method used to format output
        %[flags][width][.precision][specifier-character]

        specifiers are data type dependent:
        String = %s;
        char = %c;
        int = %d;
        double = %f;
        boolean = %b;
*/
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 30.6;
        boolean employed = true;

//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with a %c \n", firstLetter);
//        System.out.printf("You are %d \n", age);
//        System.out.printf("Your are %f inches tall\n", height);
//        System.out.printf("Employed: %b \n", employed);
        System.out.printf("Hello %s, your name starts with a %c.\n", name, firstLetter);

        double price1 = 9.99;
        double price2 = 100.5;
        double price3 = -54.223;

//        Precision
//        System.out.printf("%.1f\n", price1);
//        System.out.printf("%.2f\n", price2);
//        System.out.printf("%.3f\n", price3);

//        Flags
        double price4 = -9000.99;
        double price5 = 10454320.5;
        double price7 = -5234564.223;
        double price8 = 1234567890;

        System.out.printf("%(,.1f\n", price4);
        System.out.printf("% ,.2f\n", price5);
        System.out.printf("% ,.2f\n", price7);
        System.out.printf("%+(,.2f\n", price8);

//        widths
        int id1 = 1;
        int id2 = 12;
        int id3 = 123;
        int id4 = 1234;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%03d\n", id3);
        System.out.printf("%4d\n", id4);









    }
}
