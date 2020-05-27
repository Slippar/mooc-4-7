
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true){
            System.out.print("Nimi: ");
            String rivi = lukija.nextLine();
            
            if (rivi.isEmpty()){
                break;
            }
            
            System.out.print("Pituus: ");
            String rivi1 = lukija.nextLine();
            
            ohjelmat.add(new TelevisioOhjelma(rivi, Integer.valueOf(rivi1)));
        }
        
        System.out.print("Ohjelman maksimipituus? ");
        String rivi = lukija.nextLine();
        
        int rivi5=Integer.valueOf(rivi);
        
        for (TelevisioOhjelma ohjelma: ohjelmat) {
            if (ohjelma.getPituus() <= rivi5) {
                System.out.println(ohjelma);
            }
        }

    }
}
