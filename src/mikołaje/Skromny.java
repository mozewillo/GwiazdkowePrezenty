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
//Skromny (B): bierze tylko prezenty ze złota (można je poznać po tym, że ich współczynnik cena/wielkość jest większy od 10).
public class Skromny extends Mikołaj {
    private static String imię = "Skromny";
    
    public Skromny(int maksIle, int pojemność){
        super( maksIle, pojemność);
    }

    @Override
    public boolean czyWeźmie(Prezent p){
        return (p.cena()/ p.wielkość() > 10 && super.czyMoże(p));
        }

    @Override
    public String toString() {
        return super.toString() + imię + ", worek=" + worek.toString() + "}";
    }
    }

