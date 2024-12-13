/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */
public class Operazioni {

    private double PiGreco = 3.14;
    private double risultato;

    public void Raggio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegliere quale formula si vuole utilizzare!!");
        System.out.println("Digitare ''Area'' se si conosce il valore dell'area, ''Circonferenza'' se si conosce il valore della lunghezza del circonferenza, ''Perimetro'' se si conosce il valore del perimetro, oppure ''Diametro'' se si conosce il valore del diametro.");
        String Scelta = scanner.nextLine();
        if ("Area".equals(Scelta) || "area".equals(Scelta)) {
            System.out.println("Inserire il valore dell'Area!!");
            double Area = scanner.nextDouble();
            System.out.println("Il raggio del cerchio e' : " + Math.sqrt(Area / PiGreco));
        } else if ("Circonferenza".equals(Scelta) || "circonferenza".equals(Scelta)) {
            System.out.println("Inserire il valore della Circonferenza!!");
            double Circonferenza = scanner.nextDouble();
            risultato = (Circonferenza / (2 * PiGreco));
            System.out.println("Il raggio del cerchio e' :" +risultato);
        } else if ("Diametro".equals(Scelta) || "diametro".equals(Scelta)) {
            System.out.println("Inserire il valore della Diametro!!");
            double Diametro = scanner.nextDouble();
            risultato = (Diametro / 2);
            System.out.println("Il raggio del cerchio e' :" +risultato);
        }  else if ("Perimetro".equals(Scelta) || "perimetro".equals(Scelta)) {
            System.out.println("Inserire il valore del Perimetro!!");
            double Perimetro = scanner.nextDouble();
            risultato = (Perimetro / (2 * PiGreco));
            System.out.println("Il raggio del cerchio e' :" +risultato);
        }
    }
    
    public void DiagonaleCerchio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegliere quale formula si vuole utilizzare!!");
        System.out.println("Digitare ''Area'' se si conosce il valore dell'area, ''Raggio'' se si conosce il valore del raggio oppure ''Perimetro'' se si conosce il valore del perimetro.");
        String Scelta = scanner.nextLine();
        if ("Area".equals(Scelta) || "area".equals(Scelta)) {
            System.out.println("Inserire il valore dell'Area!!");
            double Area = scanner.nextDouble();
            System.out.println("Il diametro del cerchio e' : " + Math.sqrt((4*Area) / (PiGreco)));
        }else if ("Raggio".equals(Scelta) || "raggio".equals(Scelta)){
            System.out.println("Inserire il valore del Raggio!!");
            double Raggio = scanner.nextDouble();
            risultato = Raggio * 2;
            System.out.println("Il diametro del cerchio e' :" +risultato);
        }else if ("Perimetro".equals(Scelta) || "perimetro".equals(Scelta)){
            System.out.println("Inserire il valore del Perimetro!!");
            double Perimetro = scanner.nextDouble();
            risultato = Perimetro / PiGreco;
            System.out.println("Il perimetro del cerchio e' :" +risultato);
        }
    }
    
    public void AreaCerchio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegliere quale formula si vuole utilizzare!!");
        System.out.println("Digitare ''Raggio'' se si conosce il valore del Raggio oppure digitare ''Diametro'' se si conosce il valore del Diametro ");
        String Scelta = scanner.nextLine();
        if ("Raggio".equals(Scelta) || "raggio".equals(Scelta)) {
            System.out.println("Inserire il valore del Raggio!!");
            double Raggio = scanner.nextDouble();
            risultato = PiGreco * (Raggio * Raggio);
            System.out.println("L'Area del cerchio e' : " +risultato);
        }else if ("Diametro".equals(Scelta) || "diametro".equals(Scelta)){
            System.out.println("Inserire il valore del Diametro!!");
            double Diametro = scanner.nextDouble();
            risultato = PiGreco * ((Diametro / 2) * (Diametro / 2));
            System.out.println("L'Area del cerchio e' :" +risultato);
        }
    }
    public void PerimetroCerchio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegliere quale formula si vuole utilizzare!!");
        System.out.println("Digitare ''Raggio'' se si conosce il valore del Raggio oppure digitare ''Diametro'' se si conosce il valore del Diametro ");
        String Scelta = scanner.nextLine();
        if ("Raggio".equals(Scelta) || "raggio".equals(Scelta)) {
            System.out.println("Inserire il valore del Raggio!!");
            double Raggio = scanner.nextDouble();
            risultato = 2 * PiGreco * Raggio;
            System.out.println("Il perimetro del cerchio e' : " +risultato);
        }else if ("Diametro".equals(Scelta) || "diametro".equals(Scelta)){
            System.out.println("Inserire il valore del Diametro!!");
            double Diametro = scanner.nextDouble();
            risultato = PiGreco * Diametro;
            System.out.println("Il perimetro del cerchio e' : " +risultato);
        }
    }
    
    public void LatoQuadrato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegliere quale formula si vuole utilizzare!!");
        System.out.println("Digitare ''Area'' se si conosce il valore del Area, ''Perimetro'' se si conosce il valore del Perimetro OPPURE digitare ''Diagonale'' se si conosce il valore della Diagonale ");
        String Scelta = scanner.nextLine();
        if ("Area".equals(Scelta) || "area".equals(Scelta)) {
            System.out.println("Inserire il valore dell'Area!!");
            double Area = scanner.nextDouble();
            System.out.println("Il Lato del Quadrato e' : "+ Math.sqrt(Area));
        }else if ("Diagonale".equals(Scelta) || "diagonale".equals(Scelta)){
            System.out.println("Inserire il valore della Diagonale!!");
            double Diagonale = scanner.nextDouble();
            risultato = (Diagonale / 1.4142);
            System.out.println("Il Lato del Quadrato e' : " +risultato);
        }else if ("Perimetro".equals(Scelta) || "perimetro".equals(Scelta)){
            System.out.println("Inserire il valore del Perimetro!!");
            double Perimetro = scanner.nextDouble();
            risultato = (Perimetro / 4);
            System.out.println("Il Lato del Quadrato e' : " +risultato);
        }
    }
    public void DiagonaleQuadrato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegliere quale formula si vuole utilizzare!!");
        System.out.println("Digitare ''Area'' se si conosce il valore del Area OPPURE digitare ''Lato'' se si conosce il valore della Lato ");
        String Scelta = scanner.nextLine();
        if ("Area".equals(Scelta) || "area".equals(Scelta)) {
            System.out.println("Inserire il valore dell'Area!!");
            double Area = scanner.nextDouble();
            System.out.println("La Diagonale del Quadrato e' : "+ Math.sqrt(2 * Area));
        }else if ("Lato".equals(Scelta) || "lato".equals(Scelta)){
            System.out.println("Inserire il valore del Lato!!");
            double Lato = scanner.nextDouble();
            risultato = (Lato * 1.4142);
            System.out.println("La Diagonale del Quadrato e' : " +risultato);
        }
    }
    public void AreaQuadrato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegliere quale formula si vuole utilizzare!!");
        System.out.println("Digitare ''Diagonale'' se si conosce il valore del Area OPPURE digitare ''Lato'' se si conosce il valore della Lato ");
        String Scelta = scanner.nextLine();
        if ("Diagonale".equals(Scelta) || "diagonale".equals(Scelta)) {
            System.out.println("Inserire il valore della Diagonale!!");
            double Diagonale = scanner.nextDouble();
            risultato = ((Diagonale * Diagonale) / 2);
            System.out.println("L'Area del Quadrato e' : " +risultato);
        }else if ("Lato".equals(Scelta) || "lato".equals(Scelta)){
            System.out.println("Inserire il valore del Lato!!");
            double Lato = scanner.nextDouble();
            risultato = (Lato * Lato);
            System.out.println("L'Area del Quadrato e' : " +risultato);
        }
    }
    public void PerimetroQuadrato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire il valore del Lato!!");
        double Lato = scanner.nextDouble();
        risultato = (Lato * 4);
        System.out.println("Il Perimetro Quadrato e' : " +risultato);
    }
    
    public void LatoTriangoloE() {
        
    }
    
    public void AltezzaTriangoloE() {
        
    }
    
    public void AreaTriangoloE() {
        
    }
    
    public void PerimetroTriangoloE() {
        
    }
    
}
