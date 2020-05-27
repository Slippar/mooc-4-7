
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true){
            System.out.print("Nimi: ");
            String rivi = lukija.nextLine();
            
            if (rivi.isEmpty()){
                break;
            }
            
            System.out.print("Sivuja: ");
            String rivi1 = lukija.nextLine();
            
            System.out.print("Kirjoitusvuosi: ");
            String rivi2 = lukija.nextLine();
            
            kirjat.add(new Kirja(rivi, Integer.valueOf(rivi1), Integer.valueOf(rivi2)));
        }
        
        System.out.print("Mitä tulostetaan? ");
        String rivi = lukija.nextLine();
        
        if (rivi.equals("kaikki")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja);
            }
        }
        
        if (rivi.equals("nimi")) {
            for (Kirja nimi: kirjat) {
                System.out.println(nimi.getNimi());
            }
        }
    }
}
