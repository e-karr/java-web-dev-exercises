package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program {
    private Computer test1;
    @Before
    public void createTestObjects() {
        test1 = new Computer("Dell");
    }

    @Test
    public void testAbstractEntityAssignsUniqueSerialNumbers() {
        SmartPhone test2 = new SmartPhone("Apple", 7);

        assertFalse(test1.equals(test2));
    }

    @Test
    public void testComputerTurnsOn() {
        test1.turnOn();

        assertTrue(test1.isOn());
    }

    @Test
    public void testBrandAssignedCorrectly() {
        assertEquals("Dell", test1.getBrand());
    }

    @Test
    public void testLaptopPrintMessage() {
        Laptop testLaptop = new Laptop("Microsoft Surface", true);
        String actualMessage = testLaptop.printMessage();
        String expectedMessage = "This laptop is Microsoft Surface and is a touchscreen.";

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testSmartPhoneText() {
        SmartPhone testPhone = new SmartPhone("iPhone", 8);
        String expected = "Text message sent";

        assertEquals(expected, testPhone.sendText());
    }
}
