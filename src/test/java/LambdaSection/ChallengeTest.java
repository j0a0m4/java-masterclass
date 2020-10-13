package LambdaSection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static LambdasSection.Challenges.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@DisplayName("Lambda Section Challenges")
public class ChallengeTest {
    
    @Test
    @DisplayName("should only return elements at odd positions from string")
    void testChallenge3() {
        var sample = "12345567890";
        var expected = "24579";
        
        var result = challenge3.apply(sample);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("should return an ordered List")
    void testChallenge9() {
        List<String> sample = Arrays
                .asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie",
                        "harry", "Jacob");
        
        var expected = Arrays
                .asList("Amelia", "Ava", "Charlie", "Emily", "Harry", "Isla", "Jack", "Jacob",
                        "Oliver", "Olivia");
        
        var result = challenge9(sample);
        
        assertIterableEquals(expected, result);
    }
    
    @Test
    @DisplayName("should return the number of names starting with the specified letter")
    void testChallenge12() {
        List<String> sample = Arrays
                .asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie",
                        "harry", "Jacob");
        
        String[] letters = {"A", "B", "C", "O",};
        int[] expected = {2, 0, 1, 2};
        
        for (int i = 0; i < letters.length; i++) {
            var result = challenge12(sample, letters[i]);
            assertEquals(expected[i], result);
        }
        
    }
}
