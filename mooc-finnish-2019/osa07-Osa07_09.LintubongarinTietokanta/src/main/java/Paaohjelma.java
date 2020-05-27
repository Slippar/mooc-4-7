import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);

        LintuTietokanta ltk = new LintuTietokanta();

        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija, ltk);
        kayttoliittyma.kaynnista();
        
    }

}