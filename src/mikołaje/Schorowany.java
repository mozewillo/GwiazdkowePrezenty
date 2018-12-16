/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikołaje;
import gwiazdka.*;
//Schorowany (S): bierze coraz lżejsze prezenty, tzn. pierwszy oferowany zawsze, ale kolejne tylko wtedy, gdy są lżejsze od poprzedniego,
/**
 *
 * @author aleksmozwillo
 */
public class Schorowany extends Mikołaj {
    private static final String imię = "Schorowany";
    
    public Schorowany(int maksIle, int pojemność) {
       super(maksIle, pojemność);
    }

    @Override
    public boolean czyWeźmie (Prezent p){

        if(super.worek().pokażOstatniPrezent() == null && super.czyMoże(p)){return true ;}
        else{ return ( super.worek().pokażOstatniPrezent().waga()> p.waga() && super.czyMoże(p)); }
    }

    @Override
    public String toString() {
        return super.toString() + imię + ", worek=" + worek.toString() + "}";
    }
} 