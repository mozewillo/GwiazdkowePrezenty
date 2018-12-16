/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikołaje;
import gwiazdka.*;
import java.util.ArrayList;
/**
 *
 * @author aleksmozwillo
 */
public class Worek {
        private int pojemność;
        private int maksIle;
        private int ileMam = 0;
        private ArrayList<Prezent> zawartość;
        private int zapełniony= 0; //objętość zajęta przez prezenty

        public Worek(int pojemność, int maksIle){
            this.pojemność = pojemność;
            this.maksIle= maksIle;
            this.zawartość= new ArrayList<Prezent>();
        }

        public int pojemność(){ return pojemność; }
        public int maksIle() { return maksIle; }
        public ArrayList<Prezent> zawartość() { return zawartość; }
        public int ileMam() { return ileMam;}
        
        public void dorzućDoWorka(Prezent p){
            //zawartość[ileMam]= p;
            zawartość.add(p);
            ileMam++;
            zapełniony+= p.wielkość();
        }
        
        public boolean czyMiejsce(Prezent p){
            return (maksIle > ileMam && (zapełniony + p.wielkość()) <= pojemność);
        }
    
        @Override
        public String toString(){
            String zaw="(";
            //for (Prezent p : zawartość){
            //    zaw+=p;
            //}
            /// zawartośc.size() uważać na o  zaw.get() daje wartość
            for (int i = 0 ; i < zawartość.size()-1 ; i++){
                zaw+= zawartość.get(i).toString();
            }
            if( zawartość.size() > 0 ){
                zaw+= zawartość.get(zawartość.size()-1);
            }
            return "Worek{ pojemnośc=" + pojemność + ", l.prez.=" + ileMam + "/" + maksIle + ", zawartość=(" + zaw + ")" ;
        }
}
