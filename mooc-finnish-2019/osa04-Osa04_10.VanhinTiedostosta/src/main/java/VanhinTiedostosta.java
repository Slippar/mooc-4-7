
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mikä tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        String vanhin="";
        int vanhinIka=-1;
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                if (rivi.trim().length() == 0) {
                    continue;
                }

                String[] osat = rivi.split(",");

                String nimi = osat[0];
                int ika = Integer.valueOf(osat[1]);

                if (vanhinIka < ika) {
                    vanhin = nimi;
                    vanhinIka = ika;
                }

            }
        } 
        catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        System.out.println("Vanhin oli: " + vanhin);

    }
}
