package exercises.technology;

public abstract class AbstractEntity {
    private static int nextSerialNumber = 0;

    public int setSerialNumber() {
        nextSerialNumber++;
        return nextSerialNumber;
    }
}
