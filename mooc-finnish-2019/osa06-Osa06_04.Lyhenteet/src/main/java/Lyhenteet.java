import java.util.HashMap;

public class Lyhenteet {
    
    private HashMap<String, String> lyhenteet;
    
    public Lyhenteet() {
        lyhenteet = new HashMap<>();
    }
    public void lisaaLyhenne(String lyhenne, String selite){
        lyhenteet.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        if (lyhenne == null) {
            return false;
        }

        lyhenne = lyhenne.toLowerCase();
        lyhenne = lyhenne.trim();
        
        if (this.lyhenteet.containsKey(lyhenne)) {
            return true;
        }
        return false;
    }
    
    public String haeLyhenne(String lyhenne) {
        if (lyhenne == null) {
            return null;
        }

        return this.lyhenteet.get(lyhenne);
    }
}
