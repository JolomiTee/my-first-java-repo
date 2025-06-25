public class Arithmetic {
    public static void main (String[] args){
        int x = 10;
        int y = 20;
        int z = 0;

//      Basic arithmetic
//      z = x + y;
//        z = x - y;
//        z = x * y;
//        z = x % y;

//        Augmented Assignment Operators
//        x += y;
//        x *= y;
//        x -= y;
//        x /= y;
//        x %= y;

//        Increment and Decrement Operators
//        x++;
//        x--;

//        Order of Operations [P-E-M-D-A-S]
//        Parenthesis
//        Exponents
//        Multiplication
//        Division
//        Addition
//        Subtraction

        double result = 3 + 4 * (7 - 5) / 2.0;

       /*
       following the pemdas rule
        3 + 4 * 2 / 2.0 then
        3 + 8 / 2.0 then
        3 + 4
        equal to 7
        */

        System.out.println(result);
    }
}
