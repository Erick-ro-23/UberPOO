public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundillo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passengenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE234";
        car2.driver = "Juan Herrera";
        car2.passengenger = 3;
        car2.printDataCar();
    }
}
