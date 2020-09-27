package ArraySection.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortChallenge {
    public static int[] sortIntegers(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void printArray(int[] numbers) {
        Arrays.stream(numbers)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] numbers = new SortChallengeIO().getIntegers();
        int[] sortedNumbers = sortIntegers(numbers);
        printArray(sortedNumbers);
    }
}
