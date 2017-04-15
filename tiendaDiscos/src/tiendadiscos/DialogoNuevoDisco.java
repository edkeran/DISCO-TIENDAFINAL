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
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * @author EDGAR
 */
public class DialogoNuevoDisco extends JDialog implements ActionListener{
    private menuPrincipal padre;
    private JLabel nombreArt;
    private JLabel genero;
    private JLabel nacionalidad;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JTextField caja1;
    private JTextField caja2;
    private JTextField caja3;
    private JButton boton1;
    private String gen;
    private String nacion;
    private String nombArt;
    
    public DialogoNuevoDisco(menuPrincipal aux, String artista) {
        padre= aux;
        nombArt=artista;
        setLayout(new GridLayout(10, 1));
        setSize(400,400);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caja1=new JTextField(10);
        caja2=new JTextField(10);
        caja3=new JTextField(10);
        nombreArt= new JLabel("----------"+artista);
        generarEtiquetaArtista(artista);
        genero= new JLabel("-----------"+gen);
        nacionalidad= new JLabel("----------"+nacion);
        boton1= new JButton("Oprima Para Ingresar Los datos");
        boton1.addActionListener(this);
        etiqueta1= new JLabel("Ingrese el nombre del disco");
        etiqueta2= new JLabel("Ingrese el año del disco");
        etiqueta3= new JLabel("Ingrese el precio del disco(Solo numeros)");
        add(nombreArt,BorderLayout.NORTH);
        add(genero,BorderLayout.NORTH);
        add(nacionalidad,BorderLayout.NORTH);
        add(etiqueta1,BorderLayout.NORTH);
        add(caja1,BorderLayout.NORTH);
        add(etiqueta2,BorderLayout.NORTH);
        add(caja2,BorderLayout.NORTH);
        add(etiqueta3,BorderLayout.NORTH);
        add(caja3,BorderLayout.NORTH);
        add(boton1,BorderLayout.NORTH);
        setVisible(true);
    }
    private void generarEtiquetaArtista(String artista){
        for (NodoArtista ar:padre.artistas){
            if (ar.getNombreArtista()==artista){
                gen=ar.getGeneros();
                nacion=ar.getNacionalidad();
            }
        }
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       String nombreDisco;
       String año;
       String aux;
       double precio;
       nombreDisco= caja1.getText();
       año= caja2.getText();
       aux= caja3.getText();
       precio= Double.parseDouble(aux);
       for (NodoArtista ar:padre.artistas){
            if (ar.getNombreArtista()==nombArt){
                ar.nuevoDisco(nombreDisco,año,precio);
            }
        }
       for (NodoArtista ar:padre.artistas){
            if (ar.getNombreArtista()==nombArt){
               ar.buscarDiscos();
            }
        }
       setVisible(false);
       dispose();
    }
}
