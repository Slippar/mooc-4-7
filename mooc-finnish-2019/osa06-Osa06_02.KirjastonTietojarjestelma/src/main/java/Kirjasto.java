import java.util.ArrayList;

public class Kirjasto {
    private ArrayList<Kirja> kirjat;
    
    public Kirjasto(){
        kirjat = new ArrayList<Kirja>();
    }
    
    public void lisaaKirja(Kirja uusiKirja) {
        kirjat.add(uusiKirja);
    }
    
    public void tulostaKirjat(){
        for (int i = 0; i < kirjat.size(); i++) {
            System.out.println(kirjat.get(i));
        }
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja kirja1 : kirjat) {
            if (StringUtils.sisaltaa(kirja1.nimeke(), nimeke)) {
                loydetyt.add(kirja1);
            }
        }

        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija){
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja kirja1 : kirjat) {
            if (StringUtils.sisaltaa(kirja1.julkaisija(), julkaisija)) {
                loydetyt.add(kirja1);
            }
        }

        return loydetyt;
        
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi){
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja kirja1 : kirjat) {
            if (kirja1.julkaisuvuosi()==(julkaisuvuosi)) {
                loydetyt.add(kirja1);
            }
        }

        return loydetyt;
    }
}
