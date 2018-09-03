import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class ASCII_Clock {

    public static void main(String[] args) {

        Digit digit = new Digit();

        HashMap<Integer, Character[]> time = new HashMap<>();
        //22:53
        time.put(0, digit.digits.get(2));
        time.put(1, digit.digits.get(2));
        time.put(2, digit.digits.get(10));
        time.put(3, digit.digits.get(5));
        time.put(4, digit.digits.get(3));

        for(int k = 0; k < 9; k += 3) {
            for (int i = 0; i < 5; i++) {
                for (int j = k; j < k+3; j++) {
                    System.out.print(time.get(i)[j]);
                }
            }
            System.out.println();
        }

        // displaying digits next to each other
        for(int k = 0; k < 9; k += 3) {
            for (int i = 0; i < 11; i++) {
                for (int j = k; j < k+3; j++) {
                    System.out.print(digit.digits.get(i)[j]);
                }
            }
            System.out.println();
        }

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        //System.out.println( sdf.format(cal.getTime()) );
    }
}
