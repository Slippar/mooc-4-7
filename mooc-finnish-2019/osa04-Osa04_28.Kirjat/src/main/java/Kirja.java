public class Kirja {
    private String nimi;
    private int sivumaara;
    private int vuosi;

    public Kirja(String nimi, int sivumaara, int vuosi) {
        this.nimi = nimi;
        this.sivumaara = sivumaara;
        this.vuosi = vuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getSivumaara() {
        return sivumaara;
    }
    
    public int getVuosi() {
        return vuosi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sivumaara + " sivua, " + this.vuosi;
    }
}
