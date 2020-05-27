/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dude
 */
public class Henkilo {
    private String nimi;
    private int ika;
    
    public Henkilo(String nimi) {
        this.nimi = nimi;
        this.ika = 0;
    }
    
    public void tulostaHenkilo(){
        System.out.println(nimi + ",ikä " + ika + " vuotta");
    }
    
    public void vanhene(){
        this.ika = ika+1;
    }
    
    public int palautaIka(){
        return(ika);
    }
}
