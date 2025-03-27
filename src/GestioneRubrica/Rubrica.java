/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestioneRubrica;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */
public class Rubrica {

    //Dichiarazione attributi.
    int i;
    int Scelta;
    private int ex;
    private String Nome;
    private String Cognome;
    private String Numero;
    
    //Dichiarazione attributo di tipo "Contatto".
    private Contatto UltimoContatto;
    
    //Dichiarazione ArrayList.
    ArrayList<Contatto> arraylist = new ArrayList<Contatto>();

    //Istanza classe Scanner.
    Scanner scanner = new Scanner(System.in);

    //Costruttore vuoto.
    public Rubrica() {

    }

    //Metodo AggiungiContatto che aggiunge un contatto alla rubrica.
    public void AggiungiContatto() {
        //Istanza della classe "Contatto".
        Contatto Oggetto = new Contatto();
        
        //Richiamo dei metodi setter.
        Oggetto.setNome();
        Oggetto.setCognome();
        Oggetto.setNumero();
        
        //Assegnazione dell'Oggetto di tipo "Contatto" alla variabile "UltimoContatto" di tipo "Contatto".
        UltimoContatto = Oggetto;
        
        //Aggiunta contatto alla rubrica.
        arraylist.add(Oggetto);

        System.out.println("Il contatto " + Oggetto.getNome() + " " + Oggetto.getCognome() + " e' stato aggiunto alla rubrica!");
    }

