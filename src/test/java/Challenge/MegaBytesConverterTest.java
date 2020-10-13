package Challenge;

import org.junit.jupiter.api.Test;

import static Challenge.MegaBytesConverter.*;
import static org.junit.jupiter.api.Assertions.*;

class MegaBytesConverterTest {
    
    @Test
    void shouldGetMegaBytes() {
        assertAll(
                () -> assertEquals(2, getMegaBytes(2500)),
                () -> assertEquals(4, getMegaBytes(5000))
        );
    }
    
    @Test
    void shouldGetRemainder() {
        assertAll(
                () -> assertEquals(452, getRemainder(2500)),
                () -> assertEquals(904, getRemainder(5000))
        );
    }
    
    @Test
    void shouldConvertMegaBytesAndKiloBytes() {
        assertAll(
                () -> assertEquals("2500 KB = 2 MB and 452 KB", convertMegaBytesAndKiloBytes(2500)),
                () -> assertEquals("Invalid Value", convertMegaBytesAndKiloBytes(-1024)),
                () -> assertEquals("5000 KB = 4 MB and 904 KB", convertMegaBytesAndKiloBytes(5000))
        );
    }
}