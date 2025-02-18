/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moltiplicatore_GUI;

/**
 *
 * @author Lombardo Guido
 */
public class MoltiplicatoreModel {

    private double Numero;

    public MoltiplicatoreModel(double Numero) {
        this.Numero = Numero;
    }

    public double getRisultato() {
        return Numero * 2;
    }
}
