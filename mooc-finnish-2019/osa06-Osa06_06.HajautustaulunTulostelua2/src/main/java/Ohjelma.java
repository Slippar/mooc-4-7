
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys", 1813, "...."));
        taulu.put("onni", new Kirja("Don't let the pigeon drive the bus", 2003, "...."));
        tulostaArvoJosNimessa(taulu, "i");
    }

    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (String kirja: hajautustaulu.keySet()) {
            System.out.println(hajautustaulu.get(kirja).toString());
        }
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for (String kirja: hajautustaulu.keySet()) {
            if (hajautustaulu.get(kirja).getNimi().contains(merkkijono)) {
                System.out.println(hajautustaulu.get(kirja).toString());
            }
        }
    }

}
