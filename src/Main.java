public class Main {
    public static void main(String[] args){
//        This is my first java program
//        System.out.println("Hi I am boy, this is my first Java code");
//        System.out.print("I am low-key scared of this language\n");

//        PRIMITIVES
        int age = 30;
        int year = 2025;
        
        double price = 200.56;
        double gpa = 3.5;
        double temp = -12.5;

        char grade = '@';
        char symbol = '#';

        boolean isStudent = true;
        boolean isBeginner = false;

//        System.out.print(isStudent);

//        REFERENCES
        String name = "Jolomi Taiwo";
        String food = "Amala";
        String email = "taiwot2002@email.com";

        if (isStudent){
            System.out.println("Yes he is a student");
        } else {
            System.out.println("No he is not a student");
        }
        System.out.print("Hello, i am " + name + ", my favourite food is " + food + " and my email is " + email);
    }
}
