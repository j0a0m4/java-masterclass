package Challenge;

import org.junit.jupiter.api.Test;

import static Challenge.BarkingDog.shouldWakeUp;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {
    @Test
    void shouldWakeUpTest() {
        assertAll(
                () -> assertTrue(shouldWakeUp(true, 1)),
                () -> assertFalse(shouldWakeUp(false, 2)),
                () -> assertFalse(shouldWakeUp(true, 8)),
                () -> assertFalse(shouldWakeUp(true, -1))
        );
    }
}