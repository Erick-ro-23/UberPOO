
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(Driver driver, String license, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

}