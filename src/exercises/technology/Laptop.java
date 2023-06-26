package exercises.technology;

public class Laptop extends Computer {
    private boolean isTouchScreen;
    private final int serialNumber;

    public Laptop(String brand, boolean isTouchScreen) {
        super(brand);
        serialNumber = setSerialNumber();
        this.isTouchScreen = isTouchScreen;
    }

    public String printMessage() {
        return "This laptop is " + super.getBrand() + " and " + (isTouchScreen ? "is a touchscreen." : "is not a touchscreen.");
    }
}
