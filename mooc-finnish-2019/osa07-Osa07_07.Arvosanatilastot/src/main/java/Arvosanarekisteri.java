import java.util.HashMap;
import java.util.ArrayList;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private ArrayList<Integer> keskiarvo;
    private ArrayList<Integer> hyvaksyttyKeskiarvo;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.keskiarvo = new ArrayList<>();
        this.hyvaksyttyKeskiarvo = new ArrayList<>();

    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
        this.keskiarvo.add(pisteet);
        if (pisteet >= 50 && pisteet <= 100) {
            this.hyvaksyttyKeskiarvo.add(pisteet);
        }
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }

    public double koepisteidenKeskiarvo() {
        int jaettava = 0;
        int jakaja = 0;
        for (Integer summa : this.keskiarvo) {

            jaettava += summa;
            jakaja++;
        }
        double keskiarvo = 1.0 * jaettava / jakaja;
        return keskiarvo;
    }

    public String hyvaksytytKoepisteidenKeskiarvo() {
        int jaettava = 0;
        int jakaja = 0;
        for (Integer summa : this.hyvaksyttyKeskiarvo) {

            jaettava += summa;
            jakaja++;
        }
        double keskiarvo = 1.0 * jaettava / jakaja;
        String merkkijono = Double.toString(keskiarvo);
        if(keskiarvo == 0){
            return "-";
        } else{
               return merkkijono;
        }
    }
    public double hyvaksymisProsentti(){
        double hyvaksyttyja = 1.0 * 100 * this.hyvaksyttyKeskiarvo.size() /this.keskiarvo.size();
        return hyvaksyttyja;
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
