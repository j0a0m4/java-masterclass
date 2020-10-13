package CodingExercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static CodingExercises.SpeedConverter.displayConversion;
import static CodingExercises.SpeedConverter.toMilesPerHour;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Speed Converter should")
class SpeedConverterTest {
    
    @Test
    @DisplayName("return the rounded value of the conversion")
    void shouldConvertToMilesPerHour() {
        assertAll(
                () -> assertEquals(1, toMilesPerHour(1.5)),
                () -> assertEquals(6, toMilesPerHour(10.25)),
                () -> assertEquals(-1, toMilesPerHour(-5.6)),
                () -> assertEquals(16, toMilesPerHour(25.42)),
                () -> assertEquals(47, toMilesPerHour(75.114))
        );
    }
    
    @Test
    @DisplayName("format result string according to conversion")
    void shouldDisplayConversion() {
        assertAll(
                () -> assertEquals("Invalid Value", displayConversion(-1)),
                () -> assertEquals("1,50 km/h = 1 mi/h", displayConversion(1.50)),
                () -> assertEquals("10,25 km/h = 6 mi/h", displayConversion(10.25)),
                () -> assertEquals("25,42 km/h = 16 mi/h", displayConversion(25.42)),
                () -> assertEquals("75,11 km/h = 47 mi/h", displayConversion(75.11))
        );
    }
}