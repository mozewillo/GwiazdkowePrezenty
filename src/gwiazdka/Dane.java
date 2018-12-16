/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwiazdka;
import mikołaje.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author aleksmozwillo
 */
public class Dane {

    ArrayList<Prezent> prezentArrayList;
    ArrayList<Mikołaj> mikołajArrayList;

    Prezent[] prezenty;
    Mikołaj[] mikołaje;

    /**
     * ArrayList<Prezent> prezenty = new ArrayList<>();
     * prezenty.add(dsadsad);
     * prezenty.toString();
     *
     *
     * */

    public Dane(Prezent[] prezenty , Mikołaj[] mikołaje){

        prezentArrayList = new ArrayList<Prezent>(Arrays.asList(prezenty));
        mikołajArrayList = new ArrayList<Mikołaj>(Arrays.asList(mikołaje));

        this.mikołaje= mikołaje;
        this.prezenty= prezenty;
    }
    
    @Override
    public String toString(){
//jeśli chcemy stworzyć ciąg znaków i wiemy że chcemy dodawać dużo rzeczy to używamy string buildera
        StringBuilder sbPrezent = new StringBuilder();
        StringBuilder sbMikolaje = new StringBuilder();
        for(int i = 0; i< prezenty.length; i++)
            sbPrezent.append(prezenty[i]);
        for(int i = 0; i<mikołaje.length; i++)
            sbMikolaje.append(mikołaje[i]);

        return "Dane={ " + "mikołaje=" + mikołajArrayList.toString() + ", prezenty" + prezentArrayList.toString();
    }
    
    public void rozdziel(Dane dane){
        // metoda rozdziela prezenty wśród mikolajów
    }
    
    public Mikołaj[] mikołaje(){
        return mikołaje;
    }
    
    public Prezent[] prezenty(){
        return prezenty;
    }

}   
