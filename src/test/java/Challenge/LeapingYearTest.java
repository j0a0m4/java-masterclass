package Challenge;

import org.junit.jupiter.api.Test;

import static Challenge.LeapingYear.*;
import static org.junit.jupiter.api.Assertions.*;

class LeapingYearTest {
    
    @Test
    void isLeapYearTest() {
        assertAll(
                () -> assertFalse(isLeapYear(-1600)),
                () -> assertTrue(isLeapYear(1600)),
                () -> assertFalse(isLeapYear(1800)),
                () -> assertFalse(isLeapYear(1900)),
                () -> assertTrue(isLeapYear(1924)),
                () -> assertTrue(isLeapYear(2000)),
                () -> assertFalse(isLeapYear(2017)),
                () -> assertFalse(isLeapYear(2100)),
                () -> assertFalse(isLeapYear(2200)),
                () -> assertFalse(isLeapYear(2300)),
                () -> assertTrue(isLeapYear(2400)),
                () -> assertFalse(isLeapYear(2500)),
                () -> assertFalse(isLeapYear(2600)),
                () -> assertFalse(isLeapYear(10000))
        );
    }
}