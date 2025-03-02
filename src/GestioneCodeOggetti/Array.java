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
public class Array extends ClientiPoste {

    //Istanza della classe Scanner.
    Scanner scanner = new Scanner(System.in);

    //Dichiarazione dei vettori e dei propri contatori.
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

    //Dichiarazione delle variabili.
    private int scelta;
    public int cicloP;
    private int VisualizzaCoda;
    private int SvuotaCoda;
    private int i;

    //Creazione del costruttore principale con passaggio dei parametri.
    public Array(String Nome, String Cognome, int Numerino, int Priorità) {

        //Utilizzo di 'super' per richiamare i valori di variabili della classe estesa.
        super(Nome, Cognome, Numerino, Priorità);
    }

    //Creazione del costruttore vuoto.
    public Array() {

    }

    //Creazione metodo di indirizzamento.
    public void Indirizzamento() {

        //Creazione dell'oggetto di tipo ClientiPoste
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

        //Indirizzamento utente nella coda selezionata.
        if (scelta == 1) {
            if (Priorità == 3) {

                //Servizio d'urgenza nel caso di cliente con massimo livello di priorità.
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                System.out.println(Oggetto.Nome + " " + Oggetto.Cognome + "  -Numerino: " + Oggetto.Numerino + "  -Priorita': " + Oggetto.Priorità);
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {

                //Aggiunta utente nella coda 1.
                int Contaif = 0;
                int NumCoda = 0;
                i1++;
                //Inserimento dell'oggetto nella coda
                Coda1[i1 - 1] = Oggetto;
                for (i = 0; i < i1; i++) {
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    if (Contaif == 0) {
                        //Verifica ordine priorità decrescente
                        if (Coda1[i].Priorità < Coda1[i1 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Ordinamento coda per priorità decrescente
                            temp = Coda1[i];
                            Coda1[i] = Coda1[i1 - 1];
                            Coda1[i1 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    } else if (Contaif != 0) {
                        //Verifica ordine priorità decrescente o uguale
                        if (Coda1[i].Priorità <= Coda1[i1 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Scalo posizioni dell'array
                            temp = Coda1[i];
                            Coda1[i] = Coda1[i1 - 1];
                            Coda1[i1 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    }
                }
                if (Contaif == 0) {
                    //Stampe nel caso in cui non è stato eseguito alcun ordinamento
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + i1);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                } else {
                    //Stampe nel caso in cui è stato eseguito l'ordinamento
                    System.out.println("La coda e' stata modificata in ordine di priorita' decrescente");
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + NumCoda);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                }
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 2) {
            if (Priorità == 3) {

                //Servizio d'urgenza nel caso di cliente con massimo livello di priorità.
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                System.out.println(Oggetto.Nome + " " + Oggetto.Cognome + "  -Numerino: " + Oggetto.Numerino + "  -Priorita': " + Oggetto.Priorità);
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {

                //Aggiunta utente nella coda 2.
                int Contaif = 0;
                int NumCoda = 0;
                i2++;
                //Inserimento dell'oggetto nella coda
                Coda2[i2 - 1] = Oggetto;
                for (i = 0; i < i2; i++) {
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    if (Contaif == 0) {
                        //Verifica ordine priorità decrescente
                        if (Coda2[i].Priorità < Coda2[i2 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Ordinamento coda per priorità decrescente
                            temp = Coda2[i];
                            Coda2[i] = Coda2[i2 - 1];
                            Coda2[i2 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    } else if (Contaif != 0) {
                        //Verifica ordine priorità decrescente o uguale
                        if (Coda2[i].Priorità <= Coda2[i2 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Scalo posizioni dell'array
                            temp = Coda2[i];
                            Coda2[i] = Coda2[i2 - 1];
                            Coda2[i2 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    }
                }
                if (Contaif == 0) {
                    //Stampe nel caso in cui non è stato eseguito alcun ordinamento
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + i2);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                } else {
                    //Stampe nel caso in cui è stato eseguito l'ordinamento
                    System.out.println("La coda e' stata modificata in ordine di priorita' decrescente");
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + NumCoda);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                }
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 3) {
            if (Priorità == 3) {

                //Servizio d'urgenza nel caso di cliente con massimo livello di priorità.
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                System.out.println(Oggetto.Nome + " " + Oggetto.Cognome + "  -Numerino: " + Oggetto.Numerino + "  -Priorita': " + Oggetto.Priorità);
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {

                //Aggiunta utente nella coda 3.
                int Contaif = 0;
                int NumCoda = 0;
                i3++;
                //Inserimento dell'oggetto nella coda
                Coda3[i3 - 1] = Oggetto;
                for (i = 0; i < i3; i++) {
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    if (Contaif == 0) {
                        //Verifica ordine priorità decrescente
                        if (Coda3[i].Priorità < Coda3[i3 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Ordinamento coda per priorità decrescente
                            temp = Coda3[i];
                            Coda3[i] = Coda3[i3 - 1];
                            Coda3[i3 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    } else if (Contaif != 0) {
                        //Verifica ordine priorità decrescente o uguale
                        if (Coda3[i].Priorità <= Coda3[i3 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Scalo posizioni dell'array
                            temp = Coda3[i];
                            Coda3[i] = Coda3[i3 - 1];
                            Coda3[i3 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    }
                }
                if (Contaif == 0) {
                    //Stampe nel caso in cui non è stato eseguito alcun ordinamento
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + i3);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                } else {
                    //Stampe nel caso in cui è stato eseguito l'ordinamento
                    System.out.println("La coda e' stata modificata in ordine di priorita' decrescente");
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + NumCoda);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                }
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 4) {
            if (Priorità == 3) {

                //Servizio d'urgenza nel caso di cliente con massimo livello di priorità.
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                System.out.println(Oggetto.Nome + " " + Oggetto.Cognome + "  -Numerino: " + Oggetto.Numerino + "  -Priorita': " + Oggetto.Priorità);
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {

                //Aggiunta utente nella coda 4.
                int Contaif = 0;
                int NumCoda = 0;
                i4++;
                //Inserimento dell'oggetto nella coda
                Coda4[i4 - 1] = Oggetto;
                for (i = 0; i < i4; i++) {
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    if (Contaif == 0) {
                        //Verifica ordine priorità decrescente
                        if (Coda4[i].Priorità < Coda4[i4 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Ordinamento coda per priorità decrescente
                            temp = Coda4[i];
                            Coda4[i] = Coda4[i4 - 1];
                            Coda4[i4 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    } else if (Contaif != 0) {
                        //Verifica ordine priorità decrescente o uguale
                        if (Coda4[i].Priorità <= Coda4[i4 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Scalo posizioni dell'array
                            temp = Coda4[i];
                            Coda4[i] = Coda4[i4 - 1];
                            Coda4[i4 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    }
                }
                if (Contaif == 0) {
                    //Stampe nel caso in cui non è stato eseguito alcun ordinamento
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + i4);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                } else {
                    //Stampe nel caso in cui è stato eseguito l'ordinamento
                    System.out.println("La coda e' stata modificata in ordine di priorita' decrescente");
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + NumCoda);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                }
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 5) {
            if (Priorità == 3) {

                //Servizio d'urgenza nel caso di cliente con massimo livello di priorità.
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                System.out.println(Oggetto.Nome + " " + Oggetto.Cognome + "  -Numerino: " + Oggetto.Numerino + "  -Priorita': " + Oggetto.Priorità);
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {

                //Aggiunta utente nella coda 5.
                int Contaif = 0;
                int NumCoda = 0;
                i5++;
                //Inserimento dell'oggetto nella coda
                Coda5[i5 - 1] = Oggetto;
                for (i = 0; i < i5; i++) {
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    if (Contaif == 0) {
                        //Verifica ordine priorità decrescente
                        if (Coda5[i].Priorità < Coda5[i5 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Ordinamento coda per priorità decrescente
                            temp = Coda5[i];
                            Coda5[i] = Coda5[i5 - 1];
                            Coda5[i5 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    } else if (Contaif != 0) {
                        //Verifica ordine priorità decrescente o uguale
                        if (Coda5[i].Priorità <= Coda5[i5 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Scalo posizioni dell'array
                            temp = Coda5[i];
                            Coda5[i] = Coda5[i5 - 1];
                            Coda5[i5 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    }
                }
                if (Contaif == 0) {
                    //Stampe nel caso in cui non è stato eseguito alcun ordinamento
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + i5);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                } else {
                    //Stampe nel caso in cui è stato eseguito l'ordinamento
                    System.out.println("La coda e' stata modificata in ordine di priorita' decrescente");
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + NumCoda);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                }
                System.out.println("L'UTENTE E' STATO AGGIUNTO AD UNA CODA!!");
            }
        } else if (scelta == 6) {
            if (Priorità == 3) {

                //Servizio d'urgenza nel caso di cliente con massimo livello di priorità.
                System.out.println("ATTENZIONE, MASSIMO LIVELLO DI PRIORITA'");
                System.out.println("Serviamo d'urgenza il cliente: ");
                System.out.println(Oggetto.Nome + " " + Oggetto.Cognome + "  -Numerino: " + Oggetto.Numerino + "  -Priorita': " + Oggetto.Priorità);
                System.out.println("L'UTENTE E' STATO SERVITO!!");
            } else {

                //Aggiunta utente nella coda 6.
                int Contaif = 0;
                int NumCoda = 0;
                i6++;
                //Inserimento dell'oggetto nella coda
                Coda6[i6 - 1] = Oggetto;
                for (i = 0; i < i6; i++) {
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    if (Contaif == 0) {
                        //Verifica ordine priorità decrescente
                        if (Coda6[i].Priorità < Coda6[i6 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Ordinamento coda per priorità decrescente
                            temp = Coda6[i];
                            Coda6[i] = Coda6[i6 - 1];
                            Coda6[i6 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    //Verifica se è già stato eseguito l'ordinamento di almeno una posizione dell'array
                    } else if (Contaif != 0) {
                        //Verifica ordine priorità decrescente o uguale
                        if (Coda6[i].Priorità <= Coda6[i6 - 1].Priorità) {
                            Contaif++;
                            ClientiPoste temp;
                            //Scalo posizioni dell'array
                            temp = Coda6[i];
                            Coda6[i] = Coda6[i6 - 1];
                            Coda6[i6 - 1] = temp;

                            //Aggiornamento numero in coda.
                            if (Contaif == 1) {
                                NumCoda = i + 1;
                            }
                        }
                    }
                }
                if (Contaif == 0) {
                    //Stampe nel caso in cui non è stato eseguito alcun ordinamento
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + i6);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                } else {
                    //Stampe nel caso in cui è stato eseguito l'ordinamento
                    System.out.println("La coda e' stata modificata in ordine di priorita' decrescente");
                    System.out.println("ORA E' IN CODA PER ACCEDERE AL SERVIZIO 'CORRISPONDENZA E SPEDIZIONI'");
                    System.out.println("Il suo numero in coda e': " + NumCoda);
                    System.out.println("Il suo numerino e' " + Numerino + " attenda il suo turno!");
                }
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
                            System.out.println(Coda1[i].Nome + " " + Coda1[i].Cognome + "  -Numerino: " + Coda1[i].Numerino + "  -Priorita': " + Coda1[i].Priorità);
                        }
                    }
                } else if (VisualizzaCoda == 2) {

                    //Stampa coda 2.
                    if (i2 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i2; i++) {
                            System.out.println(Coda2[i].Nome + " " + Coda2[i].Cognome + "  -Numerino: " + Coda2[i].Numerino + "  -Priorita': " + Coda2[i].Priorità);
                        }
                    }
                } else if (VisualizzaCoda == 3) {

                    //Stampa coda 3.
                    if (i3 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i3; i++) {
                            System.out.println(Coda3[i].Nome + " " + Coda3[i].Cognome + "  -Numerino: " + Coda3[i].Numerino + "  -Priorita': " + Coda3[i].Priorità);
                        }
                    }
                } else if (VisualizzaCoda == 4) {

                    //Stampa coda 4.
                    if (i4 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i4; i++) {
                            System.out.println(Coda4[i].Nome + " " + Coda4[i].Cognome + "  -Numerino: " + Coda4[i].Numerino + "  -Priorita': " + Coda4[i].Priorità);
                        }
                    }
                } else if (VisualizzaCoda == 5) {

                    //Stampa coda 5.
                    if (i5 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i5; i++) {
                            System.out.println(Coda5[i].Nome + " " + Coda5[i].Cognome + "  -Numerino: " + Coda5[i].Numerino + "  -Priorita': " + Coda5[i].Priorità);
                        }
                    }
                } else if (VisualizzaCoda == 6) {

                    //Stampa coda 6.
                    if (i6 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else {
                        for (i = 0; i < i6; i++) {
                            System.out.println(Coda6[i].Nome + " " + Coda6[i].Cognome + "  -Numerino: " + Coda6[i].Numerino + "  -Priorita': " + Coda6[i].Priorità);
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
                        System.out.println("E' il turno di: " + Coda1[0].Nome + " " + Coda1[0].Cognome + "  -Numerino: " + Coda1[0].Numerino + "  -Priorita': " + Coda1[0].Priorità);
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i1 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda1[i1 - i].Nome + " " + Coda1[i1 - i].Cognome + "  -Numerino: " + Coda1[i1 - i].Numerino + "  -Priorita': " + Coda1[i1 - i].Priorità);
                        for (int i = 0; i < i1 - 1; i++) {
                            Coda1[i] = Coda1[i + 1];
                        }
                        i1--;

                        //Stampa coda aggiornata.
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i1; i++) {
                            System.out.println(Coda1[i].Nome + " " + Coda1[i].Cognome + "  -Numerino: " + Coda1[i].Numerino + "  -Priorita': " + Coda1[i].Priorità);
                        }
                    }
                }
                if (SvuotaCoda == 2) {
                    //Svuotamento coda 2.
                    if (i2 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i2 == 1) {
                        System.out.println("E' il turno di: " + Coda2[0].Nome + " " + Coda2[0].Cognome + "  -Numerino: " + Coda2[0].Numerino + "  -Priorita': " + Coda2[0].Priorità);
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i2 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda2[i2 - i].Nome + " " + Coda2[i2 - i].Cognome + "  -Numerino: " + Coda2[i2 - i].Numerino + "  -Priorita': " + Coda2[i2 - i].Priorità);
                        for (int i = 0; i < i2 - 1; i++) {
                            Coda2[i] = Coda2[i + 1];
                        }
                        i2--;

                        //Stampa coda aggiornata.
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i2; i++) {
                            System.out.println(Coda2[i].Nome + " " + Coda2[i].Cognome + "  -Numerino: " + Coda2[i].Numerino + "  -Priorita': " + Coda2[i].Priorità);
                        }
                    }
                }
                if (SvuotaCoda == 3) {
                    //Svuotamento coda 3.
                    if (i3 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i3 == 1) {
                        System.out.println("E' il turno di: " + Coda3[0].Nome + " " + Coda3[0].Cognome + "  -Numerino: " + Coda3[0].Numerino + "  -Priorita': " + Coda3[0].Priorità);
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i3 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda3[i3 - i].Nome + " " + Coda3[i3 - i].Cognome + "  -Numerino: " + Coda3[i3 - i].Numerino + "  -Priorita': " + Coda3[i3 - i].Priorità);
                        for (int i = 0; i < i3 - 1; i++) {
                            Coda3[i] = Coda3[i + 1];
                        }
                        i3--;

                        //Stampa coda aggiornata.
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i3; i++) {
                            System.out.println(Coda3[i].Nome + " " + Coda3[i].Cognome + "  -Numerino: " + Coda3[i].Numerino + "  -Priorita': " + Coda3[i].Priorità);
                        }
                    }
                }
                if (SvuotaCoda == 4) {
                    //Svuotamento coda 4.
                    if (i4 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i4 == 1) {
                        System.out.println("E' il turno di: " + Coda4[0].Nome + " " + Coda4[0].Cognome + "  -Numerino: " + Coda4[0].Numerino + "  -Priorita': " + Coda4[0].Priorità);
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i4 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda4[i4 - i].Nome + " " + Coda4[i4 - i].Cognome + "  -Numerino: " + Coda4[i4 - i].Numerino + "  -Priorita': " + Coda4[i4 - i].Priorità);
                        for (int i = 0; i < i4 - 1; i++) {
                            Coda4[i] = Coda4[i + 1];
                        }
                        i4--;

                        //Stampa coda aggiornata.
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i4; i++) {
                            System.out.println(Coda4[i].Nome + " " + Coda4[i].Cognome + "  -Numerino: " + Coda4[i].Numerino + "  -Priorita': " + Coda4[i].Priorità);
                        }
                    }
                }
                if (SvuotaCoda == 5) {
                    //Svuotamento coda 5.
                    if (i5 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i5 == 1) {
                        System.out.println("E' il turno di: " + Coda5[0].Nome + " " + Coda5[0].Cognome + "  -Numerino: " + Coda5[0].Numerino + "  -Priorita': " + Coda5[0].Priorità);
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i5 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda5[i5 - i].Nome + " " + Coda5[i5 - i].Cognome + "  -Numerino: " + Coda5[i5 - i].Numerino + "  -Priorita': " + Coda5[i5 - i].Priorità);
                        for (int i = 0; i < i5 - 1; i++) {
                            Coda5[i] = Coda5[i + 1];
                        }
                        i5--;

                        //Stampa coda aggiornata.
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i5; i++) {
                            System.out.println(Coda5[i].Nome + " " + Coda5[i].Cognome + "  -Numerino: " + Coda5[i].Numerino + "  -Priorita': " + Coda5[i].Priorità);
                        }
                    }
                }
                if (SvuotaCoda == 6) {
                    //Svuotamento coda 6.
                    if (i6 == 0) {
                        System.out.println("LA CODA E' VUOTA!");
                    } else if (i6 == 1) {
                        System.out.println("E' il turno di: " + Coda6[0].Nome + " " + Coda6[0].Cognome + "  -Numerino: " + Coda6[0].Numerino + "  -Priorita': " + Coda6[0].Priorità);
                        System.out.println("LA CODA ORA E' VUOTA!");
                        i6 = 0;
                    } else {
                        System.out.println("E' il turno di: " + Coda6[i6 - i].Nome + " " + Coda6[i6 - i].Cognome + "  -Numerino: " + Coda6[i6 - i].Numerino + "  -Priorita': " + Coda6[i6 - i].Priorità);
                        for (int i = 0; i < i6 - 1; i++) {
                            Coda6[i] = Coda6[i + 1];
                        }
                        i6--;

                        //Stampa coda aggiornata.
                        System.out.println("La coda aggiornata e' :");
                        for (i = 0; i < i6; i++) {
                            System.out.println(Coda6[i].Nome + " " + Coda6[i].Cognome + "  -Numerino: " + Coda6[i].Numerino + "  -Priorita': " + Coda6[i].Priorità);
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
        System.out.println("Per aggiungere un'altro utente digitare un numero qualsiasi(NON 0), mentre, per uscire digitare '0'!");
        cicloP = scanner.nextInt();
        scanner.nextLine();
    }
}
