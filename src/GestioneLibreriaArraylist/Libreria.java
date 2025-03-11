package GestioneLibreriaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */
public class Libreria extends Libro {

    //Istanza della classe Scanner.
    Scanner scanner = new Scanner(System.in);

    //Dichiarazione dell'arraylist.
    ArrayList<Libro> Arraylist = new ArrayList<Libro>();
    //Dichiarazione delle variabili.
    public int cicloP;
    private int VisualizzaLibreria;
    private int i;

    //Creazione del costruttore principale con passaggio dei parametri.
    public Libreria(String Titolo, String Autore, String CasaEditrice, String Codice_ISBN, int Prezzo) {

        //Utilizzo di 'super' per richiamare i valori di variabili della classe estesa.
        super(Titolo, Autore, CasaEditrice, Codice_ISBN, Prezzo);
    }

    //Creazione del costruttore vuoto.
    public Libreria() {

    }

    //Creazione metodo di indirizzamento.
    public void Inserimento() {
        //Creazione dell'oggetto di tipo Libro
        Libro Oggetto = new Libro(Titolo, Autore, CasaEditrice, Codice_ISBN, Prezzo);

        //Aggiunta libro alla libreria.
        Arraylist.add(Oggetto);
        System.out.println("IL LIBRO E' STATO AGGIUNTO ALLA LIBRERIA!");
    }

    //Creazione metodo di visualizzazione della libreria.
    public void VisualizzaLibreria() {

        //Implementazione ciclo do-while per tornare indietro in caso di errore.
        do {
            //Gestione delle eccezioni.
            try {
                ex = 0;
                //Richiesta visualizzazione libreria.
                System.out.println("Se si desidera visualizzare la libreria, premere 1, altrimenti premere qualsiasi altro numero!");
                VisualizzaLibreria = scanner.nextInt();
                if (VisualizzaLibreria == 1) {
                    //Stampa Libreria.
                    if (Arraylist.size() == 0) {
                        System.out.println("LA LIBRERIA E' VUOTA!");
                    } else {
                        for (i = 0; i < Arraylist.size(); i++) {
                            System.out.println("Titolo: " + Arraylist.get(i).Titolo + " -Autore: " + Arraylist.get(i).Autore + "  -Casa Editrice: " + Arraylist.get(i).CasaEditrice + "  -Codice ISBN: " + Arraylist.get(i).Codice_ISBN+ "  -Prezzo: " + Arraylist.get(i).Prezzo);
                        }
                    }
                }
            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
                scanner.nextLine();
            }
        } while (ex == 1);

    }
    
     //Creazione metodo di ciclo del programma.
    public void CicloProgramma() {
        do {
            try {
                ex = 0;
                //Richiesta di continuo o terminazione del programma.
                System.out.println("Per aggiungere un'altro libro digitare un numero qualsiasi(NON 0), mentre, per uscire digitare '0'!");
                cicloP = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
                scanner.nextLine();
            }
        } while (ex == 1);
    }

}
