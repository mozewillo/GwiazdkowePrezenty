/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikołaje;
import gwiazdka.*;
//Wybredny (W): bierze tylko te prezenty, które są lekkie (współczynnik wagi do wielkości jest mniejszy od 1),
/**
 *
 * @author aleksmozwillo
 */
public class Wybredny extends Mikołaj{
    private static final String imię = "Wybredny";
            
    public Wybredny(int maksIle, int pojemność){ super(maksIle, pojemność); }
    
    public boolean czyWeźmie(Prezent p){
        return ( p.waga() / p.wielkość() < 1 && super.czyMoże(p));
    }

    @Override
    public String toString() {
        return super.toString() + imię + ", worek=" + worek.toString() + "}";
    }
}
