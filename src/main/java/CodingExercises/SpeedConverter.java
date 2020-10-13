package CodingExercises;

public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    
    public static String displayConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result < 0) {
            return "Invalid Value";
        } else {
            return String.format("%.2f km/h = %d mi/h", kilometersPerHour, result);
        }
    }
}