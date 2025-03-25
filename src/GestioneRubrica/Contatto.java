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

    private String Nome;
    private String Cognome;
    private String Numero;
    private int ex;
    Scanner scanner = new Scanner(System.in);

    public Contatto(String Nome, String Cognome, String Numero) {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Numero = Numero;
    }

    public Contatto() {

    }

    public void setNome() {
        do{
        try {
            ex = 0;
            System.out.print("Inserire il nome del contatto: ");
            Nome = scanner.nextLine();
        } catch (Exception e) {
            ex++;
            System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
            scanner.nextLine();
        }
        }while(ex==1);
    }

    public String getNome() {
        return Nome;
    }

    public void setCognome() {
        do{
        try {
            ex = 0;
            System.out.print("Inserire il cognome del contatto: ");
            Cognome = scanner.nextLine();
        } catch (Exception e) {
            ex++;
            System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
            scanner.nextLine();
        }
        }while(ex==1);
    }

    public String getCognome() {
        return Cognome;
    }

    public void setNumero() {
        do{
        try {
            ex = 0;
            System.out.print("Inserire il numero del contatto: ");
            Numero = scanner.nextLine();
        } catch (Exception e) {
            ex++;
            System.out.println("Qualcosa e' andato storto, controllare di aver inserito i dati corretti!");
            scanner.nextLine();
        }
        }while(ex==1);
    }

    public String getNumero() {
        return Numero;
    }

    @Override
    public String toString() {
        return this.Nome + " " + this.Cognome + " " + this.Numero;
    }
}
