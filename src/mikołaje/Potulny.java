/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikołaje;
import gwiazdka.*;
/**
 *
 * @author aleksmozwillo
 */
//Potulny (P): bierze każdy oferowany prezent
public class Potulny extends Mikołaj  {
    private static final String imię = "Potulny" ;
        
    public Potulny(int maksIle, int pojemność){ 
        super( maksIle, pojemność);
    }
        
    @Override
    public boolean czyWeźmie(Prezent p){
            return super.czyMoże(p);
        }

    @Override
    public String toString() {
        return super.toString() + imię + ", worek=" + worek.toString() + "}";
    }
}
