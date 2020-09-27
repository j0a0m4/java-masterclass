package ArraySection.min;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinChallengeIn {
    private final static Scanner scanner = new Scanner(System.in);
    private final int[] numbers;
    private final Option option;
    private final int count;

    public MinChallengeIn() {
        this.option = this.readOption();
        this.count = this.readCount();
        this.numbers = this.readIntegers();
    }

    private Option readOption() {
        System.out.println("Escolha operação:");
        System.out.println("1 - Mínimo elemento");
        System.out.println("2 - Elementos em ordem reversa");
        System.out.print("> ");
        return Option.valueOf(scanner.nextInt())
                .orElse(null);
    }

    private int readCount() {
        System.out.println("Insira o total de número que vão ser inseridos");
        System.out.print("> ");
        return scanner.nextInt();
    }

    public int[] getNumbers() {
        return Arrays.copyOf(this.numbers, numbers.length);
    }

    public Option getOption() {
        return option;
    }

    private int[] readIntegers() {
        System.out.println("Insira os números que vão ser comparados");
        return IntStream.range(0, count)
                .map(n -> {
                    System.out.print("> ");
                    return scanner.nextInt();
                })
                .toArray();
    }
}
