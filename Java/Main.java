public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundillo");
        Car car = new Car("ADN123 ", new Account("Andre Herrera", "JHJ6678", "andreh@email.com", "ad2233"));

        car.printDataCar();

        UberX uberx = new UberX("CHS475 ", new Account("Juan Perez", "QWE123", "juanp89@mail.com", "asdqwe"),
                "Chevrolet", "Spark");
        uberx.setPassenger(3);
        uberx.printDataUberX();

    }
}
