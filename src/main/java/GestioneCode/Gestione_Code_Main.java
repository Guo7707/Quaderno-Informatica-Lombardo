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
/**
 * Questo programma gestisce la coda di PosteItaliane tramite il metodo di
 * gestione code FIFO.
 */
public class Gestione_Code_Main {

    public static void main(String[] args) {
        Gestione_Code_Sviluppo oggetto = new Gestione_Code_Sviluppo();
        do {
            oggetto.Ingresso();
            oggetto.Indirizzamento();
            oggetto.VisualizzaCode();
            oggetto.CicloProgramma();
        } while (oggetto.cicloP != 0);

    }

}
