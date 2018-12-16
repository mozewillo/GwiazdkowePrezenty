/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Prezenty charakteryzują atrybuty: wielkość, waga i cena (wszystkie całkowitoliczbowe).
package gwiazdka;

/**
 *
 * @author aleksmozwillo
 */
public class Prezent {

  private int wielkość;
  private int waga;
  private int cena;
  
  public Prezent(int wielkość, int waga, int cena){
      this.wielkość=wielkość;
      this.waga= waga;
      this.cena= cena;
  }
  
  public int wielkość(){ return wielkość; }
  
  public int waga(){ return waga; }
  
  public int cena(){return cena;}
  
  @Override
  public String toString(){ return "Prezent{ wielkość=" + this.wielkość() + ", waga = " + this.waga() + ", cena = "+ this.cena()+ "}" ; }

}
