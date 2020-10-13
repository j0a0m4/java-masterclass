package ArraySection.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortChallengeIO {
    
    private final Scanner scanner;
    private int[] numbers;
    
    public SortChallengeIO() {
        this.scanner = new Scanner(System.in);
        this.numbers = new int[0];
    }
    
    public int[] getIntegers() {
        displayMenu();
        readNumbers();
        return this.copyArray();
    }
    
    private void displayMenu() {
        System.out.println("Please, enter numbers to be sorted in descending order");
    }
    
    private void readNumbers() {
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            this.addNumber(input);
        }
    }
    
    private void addNumber(int number) {
        int[] arr = copyArray(1);
        arr[arr.length - 1] = number;
        this.numbers = arr;
    }
    
    private int[] copyArray(int len) {
        return Arrays.copyOf(this.numbers, this.numbers.length + len);
    }
    
    private int[] copyArray() {
        return Arrays.copyOf(this.numbers, this.numbers.length);
    }
}
