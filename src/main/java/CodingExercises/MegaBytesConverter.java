package CodingExercises;

public class MegaBytesConverter {
    
    private static final int megaByte = 1024;
    
    public static int getMegaBytes(int kyloBytes) {
        return kyloBytes / MegaBytesConverter.megaByte;
    }
    
    public static int getRemainder(int kyloBytes) {
        return kyloBytes % MegaBytesConverter.megaByte;
    }
    
    public static String convertMegaBytesAndKiloBytes(int kyloBytes) {
        if (kyloBytes < 0) {
            return "Invalid Value";
        }
        return String.format("%d KB = %d MB and %d KB", kyloBytes,
                             getMegaBytes(kyloBytes), getRemainder(kyloBytes));
    }
    
    public static void printMegaBytesAndKiloBytes(int kyloBytes) {
        System.out.println(convertMegaBytesAndKiloBytes(kyloBytes));
    }
}
