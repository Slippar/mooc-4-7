
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto tilasto2 = new Lukutilasto();
        Lukutilasto tilasto3 = new Lukutilasto();
        System.out.println("Anna lukuja:");
        while (true) {
            String rivi = lukija.nextLine();
            int luku1 = Integer.valueOf(rivi);
            
            if (luku1 < 0){
                System.out.println("Summa: " + tilasto.summa());
                System.out.println("Parillisten summa: " + tilasto2.summa());
                System.out.println("Parittomien summa: " + tilasto3.summa());
                break;
            }
            
            tilasto.lisaaLuku(luku1);
            
            if (luku1 % 2 == 0){
                tilasto2.lisaaLuku(luku1);
            }
            else{
                tilasto3.lisaaLuku(luku1);
            }
        }
    }
}
