/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dude
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {
    private ArrayList<String> sisalto;
    private HashMap<String, ArrayList> komerot;

    public Kellari() {
        komerot = new HashMap<>();
        sisalto = new ArrayList<>();
    }
 
    public void lisaa(String komero, String tavara) {
        if (!this.komerot.containsKey(komero)) {
          this.komerot.put(komero, new ArrayList<>());
          this.komerot.get(komero).add(tavara);
        } else {
            this.komerot.get(komero).add(tavara);
        }
    }
    
    public ArrayList<String> sisalto(String komero) {
        if (!this.komerot.containsKey(komero)) {
            return new ArrayList<>();
        } else if (this.komerot.get(komero).isEmpty()) {
            return new ArrayList<>();
        }
        
        return this.komerot.get(komero);
    }
    
    public void poista(String komero, String tavara) {
        
        komerot.get(komero).remove(tavara);
        
        if (komerot.get(komero).isEmpty()) {
            komerot.remove(komero);
        }
        
    }
    
    public ArrayList<String> komerot() {
        ArrayList<String> nimet = new ArrayList<>();
        
        for (String komero: komerot.keySet()) {
            if (!komero.isEmpty()) {
                nimet.add(komero);
            }
        }
        
        return nimet;
    }
    
}

