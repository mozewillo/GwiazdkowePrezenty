/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Napisz program, który wczyta z pliku tekstowego dane o prezentach
oraz o Mikołajach, a następnie rozdzieli te prezenty, jeden po drugim, poszczególnym Mikołajom. Program powinien wypisać, zg z przykl 
informacje o wczytanych danych na początku oraz informacje o Mikołajach już po dokonaniu podziału.

Podział odbywa się tak,
że  po kolei każdy prezent jest oferowany kolejnym Mikołajom, aż któryś z nich weźmie ten prezent lub odpytani zostaną wszyscy Mikołajowie.
W tym drugim przypadku prezent pozostaje w biurze Mikołajów na następną okazję

mikł0= 0.pierwszy, 1.następny po ostatnim który przyjął prezent

Prezenty charakteryzują atrybuty: wielkość, waga i cena (wszystkie całkowitoliczbowe).
*/ 
package gwiazdka;
// ... importy ...
import mikołaje.Mikołaj;
import mikołaje.Skromny;
import mikołaje.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    Dane wczytajDane(String nazwa) {
        try {
            Scanner dane = new Scanner(new File(nazwa), "UTF-8");

            // Czytam prezenty, kończą się pustym wierszem

            ArrayList<Prezent> prezenty = new ArrayList<Prezent>();

            int nrWiersza = 0;
            int ileP = 0;
            String napis;
            while (dane.hasNextLine() && ((napis = dane.nextLine()).length() > 0)) {
                nrWiersza++;
                Scanner wiersz = new Scanner(napis);

                assert wiersz.hasNextInt() : "Brak wielkości prezentu w wierszu: " + nrWiersza + ": " + wiersz;
                int wielkość = Integer.parseInt(wiersz.next());

                assert wiersz.hasNextInt() : "Brak wagi prezentu w wierszu: " + nrWiersza + ": " + wiersz;
                int waga = Integer.parseInt(wiersz.next());

                assert wiersz.hasNextInt() : "Brak ceny prezentu w wierszu: " + nrWiersza + ": " + wiersz;
                int cena = Integer.parseInt(wiersz.next());

                prezenty.add(new Prezent(wielkość, waga, cena));
            } // while

            ileP = nrWiersza;
            nrWiersza++; //Pusry wiersz

            System.out.println("Liczba wczytanych prezentów: " + ileP);

            // Czytam Mikołajów

            ArrayList<Mikołaj> mikołaje = new ArrayList<Mikołaj>();

            while (dane.hasNextLine()) {
                nrWiersza++;
                Scanner wiersz = new Scanner(dane.nextLine());

                assert wiersz.hasNext(".") : "Brak kodu Mikołaja w wierszu: " + nrWiersza + ": " + wiersz;
                String kod = wiersz.next();

                assert wiersz.hasNextInt() : "Brak maksymalnej liczby prezentów mieszczących się w worku w wierszu: " + nrWiersza + ": " + wiersz;
                int ileMaks = Integer.parseInt(wiersz.next());

                assert wiersz.hasNextInt() : "Brak pojemności worka w wierszu: " + nrWiersza + ": " + wiersz;
                int pojemność = Integer.parseInt(wiersz.next());

                switch (kod) {
                    case "P":
                        mikołaje.add(new Potulny(ileMaks, pojemność));
                        break;       
                    case "O":
                        mikołaje.add(new Ostrożny(ileMaks, pojemność));
                        break;
                    case "S":
                        mikołaje.add(new Schorowany(ileMaks, pojemność));
                        break;
                    case "B":
                        mikołaje.add(new Skromny(ileMaks, pojemność));
                        break;
                    case "W":
                        mikołaje.add(new Wybredny(ileMaks, pojemność));
                        break;
                    // ...  pozostali Mikołajowie ...
                    default:
                        assert false : "Niepoprawny kod Mikołaja w wierszu: " + nrWiersza + ": " + wiersz;
                } // switch
            } // while

            int ileM = nrWiersza - ileP - 1;
            System.out.println("Liczba wczytanych Mikołajów: " + ileM);

            return new Dane(prezenty.toArray(new Prezent[0]), mikołaje.toArray(new Mikołaj[0]));

        } catch (FileNotFoundException e) {
            assert false : "Nie można otworzyć pliku: " + nazwa;
            return null; // Tylko dla spokoju ducha kompilatora, nigdy tu nie dojdziemy (przy -ea)
        }

    }
/**
 *
 * @author aleksmozwillo
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    assert false: "Odkomentuj tę instrukcję";  // <---- Pierwsze uruchomienie programu nie powinno się powieść!!!

    Main m = new Main();

    System.out.println("*** Początek programu - wczytywanie danych ***\n");

    Dane dane = m.wczytajDane("dane0.txt");

    System.out.println("\n*** Po wczytaniu danych, dane = ***\n\n" + dane + "\n");

    m.rozdziel(dane);

    System.out.println("\n*** Mikołaje po podziale prezentów ***\n");
    for(Mikołaj mik: dane.mikołaje())
        System.out.println(mik);

    System.out.println("\n*** Koniec programu ***");
        }

    public void rozdziel( Dane d ) {

        //tworzymy arraylistę indeksow array mikołaji, żeby móc przesuwać kolejkę rozdawania prezentów

        ArrayList<Integer> indmiko = new ArrayList<Integer>();
        for (int k = 0 ; k < d.mikołaje().length; k++){
            indmiko.add(k);
        }

        for (Prezent p : d.prezenty()) {
            for ( int i = 0; i < indmiko.size() ; i++ ) {

                if (d.mikołaje()[indmiko.get(i)].czyWeźmie(p)) {
                    d.mikołaje()[indmiko.get(i)].weź(p);
                    for ( int j=0 ; j<=i ; j++){
                        //przesuwamy nasza kolejkę
                        indmiko.add( indmiko.get(0));
                        indmiko.remove(0);
                    }
                    break;
                } else if (i == indmiko.size() - 1) {
                    System.out.println("Nikt nie wziął prezentu:" + p);
                }
            }
        }
    }
}