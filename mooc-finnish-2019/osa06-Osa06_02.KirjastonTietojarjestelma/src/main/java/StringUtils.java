public class StringUtils {
    public static boolean sisaltaa(String sana, String haettava) {
        
        if (sana.equals(null) || haettava.equals(null)) {
            return false;
        }
        
        sana = sana.toUpperCase();
        haettava = haettava.toUpperCase();
        
        sana = sana.trim();
        haettava = haettava.trim();
        
        if (sana.contains(haettava)) {
            return true;
        }
        
        return false;
        
    }
}
