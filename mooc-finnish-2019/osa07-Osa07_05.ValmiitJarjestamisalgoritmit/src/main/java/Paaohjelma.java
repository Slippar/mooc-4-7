
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};

        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(8);
        luvut.add(3);
        luvut.add(7);
        
        Paaohjelma.jarjesta(taulukko);
        

    }

    public static void jarjesta(int[] taulukko) {
        Arrays.sort(taulukko);
        System.out.println(Arrays.toString(taulukko));
    }

    public static void jarjesta(String[] taulukko) {
        Arrays.sort(taulukko);
        System.out.println(Arrays.toString(taulukko));
    }

    public static void jarjestaLuvut(ArrayList<Integer> luvut) {
        Collections.sort(luvut);
        System.out.println(luvut);
    }

    public static void jarjestaMerkkijonot(ArrayList<String> luvut) {
        Collections.sort(luvut);
        System.out.println(luvut);
    }

}
