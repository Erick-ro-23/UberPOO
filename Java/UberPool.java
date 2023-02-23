class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String brand, String model, Driver driver, String license) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}