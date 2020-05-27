/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dude
 */
public class Kertoja {
    private int luku = 0;
    
    public Kertoja(int luku){
        this.luku = luku;
    }
    
    public int kerro(int luku) {
        return luku * this.luku;
    }
}
