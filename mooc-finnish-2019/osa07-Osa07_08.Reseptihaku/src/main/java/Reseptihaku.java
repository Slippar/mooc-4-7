
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
             
        System.out.println("Mista Luetaan?");
        String tiedosto = lukija.nextLine();
        

        HashMap<String, Resepti> reseptit;
        HashMap<String, ArrayList<String>> ainekset;

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            reseptit = luoReseptioliot(tiedostonLukija);
            ainekset = listaaReseptitAineittain(reseptit);
        } catch (Exception e) {
            reseptit = new HashMap<>();
            ainekset = new HashMap<>();
            System.out.println("Virhe: " + e.getMessage());
        }

 

        System.out.println(" ");
        System.out.println("Komennot: ");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");

        while (true) {
            System.out.print("\nSyötä komento: ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                break;
            }
            if (komento.equals("listaa")) {
                System.out.println("Reseptit: ");
                for (Resepti resepti : reseptit.values()) {
                    System.out.println(resepti);
                }
            }
            if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                for (String resepti : reseptit.keySet()) {
                    if (resepti.contains(haettava)) {
                        System.out.println(reseptit.get(resepti));
                    }
                }
            }

            if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                int haettava = lukija.nextInt();
                System.out.println("Reseptit:");
                for (String resepti : reseptit.keySet()) {
                    if (reseptit.get(resepti).getKeittoaika() <= haettava) {
                        System.out.println(reseptit.get(resepti));
                    }
                }
            }

            if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String haettava = lukija.nextLine();
                if(ainekset.get(haettava) == null){
                    System.out.println("Reseptit: ");
                } else{
                     ArrayList<String> reseptilista = ainekset.get(haettava);
                for(String resepti: reseptilista) {
                    System.out.println(reseptit.get(resepti));
                }
                }
               
                
                }

            
        }
    }

    private static HashMap<String, Resepti> luoReseptioliot(Scanner tiedostonLukija) {
        HashMap<String, Resepti> reseptit = new HashMap<>();
        while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            // kukin yksittäinen resepti on erotettu tyhjällä rivillä
            while (true) {
                // nimi on aina yksittäisen reseptin ensimmäinen rivi
                String nimi = rivi;
                rivi = tiedostonLukija.nextLine();
                // keittoaika on aina yksittäisen reseptin toinen rivi
                int keittoaika = Integer.valueOf(rivi);
                rivi = tiedostonLukija.nextLine();
                // kullakin reseptillä on aina vähintään yksi ainesosa
                ArrayList<String> ainekset = new ArrayList<>();
                while (!rivi.isEmpty()) {
                    ainekset.add(rivi);
                    if (!tiedostonLukija.hasNextLine()) {
                        break;
                    }
                    rivi = tiedostonLukija.nextLine();
                }
                reseptit.put(nimi, new Resepti(nimi, keittoaika, ainekset));
                break;
            }
        }
        return reseptit;
    }

    public static HashMap<String, ArrayList<String>> listaaReseptitAineittain(HashMap<String, Resepti> reseptit) {
        if (reseptit.isEmpty()) {
            return new HashMap<>();
        }
        HashMap<String, ArrayList<String>> raakaaineet = new HashMap<>();
        for (Resepti resepti : reseptit.values()) {
            for (String aines : resepti.getRaakaaineet()) {
                if (!raakaaineet.containsKey(aines)) {
                    raakaaineet.put(aines, new ArrayList<>());
                }
                raakaaineet.get(aines).add(resepti.getNimi());
            }
        }

        return raakaaineet;
    }
}

