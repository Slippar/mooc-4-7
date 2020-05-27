import java.util.ArrayList;
public class Resepti {
    private String nimi;
    private int keittoaika;
    private ArrayList<String> raakaaineet;
 
    public Resepti(String nimi, int keittoaika, ArrayList<String> raakaaineet) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.raakaaineet = raakaaineet;
    }
    
    public String getNimi() {
        return this.nimi;
    }
 
    public int getKeittoaika() {
        return this.keittoaika;
    }
    
    public ArrayList<String> getRaakaaineet() {
        return raakaaineet;
    }
 
    @Override
    public String toString() {
        return nimi  + ", keittoaika: " + keittoaika + ".";
    }
    
}