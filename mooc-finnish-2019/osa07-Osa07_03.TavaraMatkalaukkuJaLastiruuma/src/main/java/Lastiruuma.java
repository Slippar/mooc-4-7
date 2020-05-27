import java.util.ArrayList;


public class Lastiruuma {

    private int maksimipaino;
    private ArrayList<Matkalaukku> laukut;
    private int yhteispaino;
 

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.laukut = new ArrayList<>();
        this.yhteispaino = 0;
    
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {

        int laukunPaino = laukku.yhteispaino();

        if (this.maksimipaino - laukunPaino >= 0) {
            this.maksimipaino = this.maksimipaino - laukunPaino;
            this.yhteispaino = this.yhteispaino + laukunPaino;
            this.laukut.add(laukku);

        }

    }


    public void tulostaTavarat() {
        
        for(Matkalaukku laukku : laukut){
            
             laukku.tulostaTavarat();
            
        }
     
    }

    

    public String toString() {
        String lukumaara = Integer.toString(this.laukut.size());

        //if (this.laukut.size() == 0) {
        //  return "ei laukkuja " + "(" + this.yhteispaino() + "kg)";
        //} else if (this.laukut.size() == 1) {
        //  return lukumaara + " laukku " + "(" + this.yhteispaino() + "kg)";
        //} else {
        //  return lukumaara + " laukkua " + "(" + this.yhteispaino() + "kg)";
        //}
        return lukumaara + " matkalaukkua " + "(" + this.yhteispaino + "kg)";
    }

}
