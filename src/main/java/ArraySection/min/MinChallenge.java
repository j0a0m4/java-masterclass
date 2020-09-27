package ArraySection.min;

import java.util.*;

public class MinChallenge {
    public static int findMin(int[] numbers) {
        return Arrays.stream(numbers)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    public static int[] reverse(int[] numbers) {
        Deque<Integer> list = new ArrayDeque<>();
        Arrays.stream(numbers)
                .forEach(list::addFirst);
        return list.stream().parallel()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static void operation(Option option, int[] numbers) {
        switch (option) {
            case MIN:
                System.out.print("O menor número é: ");
                System.out.println(findMin(numbers));
                break;
            case REVERSE:
                System.out.print("O array reverso é: ");
                System.out.println(Arrays.toString(
                        reverse(numbers)));
                break;
        }
    }

    public static void main(String[] args) {
        var input = new MinChallengeIn();
        operation(input.getOption(), input.getNumbers());
    }
}