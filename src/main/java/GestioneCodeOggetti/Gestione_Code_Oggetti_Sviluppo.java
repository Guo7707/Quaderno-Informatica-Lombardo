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
public class Gestione_Code_Oggetti_Sviluppo extends ClientiPoste {
    //Istanza della classe Scanner.

    Scanner scanner = new Scanner(System.in);
//Creazione attributi.
    ClientiPoste[] Coda1 = new ClientiPoste[100];
    int i1 = 0;
    ClientiPoste[] Coda2 = new ClientiPoste[100];
    int i2 = 0;
    ClientiPoste[] Coda3 = new ClientiPoste[100];
    int i3 = 0;
    ClientiPoste[] Coda4 = new ClientiPoste[100];
    int i4 = 0;
    ClientiPoste[] Coda5 = new ClientiPoste[100];
    int i5 = 0;
    ClientiPoste[] Coda6 = new ClientiPoste[100];
    int i6 = 0;
    private int scelta;
    public int cicloP;
    private int VisualizzaCoda;
    private int SvuotaCoda;
    private int i;
    String Stringa;
    //private int Numerino = 0;

    public Gestione_Code_Oggetti_Sviluppo(String Nome, String Cognome, int Numerino, int Priorità) {
        super(Nome, Cognome, Numerino, Priorità);
    }

    public Gestione_Code_Oggetti_Sviluppo() {

    }

