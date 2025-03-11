/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestioneLibreriaArraylist;

/**
 *
 * @author Lombardo Guido
 */
public class MainLibreria {

    public static void main(String[] args) {
        
        //Istanza della classe Libreria.
        Libreria oggetto = new Libreria();

        //Implementazione di un ciclo do-while che termina il programma quando l'utente digita 0 alla richiesta.
        do {

            //Richiamo metodi della classe Libreria.
            oggetto.RegistrazioneLibro();
            oggetto.Inserimento();
            oggetto.VisualizzaLibreria();
            oggetto.CicloProgramma();
        } while (oggetto.cicloP != 0);

    }
}