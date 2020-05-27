public class Tavara {
    private String nimi;
    private int paino;
    
    public Tavara(String uusiNimi, int uusiPaino){
        this.nimi = uusiNimi;
        this.paino = uusiPaino;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getPaino(){
        return this.paino;
    }
    
    public String toString(){
        return this.nimi + " (" + this.paino + " kg)";
    }

    boolean indexOf(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

