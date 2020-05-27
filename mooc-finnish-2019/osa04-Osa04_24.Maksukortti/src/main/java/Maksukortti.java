/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dude
 */
public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;
    }

    public String toString() {
        return "Kortilla on rahaa " + saldo + " euroa";
    }
    
    public void syoEdullisesti() {
        if ((saldo - 2.60) >= 0){
            saldo = saldo - 2.60;
        }
    }

    public void syoMaukkaasti() {
        if ((saldo - 4.60) >= 0){
            saldo = saldo - 4.60;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
        if ((saldo + rahamaara) >= 0){
            if (rahamaara >= 0) {
                saldo = saldo + rahamaara;
            }
        }
        
        if (saldo > 150){
            saldo = 150;
        }
    }
}
