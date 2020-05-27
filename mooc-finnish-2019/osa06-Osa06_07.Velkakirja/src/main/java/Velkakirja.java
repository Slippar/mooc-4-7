import java.util.HashMap;

public class Velkakirja {
    private HashMap<String, Double> velkakirja;
    
    public Velkakirja() {
        velkakirja = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        this.velkakirja.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        double velka = 0.0;
        
        if (!velkakirja.containsKey(kuka)) {
            return 0;
        } else {
            for (String henkilo: velkakirja.keySet()) {
                if (henkilo.equals(kuka)) {
                    velka = velkakirja.get(henkilo);
                }
            }
        }
        return velka;
    }
}
