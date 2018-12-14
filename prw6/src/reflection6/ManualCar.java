package reflection6;

public class ManualCar extends Car {
    @Override
    public String drive() {
        return " ManualCars";
    }

    public ManualCar(String brand) {
        super(brand);
    }
}
