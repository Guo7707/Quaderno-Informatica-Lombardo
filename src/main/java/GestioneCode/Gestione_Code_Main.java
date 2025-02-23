/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestioneCode;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */
/*DESCRIZIONE:
 * Questo programma gestisce la coda di PosteItaliane tramite il metodo di
 * gestione code FIFO.
 */
 /*ISTRUZIONI ALL'USO:
 * Inizialmente viene richiesto di inserire i propri dati anagrafici, 
 * successivamente scegliere il servizio a cui si è interessati, 
 * digitando il numero corrispondente, in modo da aggiungersi alla coda di 
 * quest'ultimo. Poi è possibile, digitando il numero 1, visualizzare una coda 
 * a scelta, oppure andare avanti, digitando un numero qualsiasi. Infine viene
 * richiesto se si desidera uscire premendo 0, o continuare digitando un 
 * qualsiasi numero.
 */
public class Gestione_Code_Main {

    public static void main(String[] args) {
        //Istanza della classe Gestione_Code_Sviluppo.
        Gestione_Code_Sviluppo oggetto = new Gestione_Code_Sviluppo();
        //Implementazione di un ciclo do-while che termina il programma quando l'utente digita 0 alla richiesta.
        do {
            //richiamo metodi
            oggetto.Ingresso();
            oggetto.Indirizzamento();
            oggetto.VisualizzaCode();
            oggetto.SvuotaCode();
            oggetto.CicloProgramma();
        } while (oggetto.cicloP != 0);

    }

}
