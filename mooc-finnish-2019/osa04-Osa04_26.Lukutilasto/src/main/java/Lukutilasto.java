
public class Lukutilasto {
    private int lukujenMaara;
    private int lukujenSumma;

    public Lukutilasto() {
        this.lukujenMaara=this.lukujenMaara;
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara = this.lukujenMaara + 1;
        this.lukujenSumma = this.lukujenSumma + luku;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    public int summa() {
        return lukujenSumma;
    }

    public double keskiarvo() {
        if (this.lukujenMaara != 0){
           return (double)lukujenSumma / lukujenMaara;
        }
        else {
            return 0;
        }
    }
}
