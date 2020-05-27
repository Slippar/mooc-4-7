import java.util.ArrayList;

public class LintuTietokanta {

    private ArrayList<Lintu> linnut;

    public LintuTietokanta() {
        this.linnut = new ArrayList<>();
    }

    public boolean havainto(String nimi) {
        for (Lintu lintu : linnut) {
            if (lintu.nimi().equals(nimi)) {
                lintu.havainto();
                return true;
            }
        }

        return false;
    }

    public void lisaa(String nimi, String latNimi) {
        this.linnut.add(new Lintu(nimi, latNimi));
    }

    public String nayta(String nimi) {
        for (Lintu lintu : linnut) {
            if (lintu.nimi().equals(nimi)) {
                return lintu.toString();
            }
        }

        return null;
    }

    public String tilasto() {
        String tulos = "";
        for (Lintu lintu : linnut) {
            tulos += lintu.toString();
        }

        return tulos;
    }

}