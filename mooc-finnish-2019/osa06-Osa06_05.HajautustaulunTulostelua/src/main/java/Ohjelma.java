
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        tulostaArvotJosAvaimessa(hm, "a");
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        for (String key: hajautustaulu.keySet()){ 
            System.out.println(key);  
        } 
    
    }
    
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for (String key: hajautustaulu.keySet()){ 
            if(key.contains(merkkijono)) {
                System.out.println(key); 
            }  
        } 
    }
    
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for (String key: hajautustaulu.keySet()){ 
            //if (hajautustaulu.get(key).contains(merkkijono)) {
                //System.out.println(hajautustaulu.get(key)); 
            //} 
            if (key.contains(merkkijono)) {
                System.out.println(hajautustaulu.get(key)); 
            } 
        } 
    }

}
