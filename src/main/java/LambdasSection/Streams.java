package LambdasSection;

import java.util.Collection;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        var employeeList = Stream.of(
                new Employee("John Watson", 45),
                new Employee("Sherlock Holmes", 42),
                new Employee("Mycroft Holmes", 50),
                new Employee("Ms. Hudson", 72))
                .parallel()
                .collect(Collectors.toUnmodifiableList());


        var hr = Stream.of(employeeList)
                .flatMap(Collection::stream)
                .filter(e -> !e.getName().contains("Holmes"))
                .collect(Department.toCollector("Human Resources"));


        var consulting = Stream.of(employeeList)
                .flatMap(Collection::stream)
                .filter(e -> e.getName().contains("Holmes"))
                .collect(Department.toCollector("Consulting"));


        Stream.of(hr, consulting)
                .flatMap(d -> d.getEmployees().stream())
                .forEach(System.out::println);

    }

    private static void employeeStream() {
        IntPredicate lessThan30 = i -> i < 30;
        IntPredicate greaterThan20 = i -> i > 20;

        Predicate<Employee> youngAdultsEmployees = employee ->
                lessThan30.and(greaterThan20)
                        .test(employee.getAge());

        Stream.of(new Employee("Kim", 27),
                new Employee("Sean", 30),
                new Employee("Sarah", 22),
                new Employee("Asi", 44),
                new Employee("Jean", 19))
                .filter(youngAdultsEmployees.negate())
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    private static void intStream() {
        IntSupplier randomSupplier = () -> new Random().nextInt(1000);

        IntStream.generate(randomSupplier)
                .limit(10)
                .forEach(System.out::println);
    }

    private static void booleanStream() {
        Supplier<Boolean> truthyFalsyMachine = () -> new Random().nextBoolean();

        Stream.generate(truthyFalsyMachine)
                .limit(10)
                .forEach(System.out::println);
    }
}
