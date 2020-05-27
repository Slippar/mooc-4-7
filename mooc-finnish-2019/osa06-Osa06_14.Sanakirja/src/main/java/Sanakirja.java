import java.util.HashMap;
import java.util.ArrayList;

public class Sanakirja {
    private HashMap<String, String> sanat;

    public Sanakirja() {
        sanat = new HashMap<>();
    }

    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> lista;
        
        lista = new ArrayList<>();
        
        for (String sana: sanat.keySet()) {
            lista.add(sana + " = " + sanat.get(sana));
        }
        
        return lista;
        
    }
    
    public int sanojenLukumaara() {
        return sanat.size();
    }
    
    public String kaanna(String sana) {
        
        if (!sanat.containsKey(sana)) {
            return null;
        }
        
        return sanat.get(sana);
    }
    
    public void lisaa(String sana, String kaannos) {
        sanat.put(sana, kaannos);
    }
    
}
