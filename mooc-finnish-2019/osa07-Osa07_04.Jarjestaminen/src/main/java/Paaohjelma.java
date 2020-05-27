import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }

    public static int pienin(int[] taulukko) {
        // kirjoita koodia tähän
        int indeksi = 0;
        int pieninLuku = taulukko[indeksi];

        while (indeksi < taulukko.length) {
            if (taulukko[indeksi] < pieninLuku) {
                pieninLuku = taulukko[indeksi];
            }

            indeksi = indeksi + 1;

        }
        return pieninLuku;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        // kirjoita koodia tähän
        int indeksi = 0;
        int pienimmanIndeksi = 0;
        int pieninLuku = taulukko[indeksi];
        while (indeksi < taulukko.length) {

            if (taulukko[indeksi] < pieninLuku) {
                pieninLuku = taulukko[indeksi];
                pienimmanIndeksi = indeksi;
            }
            indeksi = indeksi + 1;
        }
        return pienimmanIndeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {

        int indeksi = aloitusIndeksi;
        int pienimmanIndeksi = 0;
        int pieninLuku = taulukko[indeksi];

        while (indeksi < taulukko.length) {

            if (taulukko[indeksi] <= pieninLuku) {
                pieninLuku = taulukko[indeksi];
                pienimmanIndeksi = indeksi;
            }
            indeksi = indeksi + 1;
        }
        return pienimmanIndeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        // kirjoita koodia tähän
        int apu = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;
    }

    public static void jarjesta(int[] taulukko) {
        int indeksi = 0;

        while(indeksi < taulukko.length){
            
             int indeksi2 = Paaohjelma.pienimmanIndeksiAlkaen(taulukko, indeksi);
             vaihda(taulukko, indeksi, indeksi2);
             indeksi++;
             System.out.println(Arrays.toString(taulukko));

            
             
             
        
        }
    }

}
