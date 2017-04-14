/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import Listas.NodoArtista;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * @author EDGAR
 */
public class DialogoNuevoDisco extends JDialog {
    private menuPrincipal padre;
    private NodoArtista arte;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JTextField caja1;
    private JTextField caja2;
    private JTextField caja3;
    private JButton boton1;
    public DialogoNuevoDisco(menuPrincipal aux, String artista) {
        padre= aux;
        setLayout(new GridLayout(6, 1));
        setSize(400,400);
        caja1=new JTextField(10);
        caja2=new JTextField(10);
        caja3=new JTextField(10);
        add(caja1,BorderLayout.NORTH);
        add(caja2,BorderLayout.NORTH);
        add(caja3,BorderLayout.NORTH);
        setVisible(true);
    }
}
