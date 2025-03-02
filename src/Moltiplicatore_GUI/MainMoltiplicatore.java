/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Moltiplicatore_GUI;

/**
 *
 * @author Lombardo Guido
 */
public class MainMoltiplicatore {

    public static void main(String[] args) {
        MoltiplicatoreView View = new MoltiplicatoreView();
        new MoltiplicatoreController(View);
        View.setVisible(true);
    }
    
}
