/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestioneLibreriaArraylist;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */
public class Libro {
    //Dichiarazione delle variabili.
    Scanner scanner = new Scanner(System.in);
    protected String Titolo;
    protected String Autore;
    protected String CasaEditrice;
    protected String Codice_ISBN;
    protected int Prezzo;
    protected int ex = 0;
    
    //Creazione del costruttore principale con passaggio dei parametri.
    public Libro(String Titolo, String Autore, String CasaEditrice, String Codice_ISBN, int Prezzo){
        this.Titolo = Titolo;
        this.Autore = Autore;
        this.CasaEditrice = CasaEditrice;
        this.Codice_ISBN = Codice_ISBN;
        this.Prezzo = Prezzo;
    }
    
    //Creazione del costruttore vuoto.
    public Libro(){
        
    }
    
    //Creazione metodo di registrazione dei libri.
    public void RegistrazioneLibro() {
        //Implementazione ciclo do-while per tornare indietro in caso di errore.
        do {
            //Gestione delle eccezioni.
            try {
                ex = 0;

                //Assegnazione risposte dell'utente agli attributi.
                System.out.println("Salve, la preghiamo di inserire i dati del libro per poterlo identificare.");
                System.out.print("Titolo: ");
                Titolo = scanner.nextLine();
                System.out.print("Autore: ");
                Autore = scanner.nextLine();
                System.out.print("CasaEditrice: ");
                CasaEditrice = scanner.nextLine();

                //Implementazione di un ciclo do-while che permette l'inserimento di un numero di 13 cifre.
                do {
                    System.out.print("Codice ISBN: ");
                    Codice_ISBN = scanner.nextLine();
                    if (Codice_ISBN.length() != 13) {
                        System.out.println("Inserire un numero a 13 cifre!");
                    }
                } while (Codice_ISBN.length() != 13);
                System.out.print("Prezzo: ");
                Prezzo = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
                scanner.nextLine();
            }
        } while (ex == 1);
    }
}

