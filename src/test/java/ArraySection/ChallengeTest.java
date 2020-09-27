package ArraySection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ArraySection.sort.SortChallenge.sortIntegers;
import static ArraySection.min.MinChallenge.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Array Section Challenges")
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
}