
import java.util.HashMap;
import java.util.ArrayList;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private ArrayList<Integer> lista;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.lista = new ArrayList<>();
    }
    
    public double arvosanojenKeskiarvo() {
        
        int summa = 0;
        int lkm = 0;
        
        for (int luku: arvosanat.keySet()) {
            summa += luku * arvosanat.get(luku);
            lkm += arvosanat.get(luku);
        }
        
        return summa / (double)lkm;
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
        
        this.lista.add(pisteet);
    }
    
    public double koepisteidenKeskiarvo() {
        int summa = 0;
        
        for (int luku: lista) {
            summa += luku;
        }
        
        return summa / (double)lista.size();
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }


    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
