/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestioneRubrica;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */


public class Contatto {

    //Dichiarazione attributi.
    private String Nome;
    private String Cognome;
    private String Numero;
    private int ex;
    
    //Istanza classe Scanner.
    Scanner scanner = new Scanner(System.in);      

    //Costruttore principale con parametri.
    public Contatto(String Nome, String Cognome, String Numero) {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Numero = Numero;
    }
    
    //Costruttore vuoto.
    public Contatto() {

    }

    //Metodo setter della variabile Nome con input dell'utente.
    public void setNome() {
        do{
        try {
            ex = 0;
            System.out.print("Inserire il nome del contatto: ");
            this.Nome = scanner.nextLine();
        } catch (Exception e) {
            ex++;
            System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
        }
        }while(ex==1);
    }

    //Metodo getter della variabile Nome.
    public String getNome() {
        return Nome;
    }

    //Metodo setter della variabile Cognome con input dell'utente.
    public void setCognome() {
        do{
        try {
            ex = 0;
            System.out.print("Inserire il cognome del contatto: ");
            this.Cognome = scanner.nextLine();
        } catch (Exception e) {
            ex++;
            System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
        }
        }while(ex==1);
    }

    //Metodo getter della variabile Cognome.
    public String getCognome() {
        return Cognome;
    }

    //Metodo setter della variabile Numero con input dell'utente.
    public void setNumero() {
        do{
        try {
            ex = 0;
            System.out.print("Inserire il numero del contatto: ");
            this.Numero = scanner.nextLine();
        } catch (Exception e) {
            ex++;
            System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
        }
        }while(ex==1);
    }

    //Metodo getter della variabile Numero.
    public String getNumero() {
        return Numero;
    }

    //Metodo toString che restituisce una rappresentazione testuale del contatto.
    @Override
    public String toString() {
        
        return this.Nome + " " + this.Cognome + " " + this.Numero;
    }
}
