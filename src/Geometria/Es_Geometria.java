/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Geometria;

import Geometria.Operazioni;
import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */

/*
   DA TERMINARE E COMMENTARE
*/
public class Es_Geometria {

    private String OperazioniCerchio;
    private String OperazioniQuadrato;
    private String OperazioniTriangolo;
    private String forma;
    private int Ripetizione;

    public void Cerchio() {
        Scanner scanner = new Scanner(System.in);
        Operazioni ogg = new Operazioni();
        do {
            System.out.println("Inserire una operazione da svolgere OPPURE ''Stop'' per terminare ");
            System.out.println("Le operazioni disponibili sono: Calcolo del Raggio, Calcolo della Diagonale, Calcolo dell'Area, Calcolo del Perimetro.");
            String OperazioniCerchio = scanner.nextLine();
            if ("Calcolo del Raggio".equals(OperazioniCerchio) || "Calcolo del raggio".equals(OperazioniCerchio) || "calcolo del raggio".equals(OperazioniCerchio) || "Calcolo Del Raggio".equals(OperazioniCerchio) || "Raggio".equals(OperazioniCerchio) || "raggio".equals(OperazioniCerchio)) {
                ogg.Raggio();
            }else if ("Calcolo della diagonale".equals(OperazioniCerchio) || "Calcolo della Diagonale".equals(OperazioniCerchio) || "calcolo della diagonale".equals(OperazioniCerchio) || "Calcolo Della Diagonale".equals(OperazioniCerchio) || "Diagonale".equals(OperazioniCerchio) || "diagonale".equals(OperazioniCerchio)) {
                ogg.DiagonaleCerchio();
            }else if ("Calcolo dell'Area".equals(OperazioniCerchio) || "Calcolo dell'area".equals(OperazioniCerchio) || "calcolo dell'area".equals(OperazioniCerchio) || "Calcolo Dell'Area".equals(OperazioniCerchio) || "Area".equals(OperazioniCerchio) || "area".equals(OperazioniCerchio)) {
                ogg.AreaCerchio();
            }else if ("Calcolo del perimetro".equals(OperazioniCerchio) || "Calcolo del Perimetro".equals(OperazioniCerchio) || "calcolo del perimetro".equals(OperazioniCerchio) || "Calcolo Del Perimetro".equals(OperazioniCerchio) || "Perimetro".equals(OperazioniCerchio) || "perimetro".equals(OperazioniCerchio)) {
                ogg.PerimetroCerchio();
            }
        } while ("Stop".equals(OperazioniCerchio) || "stop".equals(OperazioniCerchio) || "STOP".equals(OperazioniCerchio));
    }

