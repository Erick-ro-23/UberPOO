class UberX extends Car {
    constructor(license, driver, brand, model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    printDataUberX() {
        super.printDataCar();
        console.log(this.brand);
        console.log(this.model);
    }
}