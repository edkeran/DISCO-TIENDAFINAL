/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import Listas.NodoArtista;
import Listas.NodoCanciones;
import Listas.NodoDisco;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * creacion canciones
 * @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class DialogoNuevaCancion extends JDialog implements ActionListener{
    String disco;
    String artista;
    JTextField caja1;
    JTextField caja2;
    JTextField caja3;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;
    menuPrincipal menu;
    JButton lectura;
    
    /**
     * String
     * class
     * @param disco
     * @param artista
     * @param aux 
     */
    public DialogoNuevaCancion(String disco, String artista,menuPrincipal aux) {
        this.menu=aux;
        this.disco = disco;
        this.artista = artista;
        setSize(600,600);
        setLayout(new GridLayout(7, 1));
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        etiqueta1=new JLabel("INGRESE EL NOMBRE DE LA CANCION");
        add(etiqueta1,BorderLayout.NORTH);
        caja1=new JTextField();
        add(caja1,BorderLayout.NORTH);
        etiqueta2= new JLabel("INGRESE LA DURACION DE LA CANCION");
        add(etiqueta2,BorderLayout.NORTH);
        caja2= new JTextField();
        add(caja2,BorderLayout.NORTH);
        etiqueta3= new JLabel("INGRESE EL PRECIO DE LA CANCION");
        add(etiqueta3,BorderLayout.NORTH);
        caja3= new JTextField();
        add(caja3,BorderLayout.NORTH);
        lectura= new JButton("PRESIONE PARA LEER LA INFORMACION");
        lectura.addActionListener(this);
        add(lectura,BorderLayout.NORTH);
        setVisible(true);
    }
/**
 * acciones
 * @param ae 
 */
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nombreCancion;
        String duracion;
        double precio;
        NodoCanciones aux;
        nombreCancion= caja1.getText();
        duracion=caja2.getText();
        precio=Double.parseDouble(caja3.getText());
        for (NodoArtista a: menu.artistas){
            if (a.getNombreArtista()==artista){
                for (NodoDisco b: a.discos){
                    if (b.getNombreDisco()==disco){
                        b.nuevaCancion(nombreCancion, duracion, precio);
                        break;
                    }
                }
            }
        }
       setVisible(false);
       dispose();
    }
}
