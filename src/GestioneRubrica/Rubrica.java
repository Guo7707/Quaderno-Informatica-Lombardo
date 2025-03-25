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

    int i;
    int Scelta;
    private int ex;
    private String Nome;
    private String Cognome;
    private String Numero;
    ArrayList<Contatto> arraylist = new ArrayList<Contatto>();
    Scanner scanner = new Scanner(System.in);

    public Rubrica() {

    }

    public void AggiungiContatto() {
        Contatto Oggetto = new Contatto();
        Oggetto.setNome();
        Oggetto.setCognome();
        Oggetto.setNumero();
        arraylist.add(Oggetto);
    }

    public void RimuoviContatto(String Nome, String Cognome) {
        do {
            try {
                ex = 0;
                int conta = 0;
                System.out.print("Inserire il nome del contatto da eliminare: ");
                Nome = scanner.nextLine();
                System.out.print("Inserire il cognome del contatto da eliminare: ");
                Cognome = scanner.nextLine();

                for (i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i).getNome().equalsIgnoreCase(Nome) && arraylist.get(i).getCognome().equalsIgnoreCase(Cognome)) {
                        arraylist.remove(i);
                        System.out.println("Il contatto " + Nome + " " + Cognome + " è stato eliminato!");
                        conta++;
                    }
                }
                if (conta != 1) {
                    System.out.println("Il contatto " + Nome + " " + Cognome + " non esiste!");
                }
            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
                scanner.nextLine();
            }
        } while (ex == 1);

    }

    public String CercaContatto(String Nome, String Cognome) {

                int N = 0;
                System.out.print("Inserire il nome del contatto da cercare: ");
                Nome = scanner.nextLine();
                System.out.print("Inserire il cognome del contatto da cercare: ");
                Cognome = scanner.nextLine();

                for (i = 0; i < arraylist.size(); i++) {
                    if (arraylist.get(i).getNome().equalsIgnoreCase(Nome) && arraylist.get(i).getCognome().equalsIgnoreCase(Cognome)) {
                        N = i;
                    }
                }
                if (N != 0) {
                    return arraylist.get(N).getNumero();
                } else {
                    return "Il contatto" + Nome + " " + Cognome + " non esiste!";
                }
            
    }

    @Override
    public String toString() {
        for (i = 0; i < arraylist.size(); i++) {
            return arraylist.get(i).getNome() + " " + arraylist.get(i).getCognome() + " " + arraylist.get(i).getNumero();
        }
        return "Questa è la rubrica completa!";
    }

    public void InterfacciaUtente() {
        do {
            try {
                ex = 0;

                Scanner scanner = new Scanner(System.in);
                Rubrica OggR = new Rubrica();
                Contatto OggC = new Contatto();
                do {
                    System.out.println("Benvenuto nella rubrica, che operazione desidera svolgere?");
                    System.out.println("1-Aggiungere un contatto; 2-Stampare ultimo contatto aggiunto; 3-Eliminare un contatto; 4-Cercare un contatto; 5-Stampare la rubrica O qualsiasi altro numero per terminare.");
                    Scelta = scanner.nextInt();
                    switch (Scelta) {
                        case 1:
                            do {
                                OggR.AggiungiContatto();
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                            } while (Scelta == 1);
                            break;
                        case 2:
                            do {
                                OggC.toString();
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                            } while (Scelta == 1);
                            break;
                        case 3:
                            do {
                                OggR.RimuoviContatto(Nome, Cognome);
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                            } while (Scelta == 1);
                            break;
                        case 4:
                            do {
                                OggR.CercaContatto(Nome, Cognome);
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                            } while (Scelta == 1);
                            break;
                        case 5:
                            do {
                                OggR.toString();
                                System.out.println("0-Torna indietro; 1-Ripeti l'ultima operazione;");
                                Scelta = scanner.nextInt();
                            } while (Scelta == 1);
                            break;
                    }
                } while (Scelta == 0);

            } catch (Exception e) {
                ex++;
                System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
                scanner.nextLine();
            }
        } while (ex == 1);
    }

}
