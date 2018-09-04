import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class ASCII_Clock {

    public static void main(String[] args) throws IOException, InterruptedException {

        Digit digit = new Digit();

        HashMap<Integer, Character[]> time = new HashMap<>();

        Calendar cal;
        SimpleDateFormat sdf;
        String timeText;
        char[] charTime;

        while (true) {
            cal = Calendar.getInstance();
            sdf = new SimpleDateFormat("HH:mm:ss");

            timeText = sdf.format(cal.getTime());
            charTime = timeText.toCharArray();

            int iterator = 0;
            for (Character ch : charTime) {
                time.put(iterator, digit.digits.get(Character.getNumericValue(ch)));
                iterator++;
            }

            for (int k = 0; k < 9; k += 3) {
                for (int i = 0; i < 8; i++) {
                    for (int j = k; j < k + 3; j++) {
                        System.out.print(time.get(i)[j]);
                    }
                }
                System.out.println();
            }
            Thread.sleep(1000);
            System.out.println("\n\n\n\n\n\n");
        }
    }
}
