public class AboutVarargs {
    public static void main (String[] args) {
        System.out.println(add(1,2,3,4,5));
        System.out.println(average(1,2,3,4,5));

    }

     static int add(int... numbers){

        int sum = 0;

        if (numbers.length == 0){
            return 0;
        }

        for (int number: numbers){
            sum += number;
        }

        return  sum;
    };

    static double average(int... numbers){

        double sum = 0;

        for (int number: numbers){
            sum += number;
        }

        return  sum / numbers.length;
    };
}
