package CodingExercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static CodingExercises.BarkingDog.shouldWakeUp;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Barking Dog should")
class BarkingDogTest {
    
    @Test
    @DisplayName("wake up owners when inappropriate")
    @SuppressWarnings("ConstantConditions")
    void shouldWakeUpTest() {
        assertAll(
                () -> assertTrue(shouldWakeUp(true, 1)),
                () -> assertFalse(shouldWakeUp(false, 2)),
                () -> assertFalse(shouldWakeUp(true, 8)),
                () -> assertFalse(shouldWakeUp(true, -1))
        );
    }
}