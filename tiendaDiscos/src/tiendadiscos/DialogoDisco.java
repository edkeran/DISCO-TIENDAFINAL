/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import Listas.NodoArtista;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * @author EDGAR
 */
public class DialogoDisco extends JDialog implements ActionListener{
    private menuPrincipal menuPrin;
    private String nombre;
    private comboBox art;
    private JButton seleccion;
    NodoArtista artista1;
    public DialogoDisco(menuPrincipal aux) {
        menuPrin=aux;
        art=new comboBox();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        for (NodoArtista a:menuPrin.artistas){
            nombre=a.getNombreArtista();
            art.añadirItem(nombre);
        }
        seleccion= new JButton("Presione Para Seleccionar Cantante");
        seleccion.addActionListener(this);
        add(seleccion);
        setTitle("Artistas Disponibles");
        setSize(400,200);
        add(art,BorderLayout.NORTH);
        add(seleccion,BorderLayout.NORTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        nombre=art.getSelectedItem().toString();
        if (nombre=="--------"){
            JOptionPane.showMessageDialog(this, "OPCION NO VALIDA", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
        else{
             DialogoNuevoDisco a = new DialogoNuevoDisco(menuPrin,nombre);
             setVisible(false);
             dispose();
        }
    }
    
}
