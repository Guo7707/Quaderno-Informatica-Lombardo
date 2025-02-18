/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moltiplicatore_GUI;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author Lombardo Guido
 */
public class MoltiplicatoreView extends JFrame {

    private JTextField txtNumero, txtRisultato;
    private JLabel lblNumero, lblRisultato, lblMoltiplica;
    private JButton btnMoltiplica;

    public MoltiplicatoreView() {
        setTitle("Moltiplicatore x2");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        //Aggiunta componenti
        add(new JLabel("Inserire un numero:"));
        txtNumero = new JTextField();
        add(txtNumero);

        add(new JLabel("Premi qui per moltiplicare -> -> -> -> ->"));

        add(new JLabel("Il risultato è:"));
        txtRisultato = new JTextField();
        add(txtRisultato);

        btnMoltiplica = new JButton("Moltiplica");
        add(btnMoltiplica);

        lblNumero = new JLabel("Inserire un numero: ");
        add(lblNumero);

        lblMoltiplica = new JLabel("Premi qui per moltiplicare -> -> -> -> ->");
        add(lblMoltiplica);

        lblRisultato = new JLabel("Il risultato è: ");
        add(lblRisultato);
    }
    
    public String getRisultato(){
        return txtRisultato.getText();
    }
    
     public void setRisultati(double Risultato){
         lblRisultato.setText("Area: " + Risultato);
     }
     
      public void addMoltiplicaListener(ActionListener listener) {
        btnMoltiplica.addActionListener(listener);
    }
}
