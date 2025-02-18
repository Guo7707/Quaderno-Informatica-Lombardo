/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestioneCode;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */
public class Gestione_Code_Sviluppo {
Scanner scanner = new Scanner(System.in);
    private String Nome;
    private String Cognome;
    private int Età;
    private String LuogoDiNascita;
    String[] Coda1 = new String[100];
    int i1 = 0;
    String[] Coda2 = new String[100];
    int i2 = 0;
    String[] Coda3 = new String[100];
    int i3 = 0;
    String[] Coda4 = new String[100];
    int i4 = 0;
    String[] Coda5 = new String[100];
    int i5 = 0;
    String[] Coda6 = new String[100];
    int i6 = 0;
    private int scelta;
    public int cicloP;
    private int VisualizzaCoda;
    private int i;

    public void Ingresso() {
        System.out.println("Salve, la preghiamo di inserire i suoi dati anagrafici per potersi aggiungere alla coda");
        System.out.print("Nome: ");
        Nome = scanner.nextLine();
        System.out.print("Cognome: ");
        Cognome = scanner.nextLine();
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
    }

    public void Indirizzamento() {
        do {
            System.out.println("Benvenuto in Poste Italiane " + Nome + ", per quale servizio desidera mettersi in coda?");
            System.out.println("1-CORRISPONDENZA E SPEDIZIONI; 2-CONTI CARTE E FINANZIAMENTI; 2-CONTI CARTE E FINANZIAMENTI; 3-RISPARMIO E INVESTIMENTI; 4-ASSICURAZIONI E PREVIDENZA; 5-ENERGIA E TELEFONIA; 6-SERVIZI AL CITTADINO;");
            scelta = scanner.nextInt();
            if (scelta < 1 || scelta > 6) {
                System.out.println("Inserire un numero compreso tra 1 e 6");
            }
        } while (scelta < 1 || scelta > 6);
        if (scelta == 1) {
            i1++;
            System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
            System.out.println("Il suo numero in coda e': " + i1);
            Coda1[i1 - 1] = Cognome;
        } else if (scelta == 2) {
            i2++;
            System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CONTI CARTE E FINANZIAMENTI'");
            System.out.println("Il suo numero in coda e': " + i2);
            Coda2[i2 - 1] = Cognome;
        } else if (scelta == 3) {
            i3++;
            System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'RISPARMIO E INVESTIMENTI'");
            System.out.println("Il suo numero in coda e': " + i3);
            Coda3[i3 - 1] = Cognome;
        } else if (scelta == 4) {
            i4++;
            System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'ASSICURAZIONI E PREVIDENZA'");
            System.out.println("Il suo numero in coda e': " + i4);
            Coda4[i4 - 1] = Cognome;
        } else if (scelta == 5) {
            i5++;
            System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'ENERGIA E TELEFONIA'");
            System.out.println("Il suo numero in coda e': " + i5);
            Coda5[i5 - 1] = Cognome;
        } else if (scelta == 6) {
            i6++;
            System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'SERVIZI AL CITTADINO'");
            System.out.println("Il suo numero in coda e': " + i6);
            Coda6[i6 - 1] = Cognome;
        }

    }

    public void VisualizzaCode() {
        System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
        System.out.println("Se si desidera visualizzare una coda, premere 1, altrimenti premere qualsiasi altro numero!");
        VisualizzaCoda = scanner.nextInt();
        if (VisualizzaCoda == 1) {
            do {
                System.out.println("Inserire il numero del servizio di cui si vuole visualizzare la coda!");
                System.out.println("1-CORRISPONDENZA E SPEDIZIONI; 2-CONTI CARTE E FINANZIAMENTI; 3-RISPARMIO E INVESTIMENTI; 4-ASSICURAZIONI E PREVIDENZA; 5-ENERGIA E TELEFONIA; 6-SERVIZI AL CITTADINO;");
                VisualizzaCoda = scanner.nextInt();
                if (VisualizzaCoda < 1 || VisualizzaCoda > 6) {
                    System.out.println("Inserire un numero compreso tra 1 e 6");
                }
            } while (VisualizzaCoda < 1 || VisualizzaCoda > 6);
            if (VisualizzaCoda == 1) {
                for (i = 0; i == i1; i++) {
                    System.out.println(Coda1[i]);
                }
            } else if (VisualizzaCoda == 2) {
                for (i = 0; i == i2; i++) {
                    System.out.println(Coda2[i]);
                }
            } else if (VisualizzaCoda == 3) {
                for (i = 0; i == i3; i++) {
                    System.out.println(Coda3[i]);
                }
            } else if (VisualizzaCoda == 4) {
                for (i = 0; i == i4; i++) {
                    System.out.println(Coda4[i]);
                }
            } else if (VisualizzaCoda == 5) {
                for (i = 0; i == i5; i++) {
                    System.out.println(Coda5[i]);
                }
            } else if (VisualizzaCoda == 6) {
                for (i = 0; i == i6; i++) {
                    System.out.println(Coda6[i]);
                }
            }
        }
    }

    public void CicloProgramma() {
        System.out.println("Per aggiungerne un'altro digitare un numero qualsiasi(NON 0), mentre, per uscire digitare '0'");
        cicloP = scanner.nextInt();
        scanner.nextLine();
    }
}
