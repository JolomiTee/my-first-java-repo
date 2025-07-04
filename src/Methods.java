public class Methods {
    public static void main (String[] args) {
//        String name = "Taiwo";
//        int age= 22;
//
//        happyBirthday(name, age);
        double result = square(5);
//        System.out.println(result);

//        System.out.println(cube(3));
//        String fullname = getFullName("Spongebob", "Square pants");
//        System.out.println(fullname);

        System.out.println(ageCheck(23));
    }

    static void happyBirthday (String name, int age) {
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday to %s\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy birthday to you");
    }

    static double square(double number) {
        return  number * number;
    }

    static double cube(double number) {
        return number + number + number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck (int age){
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
