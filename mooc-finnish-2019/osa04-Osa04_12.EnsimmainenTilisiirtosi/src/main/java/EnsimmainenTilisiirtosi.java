
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        Tili matinTili = new Tili("Matin tili", 1000.00);
        Tili omaTili = new Tili("Oma tili", 0);

        System.out.println(matinTili);
        System.out.println(omaTili);

        matinTili.otto(100);
        omaTili.pano(100);
        
        System.out.println(matinTili);
        System.out.println(omaTili);
    }
}
