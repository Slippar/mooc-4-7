
import java.util.ArrayList;

public class MaPu {

    public static double keskiarvo(ArrayList<Integer> luvut) {
        double sum=0;
        int times=0;
        for (int i = 0; i < luvut.size(); i++) {
            sum = sum + luvut.get(i);
            times++;
        }
        return sum / times;
    }
}
