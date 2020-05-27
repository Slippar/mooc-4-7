
public class EnsimmainenTilisi {

    public static void main(String[] args) {
        Tili artonTili = new Tili("Arton tili", 100.00);

        System.out.println("Alkutilanne");
        System.out.println(artonTili);

        artonTili.pano(20);
        System.out.println("Arton tilin saldo on nyt: " + artonTili.saldo());

        System.out.println("Lopputilanne");
        System.out.println(artonTili);
    }
}