    //Metodo RimuoviContatto che rimuove un contatto dalla rubrica.
    public void RimuoviContatto(String Nome, String Cognome) {
        //Implementazione ciclo do-while per tornare indietro in caso di errore.
        do {
            //Gestione delle eccezioni.
            try {
                ex = 0;
                int conta = 0;
                //Richiesta input.
                System.out.print("Inserire il nome del contatto da eliminare: ");
                Nome = scanner.nextLine();
                System.out.print("Inserire il cognome del contatto da eliminare: ");
                Cognome = scanner.nextLine();

                //Implementazione di un ciclo for che rimuove un contatto dalla rubrica se corrisponde all'input inserito dall'utente.
                for (i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i).getNome().equalsIgnoreCase(Nome) && arraylist.get(i).getCognome().equalsIgnoreCase(Cognome)) {
                        arraylist.remove(i);
                        System.out.println("Il contatto " + Nome + " " + Cognome + " e' stato eliminato!");
                        conta++;
                    }
                }
                //Controllo esistenza del contatto.
                if (conta != 1) {
                    System.out.println("Il contatto " + Nome + " " + Cognome + " non esiste!");
                }
            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
            }
        } while (ex == 1);

    }

    //Metodo CercaContatto che che dato un nome e cognome restituisce il numero di telefono associato a quel nome e cognome.
    public String CercaContatto(String Nome, String Cognome) {

        int conta = 0;
        //Richiesta input.
        System.out.print("Inserire il nome del contatto da cercare: ");
        Nome = scanner.nextLine();
        System.out.print("Inserire il cognome del contatto da cercare: ");
        Cognome = scanner.nextLine();

        //Implementazione di un ciclo for che fornisce il numero di un contatto della rubrica se corrisponde all'input inserito dall'utente.
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).getNome().equalsIgnoreCase(Nome) && arraylist.get(i).getCognome().equalsIgnoreCase(Cognome)) {
                conta++;
                System.out.println("Il numero del contatto " + Nome + " " + Cognome + " e': " + arraylist.get(i).getNumero());

            }
        }
        //Controllo esistenza del contatto.
        if (conta != 1) {
            System.out.println("Il contatto " + Nome + " " + Cognome + " non esiste!");
        }
        return "";
    }

    //Metodo toString() che restituisce una descrizione testuale dell’intera rubrica.
    @Override
    public String toString() {
        System.out.println("La rubrica completa e': ");
        for (i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i).getNome() + " " + arraylist.get(i).getCognome() + " " + arraylist.get(i).getNumero());
        }
        return "";
    }

    //Metodo di interfaccia con l'utente.
    public void InterfacciaUtente() {
        //Implementazione ciclo do-while per tornare indietro in caso di errore.
        do {
            //Gestione delle eccezioni.
            try {
                ex = 0;
                Scanner scanner = new Scanner(System.in);
                //Implementazione ciclo do-while per ciclare il codice.
                do {
                    //Richiesta operazione.
                    System.out.println("Benvenuto nella rubrica, che operazione si desidera svolgere?");
                    System.out.println("0-Torna indietro; \n1-Aggiungi un contatto; \n2-Visualizza l'ultimo contatto aggiunto; \n3-Elimina un contatto; \n4-Cerca un contatto; \n5-Visualizza la rubrica;  \nPremere qualsiasi altro numero per terminare.");
                    Scelta = scanner.nextInt();
                    
                    switch (Scelta) {
                        //Blocco di codice da eseguire nel caso in cui la variabile scelta fosse 1.
                        case 1:
                            //Implementazione ciclo do-while per ripetere l'ultima operazione se richiesto.
                            do {
                                //Richiamo metodo "AggiungiContatto".
                                AggiungiContatto();

                                System.out.println("\n-----------------------------------------------");
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                                System.out.println("-----------------------------------------------");
                            } while (Scelta == 1);
                            break;
                            
                        //Blocco di codice da eseguire nel caso in cui la variabile scelta fosse 2.
                        case 2:
                            //Implementazione ciclo do-while per ripetere l'ultima operazione se richiesto.
                            do {

                                //Stampa la variabile "UltimoContatto" richiamando automaticamente il metodo "toString" della classe "Contatto" se esso non è null.
                                if (UltimoContatto != null) {
                                    System.out.println("L'ultimo contatto aggiunto e': ");
                                    System.out.println(UltimoContatto);
                                } else {
                                    System.out.println("Non e' stato ancora aggiunto alcun contatto!");
                                }

                                System.out.println("\n-----------------------------------------------");
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                                System.out.println("-----------------------------------------------");
                            } while (Scelta == 1);
                            break;
                            
                        //Blocco di codice da eseguire nel caso in cui la variabile scelta fosse 3.
                        case 3:
                            //Implementazione ciclo do-while per ripetere l'ultima operazione se richiesto.
                            do {
                                //Richiamo metodo "RimuoviContatto" se la variabile "UltimoContatto" non è null.
                                if (UltimoContatto != null) {
                                    RimuoviContatto(Nome, Cognome);
                                } else {
                                    System.out.println("Non e' stato ancora aggiunto alcun contatto!");
                                }

                                System.out.println("\n-----------------------------------------------");
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                                System.out.println("-----------------------------------------------");
                            } while (Scelta == 1);
                            break;
                            
                        //Blocco di codice da eseguire nel caso in cui la variabile scelta fosse 4.
                        case 4:
                            //Implementazione ciclo do-while per ripetere l'ultima operazione se richiesto.
                            do {
                                //Richiamo metodo "CercaContatto" se la variabile "UltimoContatto" non è null.
                                if (UltimoContatto != null) {
                                    CercaContatto(Nome, Cognome);
                                } else {
                                    System.out.println("Non e' stato ancora aggiunto alcun contatto!");
                                }

                                System.out.println("\n-----------------------------------------------");
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                                System.out.println("-----------------------------------------------");
                            } while (Scelta == 1);
                            break;
                        //Blocco di codice da eseguire nel caso in cui la variabile scelta fosse 5.
                        case 5:
                            //Implementazione ciclo do-while per ripetere l'ultima operazione se richiesto.
                            do {
                                //Richiamo metodo "toString" della classe "Rubrica" se la variabile "UltimoContatto" non è null.
                                if (UltimoContatto != null) {
                                    toString();
                                } else {
                                    System.out.println("Non e' stato ancora aggiunto alcun contatto!");
                                }

                                System.out.println("\n-----------------------------------------------");
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                                System.out.println("-----------------------------------------------");
                            } while (Scelta == 1);
                            break;
                    }

                } while (Scelta == 0);

            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
            }
            //Avviso di uscita dal programma.
            if (Scelta > 5 || Scelta < 0) {
                System.out.println("Sei sicuro di voler uscire?");
                System.out.println("0-Esci; 1-Torna indietro;");
                ex = scanner.nextInt();
                scanner.nextLine();
            }
        } while (ex == 1);

    }

}
