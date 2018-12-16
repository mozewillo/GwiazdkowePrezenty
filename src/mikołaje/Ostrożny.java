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
public class Ostrożny extends Mikołaj {
        private static final String imię = "Ostrożny";
        
        public Ostrożny(int maksIle, int pojemność){
            super(maksIle, pojemność); 
        }
        
        @Override
        public boolean czyWeźmie(Prezent p){
            return ( p.wielkość() < 0.5*super.pojemność() && super.czyMoże(p) );
        }
    
}
