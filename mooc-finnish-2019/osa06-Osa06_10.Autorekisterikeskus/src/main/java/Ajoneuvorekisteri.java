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
import java.util.HashSet;

public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat = new HashMap<>();
    
    public void tulostaRekisterinumerot() {
        for (Rekisterinumero rekkari : omistajat.keySet()) {
            System.out.println(rekkari);
        }
    }
    
    public void tulostaOmistajat() {
        for (String s : new HashSet<>(omistajat.values())) {
            System.out.println(s);            
        }
    }

    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!omistajat.containsKey(rekkari)) {
            omistajat.put(rekkari, omistaja);
            return true;
        } else {
            return false;
        }      
    }
    
    public String hae(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            return omistajat.get(rekkari);
        } else {
            return null;
        }
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            omistajat.remove(rekkari);
            return true;
        } else {
            return false;
        }
    }
}