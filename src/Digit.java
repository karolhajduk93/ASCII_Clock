import java.util.ArrayList;
import java.util.HashMap;

public class Digit {
   HashMap<Integer, Character[]> digits = new HashMap<>();

   public Digit(){

       for (int i = 0; i < 10; i++){
           digits.put(i, new Character[10]);
       }

       // 0
       digits.get(0)[0] = ' '; digits.get(0)[1] = '_'; digits.get(0)[2] = '\n';
       digits.get(0)[3] = '|'; digits.get(0)[4] = ' '; digits.get(0)[5] = '|'; digits.get(0)[6] = '\n';
       digits.get(0)[7] = '|'; digits.get(0)[8] = '_'; digits.get(0)[9] = '|';

       // 1
       digits.get(1)[0] = ' '; digits.get(1)[1] = ' '; digits.get(1)[2] = '\n';
       digits.get(1)[3] = ' '; digits.get(1)[4] = ' '; digits.get(1)[5] = '|'; digits.get(1)[6] = '\n';
       digits.get(1)[7] = ' '; digits.get(1)[8] = ' '; digits.get(1)[9] = '|';

       // 2
       digits.get(2)[0] = ' '; digits.get(2)[1] = '_'; digits.get(2)[2] = '\n';
       digits.get(2)[3] = ' '; digits.get(2)[4] = '_'; digits.get(2)[5] = '|'; digits.get(2)[6] = '\n';
       digits.get(2)[7] = '|'; digits.get(2)[8] = '_'; digits.get(2)[9] = ' ';

       // 3
       digits.get(3)[0] = ' '; digits.get(3)[1] = '_'; digits.get(3)[2] = '\n';
       digits.get(3)[3] = ' '; digits.get(3)[4] = '_'; digits.get(3)[5] = '|'; digits.get(3)[6] = '\n';
       digits.get(3)[7] = ' '; digits.get(3)[8] = '_'; digits.get(3)[9] = '|';

       // 4
       digits.get(4)[0] = ' '; digits.get(4)[1] = ' '; digits.get(4)[2] = '\n';
       digits.get(4)[3] = '|'; digits.get(4)[4] = '_'; digits.get(4)[5] = '|'; digits.get(4)[6] = '\n';
       digits.get(4)[7] = ' '; digits.get(4)[8] = ' '; digits.get(4)[9] = '|';

       // 5
       digits.get(5)[0] = ' '; digits.get(5)[1] = '_'; digits.get(5)[2] = '\n';
       digits.get(5)[3] = '|'; digits.get(5)[4] = '_'; digits.get(5)[5] = ' '; digits.get(5)[6] = '\n';
       digits.get(5)[7] = ' '; digits.get(5)[8] = '_'; digits.get(5)[9] = '|';

       // 6
       digits.get(6)[0] = ' '; digits.get(6)[1] = '_'; digits.get(6)[2] = '\n';
       digits.get(6)[3] = '|'; digits.get(6)[4] = '_'; digits.get(6)[5] = ' '; digits.get(6)[6] = '\n';
       digits.get(6)[7] = '|'; digits.get(6)[8] = '_'; digits.get(6)[9] = '|';

       // 7
       digits.get(7)[0] = ' '; digits.get(7)[1] = '_'; digits.get(7)[2] = '\n';
       digits.get(7)[3] = ' '; digits.get(7)[4] = ' '; digits.get(7)[5] = '|'; digits.get(7)[6] = '\n';
       digits.get(7)[7] = ' '; digits.get(7)[8] = ' '; digits.get(7)[9] = '|';

       // 8
       digits.get(8)[0] = ' '; digits.get(8)[1] = '_'; digits.get(8)[2] = '\n';
       digits.get(8)[3] = '|'; digits.get(8)[4] = '_'; digits.get(8)[5] = '|'; digits.get(8)[6] = '\n';
       digits.get(8)[7] = '|'; digits.get(8)[8] = '_'; digits.get(8)[9] = '|';

       // 9
       digits.get(9)[0] = ' '; digits.get(9)[1] = '_'; digits.get(9)[2] = '\n';
       digits.get(9)[3] = '|'; digits.get(9)[4] = '_'; digits.get(9)[5] = '|'; digits.get(9)[6] = '\n';
       digits.get(9)[7] = ' '; digits.get(9)[8] = '_'; digits.get(9)[9] = '|';



   }
}
