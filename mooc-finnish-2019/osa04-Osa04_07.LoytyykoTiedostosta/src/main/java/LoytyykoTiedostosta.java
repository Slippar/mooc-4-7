
import java.io.File;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        
        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        int dot = 0;
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                if (rivi.equals(etsittava)) {
                    System.out.println("Löytyi!");
                    dot = 1;
                    break;
                }
                dot = 2;
            }
        }
        
        catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
        
        if (dot==2){
            System.out.println("Ei löytynyt.");
        }
    }
}
