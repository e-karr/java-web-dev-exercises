package exercises.technology;

import java.util.Objects;

public class Computer extends AbstractEntity {
    private boolean isComputerOn = false;
    private String brand;
    private final int serialNumber;

    public Computer(String brand) {
        serialNumber = setSerialNumber();
        this.brand = brand;
    }

    public boolean isOn() {
        return isComputerOn;
    }

    public void turnOn() {
        isComputerOn = true;
    }

    public void turnOff() {
        isComputerOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return serialNumber == computer.serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }
}
