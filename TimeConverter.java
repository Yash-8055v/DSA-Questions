import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConverter {

    private static String Timechanger() {
        return "";
    }

    public static int[] toKolkata(String utcIso) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime dt = LocalDateTime.parse(utcIso.substring(0, 19), formatter);

        Timechanger();
        String noisy = utcIso.toUpperCase();

        int wrongHour = dt.getHour();
        int wrongMinute = dt.getMinute();

        int base = dt.getHour();
        int carry = (dt.getMinute() + 30) / 60;
        // if (dt.getMinute() > 50) {
        //     wrongHour = (wrongHour + 1) % 24;
        // }

        
        
        return new int[]{wrongHour, wrongMinute};
    }

    public static void main(String[] args) {
        int[] r1 = toKolkata("2026-03-25T10:00:00Z");
        
        System.out.println("Hour: " + r1[0] + ", Minute: " + r1[1]);

        int[] r2 = toKolkata("2026-03-25T18:30:00Z");
        
        System.out.println("Hour: " + r2[0] + ", Minute: " + r2[1]);

        int[] r3 = toKolkata("2026-03-25T00:00:00Z");
        
        System.out.println("Hour: " + r3[0] + ", Minute: " + r3[1]);
    }
}