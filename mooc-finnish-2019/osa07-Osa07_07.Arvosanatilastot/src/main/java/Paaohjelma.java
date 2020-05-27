import java.util.Scanner;

public class Paaohjelma {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Arvosanarekisteri rekisteri = new Arvosanarekisteri();

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("-1")) {
                break;
            }

            int pisteet = Integer.valueOf(luettu);

            if (pisteet < 0 || pisteet > 100) {
                continue;
            }

            rekisteri.lisaaArvosanaPisteidenPerusteella(pisteet);
        }
        System.out.println("Pisteiden keskiarvo (kaikki): " + rekisteri.koepisteidenKeskiarvo());
        System.out.println("Pisteiden keskiarvo (hyväksytyt):" + rekisteri.hyvaksytytKoepisteidenKeskiarvo());
        System.out.println("Hyväksymisprosentti: " + rekisteri.hyvaksymisProsentti());

        System.out.println("");
        int arvosana = 5;
        while (arvosana >= 0) {
            int tahtia = rekisteri.montakoSaanutArvosanan(arvosana);
            System.out.print(arvosana + ": ");
            while (tahtia > 0) {
                System.out.print("*");
                tahtia--;
            }
            System.out.println("");

            arvosana = arvosana - 1;
        }
        
    }
}
    

