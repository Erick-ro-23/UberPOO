
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver) {
        super(license, driver);

    }

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    void printDataUberVan() {
        super.printDataCar();
        System.out.println("typeCarAccepted: " + typeCarAccepted + " Material: " +
                seatsMaterial);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
        } else {
            System.out.println("Necesitas asignar 4 pasageros");
        }
    }
}