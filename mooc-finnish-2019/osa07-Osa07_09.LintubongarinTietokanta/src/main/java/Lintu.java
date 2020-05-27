public class Lintu {

    private String nimi;
    private String latNimi;
    private int havainnot;

    public Lintu(String nimi, String latNimi) {
        this.nimi = nimi;
        this.latNimi = latNimi;
        this.havainnot = 0;
    }

    public String nimi() {
        return this.nimi;
    }

    public void havainto() {
        this.havainnot++;
    }

    public String toString() {
        return this.nimi + " (" + this.latNimi + "): " + this.havainnot + " havaintoa";
    }
}
