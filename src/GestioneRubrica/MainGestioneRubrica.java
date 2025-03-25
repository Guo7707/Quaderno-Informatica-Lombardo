/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestioneRubrica;

/**
 *
 * @author Lombardo Guido
 */

/**
 * Sia data una classe Contatto le cui istanze rappresentano 
 * contatti telefonici. Ogni contatto ha un nome, un cognome e 
 * un numero telefonico (tutti di tipo String), un costruttore 
 * che riceve come parametro il nome, il cognome e il numero di 
 * telefono associati al contatto, metodi per leggere tali valori 
 * e il metodo toString() che restituisce una rappresentazione 
 * testuale del contatto.
 * 
 * Scrivere una classe Rubrica che rappresenta una collezione di
 * contatti. La classe memorizza i contatti per mezzo di una lista 
 * ed è dotata dei seguenti metodi:
 *  -void aggiungiContatto(String nome, String cognome, String telefono) 
 *   che aggiunge un contatto alla rubrica;
 *  -void rimuoviContatto(String nome, String cognome) che rimuove dalla 
 *   rubrica il contatto associato al nome e cognome dati;
 *  -String cerca(String nome, String cognome) che dato un nome 
 *   e cognome restituisce il numero di telefono associato a quel 
 *   nome e cognome oppure null se il nome e cognome non sono 
 *   presenti in rubrica;
 *  -String toString() che restituisce una descrizione testuale dell’intera rubrica.
 */

// TUTTI I RETURN DEVONO ESSERE AGGIUSTATI.
public class MainGestioneRubrica {

    
    public static void main(String[] args) {
        Rubrica OggR = new Rubrica();
        OggR.InterfacciaUtente();
    }
    
}
