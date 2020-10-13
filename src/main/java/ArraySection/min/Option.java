package ArraySection.min;

import java.util.Arrays;
import java.util.Optional;

public enum Option {
    MIN(1), REVERSE(2);
    
    private final int value;
    
    Option(int value) {
        this.value = value;
    }
    
    public static Optional<Option> valueOf(int value) {
        return Arrays.stream(values())
                .filter(n -> n.value == value)
                .findFirst();
    }
}
