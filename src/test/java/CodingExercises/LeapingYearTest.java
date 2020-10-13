package CodingExercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static CodingExercises.LeapingYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Leaping Year should")
class LeapingYearTest {
    
    @Test
    @DisplayName("be recognized when it is")
    void isLeapYearTest() {
        assertAll(
                () -> assertTrue(isLeapYear(1600)),
                () -> assertTrue(isLeapYear(1924)),
                () -> assertTrue(isLeapYear(2000)),
                () -> assertTrue(isLeapYear(2400))
        );
    }
    
    @DisplayName("not be recognized when it is not")
    @Test
    public void isNotLeapYearTest() {
        assertAll(
                () -> assertFalse(isLeapYear(-1600)),
                () -> assertFalse(isLeapYear(1800)),
                () -> assertFalse(isLeapYear(1900)),
                () -> assertFalse(isLeapYear(2017)),
                () -> assertFalse(isLeapYear(2100)),
                () -> assertFalse(isLeapYear(2200)),
                () -> assertFalse(isLeapYear(2300)),
                () -> assertFalse(isLeapYear(2500)),
                () -> assertFalse(isLeapYear(2600)),
                () -> assertFalse(isLeapYear(10000))
        );
    }
}