public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundillo");
        Car car = new Car("AMQ123 ", new Account("Andres Herrera", "AND123"));
        car.passengenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE234 ", new Account("Juan Herrera", "AFD234"));
        car2.passengenger = 3;
        car2.printDataCar();
    }
}
