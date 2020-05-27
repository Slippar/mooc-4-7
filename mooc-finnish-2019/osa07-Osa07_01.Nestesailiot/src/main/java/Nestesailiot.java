
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ensimmainen = 0;
        int toinen = 0;

        System.out.println("");

        while (true) {

            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen:" + toinen + "/100");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;

            }
            String[] osat = luettu.split(" ");

            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (komento.equals("lisaa") && (ensimmainen + maara) > 100) {
                ensimmainen = 100;
                
            } else if(komento.equals("lisaa")&& maara > 0 && maara <= 100 && (ensimmainen + maara) <= 100){
                ensimmainen = ensimmainen + maara;
                
            } else if(komento.equals("siirra") && (toinen + maara) > 100){
                ensimmainen = ensimmainen - maara;
                toinen = 100;
            } else if (komento.equals("siirra") && (ensimmainen - maara) >= 0){
                ensimmainen = ensimmainen - maara;
                toinen = toinen = maara;
            
               
            } else if (komento.equals("siirra") && maara >= ensimmainen) {
                toinen = toinen + ensimmainen ;
                ensimmainen = 0;
             

            } else if (komento.equals("poista") && maara > 0 && maara <= 100 && (toinen - maara) >= 0) {
                toinen = toinen - maara;
            }
        }
    }
}
