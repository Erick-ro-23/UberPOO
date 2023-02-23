public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("id: " + id);
        System.out.println("license: " + license + " Name Driver: " + driver.name);
        System.out.println("Document: " + driver.document + " Email: " + driver.email);
        System.out.println("Password: " + driver.password);

        System.out.println("passengenger: " + passengenger);
    }
}
