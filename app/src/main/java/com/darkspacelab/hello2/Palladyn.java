package com.darkspacelab.hello2;

/**
 * Created by piotrmarcinkiewicz on 20/04/2017.
 */

public class Palladyn extends Postac{
    private Walczace walczace;
    boolean zagrozenie = false;
    public void setWalczace(Walczace wartosc) {
        walczace = wartosc;
    }
    Palladyn(String imie) {
        System.out.println("Narodziny palladyna " + imie);
    }
    public void dzialaj() {
        if (zagrozenie) {
            walczace.walcz();
        } else {
            System.out.println("Znajdz smoka");
        }
    }
    public void setZagrozenie(boolean wartosc) {
        zagrozenie = wartosc;
    }
}