    public void Quadrato() {
        Scanner scanner = new Scanner(System.in);
        Operazioni ogg = new Operazioni();
        do {
            System.out.println("Inserire una operazione da svolgere OPPURE ''Stop'' per terminare ");
            System.out.println("Le operazioni disponibili sono: Calcolo del Lato, Calcolo della Diagonale, Calcolo dell'Area, Calcolo del Perimetro.");
            String OperazioniQuadrato = scanner.nextLine();
            if ("Calcolo del Lato".equals(OperazioniQuadrato) || "Calcolo del lato".equals(OperazioniQuadrato) || "calcolo del lato".equals(OperazioniQuadrato) || "Calcolo Del Lato".equals(OperazioniQuadrato) || "Lato".equals(OperazioniQuadrato) || "lato".equals(OperazioniQuadrato) || "LATO".equals(OperazioniQuadrato) || "CALCOLO DEL LATO".equals(OperazioniQuadrato)) {
                ogg.LatoQuadrato();
            }else if ("Calcolo della diagonale".equals(OperazioniQuadrato) || "Calcolo della Diagonale".equals(OperazioniQuadrato) || "calcolo della diagonale".equals(OperazioniQuadrato) || "Calcolo Della Diagonale".equals(OperazioniQuadrato) || "Diagonale".equals(OperazioniQuadrato) || "diagonale".equals(OperazioniQuadrato) || "DIAGONALE".equals(OperazioniQuadrato) || "CALCOLO DELLA DIAGONALE".equals(OperazioniQuadrato)) {
                ogg.DiagonaleQuadrato();
            }else if ("Calcolo dell'Area".equals(OperazioniQuadrato) || "Calcolo dell'area".equals(OperazioniQuadrato) || "calcolo dell'area".equals(OperazioniQuadrato) || "Calcolo Dell'Area".equals(OperazioniQuadrato) || "Area".equals(OperazioniQuadrato) || "area".equals(OperazioniQuadrato)|| "calcolo dell area".equals(OperazioniQuadrato) || "AREA".equals(OperazioniQuadrato) || "CALCOLO DELL'AREA".equals(OperazioniQuadrato)) {
                ogg.AreaQuadrato();
            }else if ("Calcolo del perimetro".equals(OperazioniQuadrato) || "Calcolo del Perimetro".equals(OperazioniQuadrato) || "calcolo del perimetro".equals(OperazioniQuadrato) || "Calcolo Del Perimetro".equals(OperazioniQuadrato) || "Perimetro".equals(OperazioniQuadrato) || "perimetro".equals(OperazioniQuadrato) || "PERIMETRO".equals(OperazioniQuadrato) || "CALCOLO DEL PERIMETRO".equals(OperazioniQuadrato)) {
                ogg.PerimetroQuadrato();
            }
        } while ("Stop".equals(OperazioniQuadrato) || "stop".equals(OperazioniQuadrato) || "STOP".equals(OperazioniQuadrato));
    }

    public void Triangolo() {
        Scanner scanner = new Scanner(System.in);
        Operazioni ogg = new Operazioni();
        do {
            System.out.println("Digitare ''Equilatero'' se si sta operando su un Triangolo Equilatero, ''Isoscele'' se si sta operando su un Triangolo Isoscele OPPURE ''Scaleno'' se si sta operando su un Triangolo Scaleno");
            String Tipo = scanner.nextLine();
            System.out.println("Inserire una operazione da svolgere OPPURE ''Stop'' per terminare ");
            if ("Equilatero".equals(Tipo) || "equilatero".equals(Tipo) || "Triangolo Equilatero".equals(Tipo) || "triangolo equilatero".equals(Tipo) || "Triangolo equilatero".equals(Tipo) || "triangolo Equilatero".equals(Tipo)){
            System.out.println("Le operazioni disponibili sono: Calcolo del Perimetro, Calcolo del Lato, Calcolo dell'Area, Calcolo dell'Altezza");
            String OperazioniTriangolo = scanner.nextLine();
            if ("Calcolo del Lato".equals(OperazioniTriangolo) || "Calcolo del lato".equals(OperazioniTriangolo) || "calcolo del lato".equals(OperazioniTriangolo) || "Calcolo Del Lato".equals(OperazioniTriangolo) || "Lato".equals(OperazioniTriangolo) || "lato".equals(OperazioniTriangolo) || "LATO".equals(OperazioniTriangolo) || "CALCOLO DEL LATO".equals(OperazioniTriangolo)) {
                ogg.LatoTriangoloE();
            }else if ("Calcolo dell'altezza".equals(OperazioniTriangolo) || "Calcolo dell'Altezza".equals(OperazioniTriangolo) || "calcolo dell'altezza".equals(OperazioniTriangolo) || "Calcolo Dell'Altezza".equals(OperazioniTriangolo) || "Altezza".equals(OperazioniTriangolo) || "altezza".equals(OperazioniTriangolo) || "ALTEZZA".equals(OperazioniTriangolo) || "CALCOLO DELL'ALTEZZA".equals(OperazioniTriangolo) || "calcolo dell altezza".equals(OperazioniTriangolo) || "Calcolo dell altezza".equals(OperazioniTriangolo)) {
                ogg.AltezzaTriangoloE();
            }else if ("Calcolo dell'Area".equals(OperazioniTriangolo) || "Calcolo dell'area".equals(OperazioniTriangolo) || "calcolo dell'area".equals(OperazioniTriangolo) || "Calcolo Dell'Area".equals(OperazioniTriangolo) || "Area".equals(OperazioniTriangolo) || "area".equals(OperazioniTriangolo)|| "calcolo dell area".equals(OperazioniTriangolo) || "AREA".equals(OperazioniTriangolo) || "CALCOLO DELL'AREA".equals(OperazioniTriangolo)) {
                ogg.AreaTriangoloE();
            }else if ("Calcolo del perimetro".equals(OperazioniTriangolo) || "Calcolo del Perimetro".equals(OperazioniTriangolo) || "calcolo del perimetro".equals(OperazioniTriangolo) || "Calcolo Del Perimetro".equals(OperazioniTriangolo) || "Perimetro".equals(OperazioniTriangolo) || "perimetro".equals(OperazioniTriangolo) || "PERIMETRO".equals(OperazioniTriangolo) || "CALCOLO DEL PERIMETRO".equals(OperazioniTriangolo)) {
                ogg.PerimetroTriangoloE();
            }
            } else if ("Isoscele".equals(Tipo) || "isoscele".equals(Tipo) || "Triangolo Isoscele".equals(Tipo) || "triangolo isoscele".equals(Tipo) || "Triangolo isoscele".equals(Tipo) || "triangolo Isoscele".equals(Tipo)){
                System.out.println("Le operazioni disponibili sono: ");
                String OperazioniTriangolo = scanner.nextLine();
            } else if ("Scaleno".equals(Tipo) || "scaleno".equals(Tipo) || "Triangolo Scaleno".equals(Tipo) || "triangolo scaleno".equals(Tipo) || "Triangolo scaleno".equals(Tipo) || "triangolo Scaleno".equals(Tipo)){
                System.out.println("Le operazioni disponibili sono: ");
                String OperazioniTriangolo = scanner.nextLine();
            }
            
        } while ("Stop".equals(OperazioniTriangolo) || "stop".equals(OperazioniTriangolo) || "STOP".equals(OperazioniTriangolo));
    }

