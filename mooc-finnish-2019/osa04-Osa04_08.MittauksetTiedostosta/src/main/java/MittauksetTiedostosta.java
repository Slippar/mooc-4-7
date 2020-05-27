
import java.io.File;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        int dot=0;
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                int luku = Integer.valueOf(rivi);
                if (luku>=alaraja && luku<=ylaraja) {
                    dot = dot+1;
                }
            }
        }
        
        catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
        
        System.out.println("Lukuja: " + dot);

    }

}
