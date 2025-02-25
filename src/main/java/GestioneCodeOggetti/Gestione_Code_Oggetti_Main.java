/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestioneCodeOggetti;

/**
 *
 * @author Lombardo Guido
 */
public class Gestione_Code_Oggetti_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Istanza della classe Gestione_Code_Sviluppo.
        Gestione_Code_Oggetti_Sviluppo oggetto = new Gestione_Code_Oggetti_Sviluppo();
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
