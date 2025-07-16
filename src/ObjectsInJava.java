
public class ObjectsInJava {
    public static void main (String[] args) {
//        Objects
//        An entity that holds data (attributes) and can                perform actions (methods).
//        It is a reference data type

        Car car = new Car();

//        car.isRunning = true;
//
//        System.out.println(car.model);
//        System.out.println(car.make);
//        System.out.println(car.price);
//        System.out.println(car.isRunning);

        car.start();
        car.drive();
        car.brake();
        car.stop();

        Car car2 = new Car();

        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model);







    }
}
