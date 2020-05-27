
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        HashMap<String, String> lempinimet = new HashMap<>();
        lempinimet.put("Matti", "Mage");
        lempinimet.put("Mikael", "Mixu");
        lempinimet.put("Arton", "Arppa");
        
        System.out.println(lempinimet.get("Mikael"));
    }

}
