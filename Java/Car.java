public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (passenger != null) {

            System.out.println("id: " + id);
            System.out.println("license: " + license + " Name Driver: " + driver.name);
            System.out.println("Document: " + driver.document + " Email: " + driver.email);
            System.out.println("Password: " + driver.password);
            // passengenger = 3;
            System.out.println("passengenger: " + passenger);
        }
    }

    public Integer getPassengenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasageros");
        }

    }

}
