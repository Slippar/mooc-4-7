
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int nuorinIka = 100;
        String nuorin = "";

        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.equals("loppu")) {
                break;
            }

            String[] palat = rivi.split(",");
            String nimi = palat[0];
            int ika = Integer.valueOf(palat[1]);

            if (nuorinIka > ika) {
                nuorin = nimi;
                nuorinIka = ika;
            }
        }

        System.out.println("Nuorin oli: " + nuorin);

    }
}
