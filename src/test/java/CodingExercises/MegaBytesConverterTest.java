package CodingExercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static CodingExercises.MegaBytesConverter.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("MegaBytes should")
class MegaBytesConverterTest {
    
    @Test
    @DisplayName("get total MB from converting KB to MB")
    void shouldGetMegaBytes() {
        assertAll(
                () -> assertEquals(2, getMegaBytes(2500)),
                () -> assertEquals(4, getMegaBytes(5000))
        );
    }
    
    @Test
    @DisplayName("get remainder KB from converting KB to MB")
    void shouldGetRemainder() {
        assertAll(
                () -> assertEquals(452, getRemainder(2500)),
                () -> assertEquals(904, getRemainder(5000))
        );
    }
    
    @Test
    @DisplayName("convert KB to MB and KB")
    void shouldConvertMegaBytesAndKiloBytes() {
        assertAll(
                () -> assertEquals("2500 KB = 2 MB and 452 KB",
                                   convertMegaBytesAndKiloBytes(2500)),
                () -> assertEquals("Invalid Value",
                                   convertMegaBytesAndKiloBytes(-1024)),
                () -> assertEquals("5000 KB = 4 MB and 904 KB",
                                   convertMegaBytesAndKiloBytes(5000))
        );
    }
}