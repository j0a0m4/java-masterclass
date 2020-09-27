package ArraySection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static ArraySection.sort.SortChallenge.sortIntegers;
import static ArraySection.min.MinChallenge.*;
import static LambdasSection.Challenges.*;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {

    @Test
    @DisplayName("sortIntegers should return array in descending order")
    void testSortIntegers() {
        int[] sample = {106, 26, 81, 5, 15};
        int[] expected = {106, 81, 26, 15, 5};

        int[] result = sortIntegers(sample);

        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("findMin should return min elemento from array")
    void testFindMin() {
        int[] sample = {106, 26, 81, 5, 15};
        int expected = 5;

        int result = findMin(sample);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("reverse should return elemento from array in reverse order")
    void testReverse() {
        int[] sample = {106, 26, 81, 5, 15};
        int[] expected = {15, 5, 81, 26, 106};

        int[] result = reverse(sample);

        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("challenge3 should only return elements at odd positions from string")
    void testChallenge3() {
        var sample = "12345567890";
        var expected = "24579";

        var result = challenge3.apply(sample);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("challenge9 should return an ordered List")
    void testChallenge9() {
        List<String> sample = Arrays.asList("Amelia", "Olivia", "emily", "Isla",
                "Ava", "oliver", "Jack", "Charlie", "harry", "Jacob");

        var expected = Arrays.asList("Amelia", "Ava", "Charlie",
                "Emily", "Harry", "Isla", "Jack", "Jacob", "Oliver", "Olivia");

        var result = challenge9(sample);

        assertIterableEquals(expected, result);
    }

    @Test
    @DisplayName("challenge12 should return the number of names starting with the specified letter")
    void testChallenge12() {
        List<String> sample = Arrays.asList("Amelia", "Olivia", "emily", "Isla",
                "Ava", "oliver", "Jack", "Charlie", "harry", "Jacob");

        String[] letters = {"A", "B", "C", "O",};
        int[] expected = {2, 0, 1, 2};

        for (int i = 0; i < letters.length; i++) {
            var result = challenge12(sample, letters[i]);
            assertEquals(expected[i], result);
        }

    }
}