
public class VahenevaLaskuri {

    private int arvo;
    private int alkuarvo;// oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.alkuarvo = arvoAlussa;
        
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        if (arvo != 0){
            this.arvo = this.arvo - 1;
        }
    }
    
    public void nollaa() {
        arvo = 0;
    }
    
    public void palautaAlkuarvo(){
        arvo = alkuarvo;
    }

    // ja tänne muut metodit
}
