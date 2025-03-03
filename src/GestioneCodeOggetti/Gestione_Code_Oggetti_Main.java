/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestioneCodeOggetti;

/**
 *
 * @author Lombardo Guido
 */
/*DESCRIZIONE:
 * Questo programma gestisce la coda di PosteItaliane tramite il metodo di
 * gestione code FIFO, e tenendo conto della priorità da 1 a 3.
 */

 /*ISTRUZIONI ALL'USO:
 * Inizialmente viene richiesto di inserire i propri dati anagrafici e 
 * l'inserimento del valore della priorità, che può essere da un minimo di 1 ad 
 * un massimo di 3. Successivamente scegliere il servizio a cui si è interessati,
 * digitando il numero corrispondente, in modo da aggiungersi alla coda di 
 * quest'ultimo. A questo punto il programma restituirà il corrispettivo numero 
 * in coda ed il numerino giornaliero. Nel caso in cui il livello di priorità 
 * fosse 3, il cliente verrà servito immediatamente, senza neanche essere 
 * inserito in coda, altrimenti, la coda si aggiornerà automaticamente in ordine
 * di priorità decrescente. Poi è possibile, digitando il numero 1, visualizzare
 * una coda a scelta, oppure andare avanti, digitando un numero qualsiasi. A 
 * questo punto viene richiesto se si vuole far smaltire la coda servendo il 
 * primo cliente(digitando 1) di una delle code a scelta(digitando il numero 
 * della coda desiderata). Infine viene richiesto se si desidera uscire premendo 
 * 0, oppure continuare digitando un qualsiasi numero.
 */

public class Gestione_Code_Oggetti_Main {

    public static void main(String[] args) {

        //Istanza della classe Array.
        Array oggetto = new Array();

        //Implementazione di un ciclo do-while che termina il programma quando l'utente digita 0 alla richiesta.
        do {

            //Richiamo metodi della classe Array.
            oggetto.Ingresso();
            oggetto.Indirizzamento();
            oggetto.VisualizzaCode();
            oggetto.SvuotaCode();
            oggetto.CicloProgramma();
        } while (oggetto.cicloP != 0);

    }

}
