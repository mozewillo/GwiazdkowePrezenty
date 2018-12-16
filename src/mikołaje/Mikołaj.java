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
abstract public class Mikołaj {

    protected Worek worek;
    protected int maksIle;
    protected int pojemność;
    
    public Mikołaj(int maksIle, int pojemność){
        this.maksIle= maksIle;
        this.pojemność= pojemność;
        worek = new Worek( pojemność, maksIle);
        
    }
    abstract public boolean czyWeźmie(Prezent p);
    //pyta mikołaja czy weżmie w zależności od jego charakteru czyli podklas!

    public int maksIle(){ return maksIle; }
    //ile prezentów maksymalnie może przyjąć

    public int pojemność(){ return pojemność; }
    //pojemność worka

    public Worek worek() { return worek; }
    
    public boolean czyMoże(Prezent p){
        return worek.czyMiejsce(p);
    }
    
    public void weź(Prezent p){
        worek.dorzućDoWorka(p);
    }

    @Override
    public String toString(){
        return "Mikołaj{" ;
    }
}
