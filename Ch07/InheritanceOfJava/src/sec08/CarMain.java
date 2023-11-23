package sec08;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();
        myCar.tire = new Atire();
        myCar.run();
        myCar.tire = new Btire();
        myCar.run();

    }
}