    public void Richiesta() {
        Es_Geometria ogg = new Es_Geometria();
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Inserire su quale forma geometrica si desidera operare tra Cerchio, Quadrato o Triangolo, OPPURE ''Stop'' per terminare!");
        String forma = scanner.nextLine();
        if ("Cerchio".equals(forma) || "cerchio".equals(forma)) {
            ogg.Cerchio();
        } else if ("Quadrato".equals(forma) || "quadrato".equals(forma)) {
            ogg.Quadrato();
        } else if ("Triangolo".equals(forma) || "triangolo".equals(forma)) {
            ogg.Triangolo();
        }
        }while("Stop".equals(forma) || "stop".equals(forma) || "STOP".equals(forma));
        
    }

    public static void main(String[] args) {
        Es_Geometria ogg1 = new Es_Geometria();
        do{
        ogg1.Richiesta();
        }while("Stop".equals(ogg1.OperazioniCerchio) || "stop".equals(ogg1.OperazioniCerchio) || "STOP".equals(ogg1.OperazioniCerchio) || "Stop".equals(ogg1.OperazioniQuadrato) || "stop".equals(ogg1.OperazioniQuadrato) || "STOP".equals(ogg1.OperazioniQuadrato) || "Stop".equals(ogg1.OperazioniTriangolo) || "stop".equals(ogg1.OperazioniTriangolo) || "STOP".equals(ogg1.OperazioniTriangolo) || "Stop".equals(ogg1.forma) || "stop".equals(ogg1.forma) || "STOP".equals(ogg1.forma));
        System.out.println("Grazie per aver utilizzato il nostro calcolatore!!");
        System.out.println("Premere i tasti ''Shift + F6'' per ricominciare!!");
    }
    
}






