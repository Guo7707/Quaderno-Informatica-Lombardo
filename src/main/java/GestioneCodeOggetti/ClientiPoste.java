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
public class ClientiPoste {
    Scanner scanner = new Scanner(System.in);
    //Creazione attributi clienti.
    protected String Nome;
    protected String Cognome;
    protected int Età;
    protected String LuogoDiNascita;
    protected int Numerino = 0;
    /**
     * Creazione attributo che contiene il valore della priorità che va da 1
     * (priorità minima) a 5 (priorità massima).
     */
    protected int Priorità;
    
    public ClientiPoste(String Nome, String Cognome, int Numerino, int Priorità){
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Numerino = Numerino;
        this.Priorità = Priorità;
    }
    
    public ClientiPoste(){
        
    }
    //Creazione metodo di ingresso.
    public void Ingresso() {
        Numerino++;
        //Assegnazione risposte utente agli attributi.
        System.out.println("Salve, la preghiamo di inserire i suoi dati anagrafici per potersi aggiungere alla coda");
        System.out.print("Nome: ");
        Nome = scanner.nextLine();
        System.out.print("Cognome: ");
        Cognome = scanner.nextLine();
        //Implementazione di un ciclo do-while che applica età massima(110) ed età minima(18).
        do {
            System.out.print("Eta': ");
            Età = scanner.nextInt();
            if (Età > 110 || Età < 18) {
                System.out.println("Inserire un eta' compresa tra 18 e 110");
            }
        } while (Età > 110 || Età < 18);
        scanner.nextLine();
        System.out.print("Luogo di nascita: ");
        LuogoDiNascita = scanner.nextLine();
        System.out.println("GRAZIE DI ESSERTI REGISTRATO!!");
        System.out.println("Inserire il livello di importanza, da 1 a 5: ");
        Priorità = scanner.nextInt();
    }
    
      public ClientiPoste StampaContenuto() {
        System.out.println(Nome + " " + Cognome + "  -Numerino: " + Numerino + "  -Priorità: " +Priorità);
        return this;
    }
}
