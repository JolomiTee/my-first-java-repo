
public class ObjectsInJava {
    public static void main (String[] args) {
//        Objects
//        An entity that holds data (attributes) and can                perform actions (methods).
//        It is a reference data type

//        Car car1 = new Car("Mercedes", "gle250", 2022);
//        Car car2 = new Car("Toyota", "Camry", 2023);
//        Car car3 = new Car("Honda", "Civic", 2024);
//        car.isRunning = true;
//
//        System.out.println(car.model);
//        System.out.println(car.make);
//        System.out.println(car.price);
//        System.out.println(car.isRunning);

//        car.start();
//        car.drive();
//        car.brake();
//        car.stop();


//        System.out.println(car1.make + " " + car1.model);
//        System.out.println(car2.make + " " + car2.model);
//        System.out.println(car3.make + " is running?" + car3.isRunning);


        Student student = new Student("Taiwo", 32, 4.2);
        Student student2 = new Student("Patrick", 54, 3.8);
        Student student3 = new Student("Susan", 54, 3.8);


        System.out.println(student.name);
        System.out.println(student2.name);
        System.out.println(student3.isEnrolled);

        student3.study();








    }

}
