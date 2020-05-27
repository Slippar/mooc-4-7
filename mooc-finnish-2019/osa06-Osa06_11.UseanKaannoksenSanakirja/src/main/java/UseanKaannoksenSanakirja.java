/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dude
 */
import java.util.HashMap;
import java.util.ArrayList;

public class UseanKaannoksenSanakirja {

    private HashMap<String, ArrayList<String>> sanakirja;
    private ArrayList<String> lista;
    
    public UseanKaannoksenSanakirja() {
        sanakirja = new HashMap<>();
        lista = new ArrayList<>();

    }

    public void lisaa(String sana, String kaannos) {
        
        
      if (!this.sanakirja.containsKey(sana)) {
          this.sanakirja.put(sana, new ArrayList<>());
          this.sanakirja.get(sana).add(kaannos);
      } else {
          this.sanakirja.get(sana).add(kaannos);
      }
        
    }
    
    public ArrayList<String> kaanna(String sana) {
        
        if (!this.sanakirja.containsKey(sana)) {
            return new ArrayList<>();
        } else if (this.sanakirja.get(sana).isEmpty()) {
            return new ArrayList<>();
        }
        
        return this.sanakirja.get(sana);
        
        
        
        
    }

    
    public void poista(String sana) {
        this.sanakirja.remove(sana);
    }
    
}
