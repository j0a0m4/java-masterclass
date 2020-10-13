package ArraySection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ArraySection.min.MinChallenge.findMin;
import static ArraySection.min.MinChallenge.reverse;
import static ArraySection.sort.SortChallenge.sortIntegers;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Array Section Challenges")
class ChallengeTest {
    
    @Test
    @DisplayName("should return array in descending order")
    void testSortIntegers() {
        int[] sample = {106, 26, 81, 5, 15};
        int[] expected = {106, 81, 26, 15, 5};
        
        int[] result = sortIntegers(sample);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("should return min elemento from array")
    void testFindMin() {
        int[] sample = {106, 26, 81, 5, 15};
        int expected = 5;
        
        int result = findMin(sample);
        
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("should return elements from array in reverse order")
    void testReverse() {
        int[] sample = {106, 26, 81, 5, 15};
        int[] expected = {15, 5, 81, 26, 106};
        
        int[] result = reverse(sample);
        
        assertArrayEquals(expected, result);
    }
}