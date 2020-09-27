package LambdasSection;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenges {
    public static Supplier<String> iLoveJava = () -> "I love Java!";

    public static Function<String, String> capitalize = s -> s.replace(
            s.substring(0, 1),
            s.substring(0, 1).toUpperCase());

    public static Function<String, String> challenge3 = s -> {
        var builder = new StringBuilder();
        IntStream.range(0, s.length())
                .filter(i -> i % 2 == 1)
                .mapToObj(Stream::of)
                .forEach(i -> i.map(s::charAt)
                        .forEach(builder::append));
        return builder.toString();
    };

    public static String challenge4(final Function<String, String> lambda, final String value) {
        return Stream.of(value)
                .map(lambda)
                .findFirst()
                .orElseThrow();
    }

    public static void challenge5(final Supplier<String> message) {
        Stream.of(message)
                .map(Supplier::get)
                .forEach(System.out::println);
    }

    public static List<String> challenge9(final List<String> names) {
        return names.stream().parallel()
                .map(capitalize)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public static long challenge12(final List<String> names, String letter) {
        return names.stream().parallel()
                .map(capitalize)
                .filter(s -> s.startsWith(letter))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(
                challenge4(challenge3,"12345567890")
        );

        challenge5(iLoveJava);

        List<String> names = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob");

        challenge9(names)
                .forEach(System.out::println);

        System.out.println(
                challenge12(names, "A")
        );
    }
}

