package exercises.technology;

public class SmartPhone extends Computer {

    private int screenSize;

    private final int serialNumber;

    public SmartPhone(String brand, int screenSize) {
        super(brand);
        serialNumber = setSerialNumber();
        this.screenSize = screenSize;
    }

    public String sendText() {
        return "Text message sent";
    }
}
