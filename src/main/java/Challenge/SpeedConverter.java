package Challenge;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    
    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%.2f km/h = %d mi/h\n", kilometersPerHour, result);
        }
    }
    
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(25.42);
        printConversion(75.114);
    }
}