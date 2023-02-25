public class Car {
    private Integer id;
    private String license;
    private Account driver;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
