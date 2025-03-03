/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestioneCodeOggetti;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */

/**
 *
 * Questa classe gestisce il metodo di ingresso.
 */
public class ClientiPoste {

    //Instanza della classe Scanner.
    Scanner scanner = new Scanner(System.in);

    //Creazione attributi clienti.
    protected String Nome;
    protected String Cognome;
    protected int Età;
    protected String LuogoDiNascita;
    protected int Numerino = 0;
    protected int ex = 0;

    /**
     * Creazione attributo che contiene il valore della priorità che va da 1
     * (priorità minima) a 3 (priorità massima).
     */
    protected int Priorità;

    //Creazione del costruttore principale con passaggio dei parametri.
    public ClientiPoste(String Nome, String Cognome, int Numerino, int Priorità) {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Numerino = Numerino;
        this.Priorità = Priorità;
    }

    //Creazione del costruttore vuoto.
    public ClientiPoste() {

    }

    //Creazione metodo di ingresso.
    public void Ingresso() {
        //Implementazione ciclo do-while per tornare indietro in caso di errore.
        do {
            //Gestione delle eccezioni.
            try {
                ex = 0;

                //Assegnazione risposte dell'utente agli attributi.
                System.out.println("Salve, la preghiamo di inserire i suoi dati anagrafici per potersi aggiungere alla coda.");
                System.out.print("Nome: ");
                Nome = scanner.nextLine();
                System.out.print("Cognome: ");
                Cognome = scanner.nextLine();

                //Implementazione di un ciclo do-while che permette l'inserimento di un'età massima(110) e di un'età minima(18).
                do {
                    System.out.print("Eta': ");
                    Età = scanner.nextInt();
                    if (Età > 110 || Età < 18) {
                        System.out.println("Inserire un eta' compresa tra 18 e 110!");
                    }
                } while (Età > 110 || Età < 18);
                scanner.nextLine();
                System.out.print("Luogo di nascita: ");
                LuogoDiNascita = scanner.nextLine();
                System.out.println("GRAZIE DI ESSERTI REGISTRATO!!");

                //Implementazione di un ciclo do-while che permette l'inserimento di una priorità massima(3) e di una priorità minima(1).
                do {
                    System.out.println("Inserire il livello di importanza, da 1 a 3: ");
                    Priorità = scanner.nextInt();
                    if (Priorità < 1 || Priorità > 3) {
                        System.out.println("Inserire un numero compreso tra 1 e 3!");
                    }
                    scanner.nextLine();
                } while (Priorità < 1 || Priorità > 3);
            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
                scanner.nextLine();
            }
        } while (ex == 1);
        Numerino++;
    }
}
