/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moltiplicatore_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lombardo Guido
 */
public class MoltiplicatoreController {

    private MoltiplicatoreView View;

    public MoltiplicatoreController(MoltiplicatoreView View) {
        this.View = View;
        this.View.addMoltiplicaListener(new MoltiplicaListener());
    }

    class MoltiplicaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double Risultato = Double.parseDouble(View.getRisultato());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(View, "Inserisci numeri validi!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }
   }
}