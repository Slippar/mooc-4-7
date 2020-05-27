/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dude
 */
public class Tuote {
    private String nimi;
    private double hinta;
    private int lukumaara;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa){
        this.nimi = nimiAlussa;
        this.hinta = hintaAlussa;
        this.lukumaara = maaraAlussa;
    }
    
    public void tulostaTuote(){
        System.out.print(nimi + ", hinta " + hinta + ", " + lukumaara + " kpl");
    }
}