    //Creazione metodo di indirizzamento.
    public void Indirizzamento() {
        //ClientiPoste Oggetto = new ClientiPoste();
        ClientiPoste Oggetto = new ClientiPoste(Nome, Cognome, Numerino, Priorità);
        //Implementazione di un ciclo do-while che permette di scegliere un numero compreso tra 1 e 6.
        do {
            //Scelta servizio.
            System.out.println("Benvenuto/a in Poste Italiane " + Nome + ", per quale servizio desidera mettersi in coda?");
            System.out.println("1-CORRISPONDENZA E SPEDIZIONI; 2-CONTI CARTE E FINANZIAMENTI; 3-RISPARMIO E INVESTIMENTI; 4-ASSICURAZIONI E PREVIDENZA; 5-ENERGIA E TELEFONIA; 6-SERVIZI AL CITTADINO;");
            scelta = scanner.nextInt();
            if (scelta < 1 || scelta > 6) {
                System.out.println("Inserire un numero compreso tra 1 e 6");
            }
        } while (scelta < 1 || scelta > 6);
        //Aggiunta utente nella coda selezionata.
        if (scelta == 1) {
            if (Priorità == 5) {
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                Oggetto.StampaContenuto();
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {
                i1++;
                System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                System.out.println("Il suo numero in coda e': " + i1);
                System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                Coda1[i1 - 1] = Oggetto;
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 2) {
            if (Priorità == 5) {
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                Oggetto.StampaContenuto();
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {
                i2++;
                System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CONTI CARTE E FINANZIAMENTI'");
                System.out.println("Il suo numero in coda e': " + i2);
                System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                Coda2[i2 - 1] = Oggetto;
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 3) {
            if (Priorità == 5) {
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                Oggetto.StampaContenuto();
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {
                i3++;
                System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'RISPARMIO E INVESTIMENTI'");
                System.out.println("Il suo numero in coda e': " + i3);
                System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                Coda3[i3 - 1] = Oggetto;
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 4) {
            if (Priorità == 5) {
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                Oggetto.StampaContenuto();
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {
                i4++;
                System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'ASSICURAZIONI E PREVIDENZA'");
                System.out.println("Il suo numero in coda e': " + i4);
                System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                Coda4[i4 - 1] = Oggetto;
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 5) {
            if (Priorità == 5) {
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                Oggetto.StampaContenuto();
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {
                i5++;
                System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'ENERGIA E TELEFONIA'");
                System.out.println("Il suo numero in coda e': " + i5);
                System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                Coda5[i5 - 1] = Oggetto;
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 6) {
            if (Priorità == 5) {
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                Oggetto.StampaContenuto();
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {
                i6++;
                System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'SERVIZI AL CITTADINO'");
                System.out.println("Il suo numero in coda e': " + i6);
                System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                Coda6[i6 - 1] = Oggetto;
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        }

    }

    //Creazione metodo di visualizzazione delle code.
    public void VisualizzaCode() {
        //Richiesta visualizzazione coda.
        System.out.println("Se si desidera visualizzare una coda, premere 1, altrimenti premere qualsiasi altro numero!");
        VisualizzaCoda = scanner.nextInt();
        if (VisualizzaCoda == 1) {
            //Implementazione di un ciclo do-while che permette di ripetere le operazioni, se desiderato dall'utente.
            do {
                //Implementazione di un ciclo do-while che permette di scegliere un numero compreso tra 1 e 6.
                do {
                    //Scelta coda da visualizzare.
                    System.out.println("Inserire il numero del servizio di cui si vuole visualizzare la coda!");
                    System.out.println("1-CORRISPONDENZA E SPEDIZIONI; 2-CONTI CARTE E FINANZIAMENTI; 3-RISPARMIO E INVESTIMENTI; 4-ASSICURAZIONI E PREVIDENZA; 5-ENERGIA E TELEFONIA; 6-SERVIZI AL CITTADINO;");
                    VisualizzaCoda = scanner.nextInt();
                    if (VisualizzaCoda < 1 || VisualizzaCoda > 6) {
                        System.out.println("Inserire un numero compreso tra 1 e 6");
                    }
                } while (VisualizzaCoda < 1 || VisualizzaCoda > 6);
                if (VisualizzaCoda == 1) {
                    //Stampa coda 1.
                    if (i1 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i1; i++) {
                            System.out.println(Coda1[i].StampaContenuto());
                        }
                    }
                } else if (VisualizzaCoda == 2) {
                    //Stampa coda 2.
                    if (i2 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i2; i++) {
                            System.out.println(Coda2[i].StampaContenuto());
                        }
                    }
                } else if (VisualizzaCoda == 3) {
                    //Stampa coda 3.
                    if (i3 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i3; i++) {
                            System.out.println(Coda3[i].StampaContenuto());
                        }
                    }
                } else if (VisualizzaCoda == 4) {
                    //Stampa coda 4.
                    if (i4 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i4; i++) {
                            System.out.println(Coda4[i].StampaContenuto());
                        }
                    }
                } else if (VisualizzaCoda == 5) {
                    //Stampa coda 5.
                    if (i5 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i5; i++) {
                            System.out.println(Coda5[i].StampaContenuto());
                        }
                    }
                } else if (VisualizzaCoda == 6) {
                    //Stampa coda 6.
                    if (i6 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i6; i++) {
                            System.out.println(Coda6[i].StampaContenuto());
                        }
                    }
                }
                System.out.println("Se si desidera visualizzare un'altra coda, premere 1, altrimenti premere qualsiasi altro numero!");
                VisualizzaCoda = scanner.nextInt();
            } while (VisualizzaCoda == 1);
        }
    }

    //Creazione metodo di svuotamento delle code.
    public void SvuotaCode() {
        System.out.println("Se si desidera servire un cliente e far smaltire una coda, premere 1, altrimenti premere qualsiasi altro numero!");
        SvuotaCoda = scanner.nextInt();
        if (SvuotaCoda == 1) {
            //Implementazione di un ciclo do-while che permette di ripetere le operazioni, se desiderato dall'utente.
            do {
                //Implementazione di un ciclo do-while che permette di scegliere un numero compreso tra 1 e 6.
                do {
                    //Scelta coda da svuotare.
                    System.out.println("Inserire il numero del servizio di cui si vuole far smaltire la coda!");
                    System.out.println("1-CORRISPONDENZA E SPEDIZIONI; 2-CONTI CARTE E FINANZIAMENTI; 3-RISPARMIO E INVESTIMENTI; 4-ASSICURAZIONI E PREVIDENZA; 5-ENERGIA E TELEFONIA; 6-SERVIZI AL CITTADINO;");
                    SvuotaCoda = scanner.nextInt();
                    if (SvuotaCoda < 1 || SvuotaCoda > 6) {
                        System.out.println("Inserire un numero compreso tra 1 e 6");
                    }
                } while (SvuotaCoda < 1 || SvuotaCoda > 6);
                //Svuotamento coda 1.
                if (SvuotaCoda == 1) {
                    if (i1 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i1 == 1) {
                        System.out.println("E' il turno di: " + Coda1[0].StampaContenuto());
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i1 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda1[i1 - i].StampaContenuto());
                        for (int i = 0; i < i1 - 1; i++) {
                            Coda1[i] = Coda1[i + 1];
                        }
                        i1--;
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i1; i++) {
                            System.out.println(Coda1[i].StampaContenuto());
                        }
                    }
                }
                if (SvuotaCoda == 2) {
                    //Svuotamento coda 2.
                    if (i2 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i2 == 1) {
                        System.out.println("E' il turno di: " + Coda2[0].StampaContenuto());
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i2 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda2[i2 - i].StampaContenuto());
                        for (int i = 0; i < i2 - 1; i++) {
                            Coda2[i] = Coda2[i + 1];
                        }
                        i2--;
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i2; i++) {
                            System.out.println(Coda2[i].StampaContenuto());
                        }
                    }
                }
                if (SvuotaCoda == 3) {
                    //Svuotamento coda 3.
                    if (i3 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i3 == 1) {
                        System.out.println("E' il turno di: " + Coda3[0].StampaContenuto());
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i3 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda3[i3 - i].StampaContenuto());
                        for (int i = 0; i < i3 - 1; i++) {
                            Coda3[i] = Coda3[i + 1];
                        }
                        i3--;
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i3; i++) {
                            System.out.println(Coda3[i].StampaContenuto());
                        }
                    }
                }
                if (SvuotaCoda == 4) {
                    //Svuotamento coda 4.
                    if (i4 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i4 == 1) {
                        System.out.println("E' il turno di: " + Coda4[0].StampaContenuto());
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i4 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda4[i4 - i].StampaContenuto());
                        for (int i = 0; i < i4 - 1; i++) {
                            Coda4[i] = Coda4[i + 1];
                        }
                        i4--;
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i4; i++) {
                            System.out.println(Coda4[i].StampaContenuto());
                        }
                    }
                }
                if (SvuotaCoda == 5) {
                    //Svuotamento coda 5.
                    if (i5 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i5 == 1) {
                        System.out.println("E' il turno di: " + Coda5[0].StampaContenuto());
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i5 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda5[i5 - i].StampaContenuto());
                        for (int i = 0; i < i5 - 1; i++) {
                            Coda5[i] = Coda5[i + 1];
                        }
                        i5--;
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i5; i++) {
                            System.out.println(Coda5[i].StampaContenuto());
                        }
                    }
                }
                if (SvuotaCoda == 6) {
                    //Svuotamento coda 6.
                    if (i6 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i6 == 1) {
                        System.out.println("E' il turno di: " + Coda6[0].StampaContenuto());
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i6 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda6[i6 - i].StampaContenuto());
                        for (int i = 0; i < i6 - 1; i++) {
                            Coda6[i] = Coda6[i + 1];
                        }
                        i6--;
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i6; i++) {
                            System.out.println(Coda6[i].StampaContenuto());
                        }
                    }
                }
                System.out.println("Se si desidera servire un altro cliente, premere 1, altrimenti premere qualsiasi altro numero!");
                SvuotaCoda = scanner.nextInt();
            } while (SvuotaCoda == 1);

        }
    }

    //Creazione metodo di ciclo del programma.
    public void CicloProgramma() {
        //Richiesta di continuo o terminazione del programma.
        System.out.println("Per aggiungere un'altro utente digitare un numero qualsiasi(NON 0), mentre, per uscire digitare '0'");
        cicloP = scanner.nextInt();
        scanner.nextLine();
    }
}
