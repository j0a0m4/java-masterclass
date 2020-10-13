package Challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Challenge.SpeedConverter.*;

import static org.junit.jupiter.api.Assertions.*;

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
}