public class Car {
    String make;
    String model;
    int year;
    double price;
    boolean isRunning;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }

    Car (String make, String model, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.isRunning = false;
    }


}
