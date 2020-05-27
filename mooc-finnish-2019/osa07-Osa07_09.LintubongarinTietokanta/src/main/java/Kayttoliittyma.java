import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;
    private LintuTietokanta ltk;

    public Kayttoliittyma(Scanner lukija, LintuTietokanta ltk) {
        this.lukija = lukija;
        this.ltk = ltk;
    }

    public void kaynnista() {

        while (true) {
            String komento = kysy("?");

            if (komento.equals("Lopeta")) {
                break;
            } else if (komento.equals("Lisaa")) {
                lisaa();
            } else if (komento.equals("Havainto")) {
                havainto();
            } else if (komento.equals("Nayta")) {
                nayta();
            } else if (komento.equals("Tilasto")) {
                tilasto();
            } else {
                System.out.println("Tuntematon komento!");
            }
        }
    }

    public String kysy(String kysymys) {
        System.out.print(kysymys + " ");
        return lukija.nextLine();
    }

    public void lisaa() {
        String nimi = kysy("Nimi:");
        String latNimi = kysy("Latinankielinen nimi:");

        ltk.lisaa(nimi, latNimi);
    }

    public void havainto() {
        String nimi = kysy("Nimi:");

        boolean onnistuiko = ltk.havainto(nimi);
        if (!onnistuiko) {
            System.out.println(nimi + " ei ole lintu!");
        }
    }

    public void nayta() {
        String nimi = kysy("Nimi:");
        String mjono = ltk.nayta(nimi);
        if (mjono == null) {
            System.out.println(nimi + " ei ole lintu!");
        } else {
            System.out.println(mjono);
        }
    }

    public void tilasto() {
        System.out.print(ltk.tilasto());
    }

}
