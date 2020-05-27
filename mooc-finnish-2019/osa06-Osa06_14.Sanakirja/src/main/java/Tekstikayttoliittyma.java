import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }

        
    public void kaynnista() {
        System.out.println("lisaa - lisää sanaparin sanakirjaan\n" +
        "kaanna - kysyy sanan ja tulostaa sen käännöksen\n" +
        "lopeta - poistuu käyttöliittymästä");
        
        
        while (true) {
            System.out.println("Komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            } else if (komento.equals("lisaa")) {
                
                System.out.println("Suomeksi: ");
                String sana = lukija.nextLine();
                System.out.println("Käännös");
                String kaannos = lukija.nextLine();
                
                sanakirja.lisaa(sana, kaannos);
            } else if (komento.equals("kaanna")) {
                System.out.println("Anna sana: ");
                String sana = lukija.nextLine();
                System.out.println("Käännös: " + sanakirja.kaanna(sana));
            } else {
                System.out.println("Tuntematon komento.");
            }
        }
        
    }
    
}
