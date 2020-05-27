import java.util.ArrayList;

public class Matkalaukku {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();

    }

    public void lisaaTavara(Tavara tavara) {

        if (this.maksimipaino - tavara.getPaino() >= 0) {
            this.maksimipaino = this.maksimipaino - tavara.getPaino();
            this.tavarat.add(tavara);

        }

    }

    public void tulostaTavarat() {
        for (Tavara tavarat : tavarat) {
            System.out.println(tavarat);
        }
    }

    public int yhteispaino() {
        int kokonaispaino = 0;
        for (Tavara paino : tavarat) {
            kokonaispaino = kokonaispaino + paino.getPaino();

        }
        return kokonaispaino;
    }

    public Tavara raskainTavara() {
        int painavin = 0;
        int indeksi = 0;
        for (Tavara tavara : this.tavarat) {
            
                if (tavara.getPaino() >= painavin) {
                    painavin = tavara.getPaino();
                    indeksi = this.tavarat.indexOf(tavara);
                }
                
            
           
        }
        if(!this.tavarat.isEmpty()){
         return this.tavarat.get(indeksi);
        } else {
            return null;
        } 
    }    




    public String toString() {

        String lukumaara = Integer.toString(this.tavarat.size());

        if (this.tavarat.size() == 0) {
            return "ei tavaroita " + "(" + this.yhteispaino() + "kg)";
        } else if (this.tavarat.size() == 1) {
            return lukumaara + " tavara " + "(" + this.yhteispaino() + "kg)";
        } else {
            return lukumaara + " tavaraa " + "(" + this.yhteispaino() + "kg)";
        }

    }

}
