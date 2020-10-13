package CodingExercises;

public class LeapingYear {
    
    public static boolean isLeapYear(int year) {
        if (!isValid(year)) {
            return false;
        }
        if (isEvenlyDivisible(year, 4)) {
            if (isEvenlyDivisible(year, 100)) {
                return isEvenlyDivisible(year, 400);
            } else {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isEvenlyDivisible(int year, int divisible) {
        return year % divisible == 0;
    }
    
    public static boolean isValid(int year) {
        return year >= 1 && year < 9999;
    }
}
