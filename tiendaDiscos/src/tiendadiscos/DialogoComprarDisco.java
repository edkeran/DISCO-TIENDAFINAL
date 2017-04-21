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
import javax.swing.JOptionPane;

/**
 * se pediran los datos necesarios para compra de  un disco
 * @author EDGAR KREICY
 */


public class DialogoComprarDisco extends JDialog implements ActionListener {
    private menuPrincipal menuPrin;
    private String nombre;
    private comboBox art;
    private JButton seleccion;
    private JButton disco;
    NodoArtista artista1;
    private static final String disc= "disco";
    private static final String artista="artista"; 
    
    /**
     * class menuPrincipal
     * @param aux 
     */
    public DialogoComprarDisco(menuPrincipal aux) {
        menuPrin=aux;
        art=new comboBox();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 1));
        for (NodoArtista a:menuPrin.artistas){
            nombre=a.getNombreArtista();
            art.añadirItem(nombre);
        }
        seleccion= new JButton("Presione Para Seleccionar Cantante");
        seleccion.setActionCommand(artista);
        seleccion.addActionListener(this);
        add(seleccion);
        setTitle("Artistas Disponibles");
        setSize(600,600);
        add(art,BorderLayout.NORTH);
        add(seleccion,BorderLayout.NORTH);
        setVisible(true);
    }
   /**
    *añade al combobox
    */
    private void pintarJDialog(){
        String aux;
        art=new comboBox();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 1));
        for (NodoArtista a:menuPrin.artistas){
            if (nombre==a.getNombreArtista()){
                for (NodoDisco g: a.discos){
                       aux=g.getNombreDisco();
                       art.añadirItem(aux);
                }
            }
        }
        disco= new JButton("Presione Para Seleccionar Disco");
        disco.setActionCommand(disc);
        disco.addActionListener(this);
        add(disco);
        setTitle("Artistas Disponibles");
        setSize(600,600);
        add(art,BorderLayout.NORTH);
        add(disco,BorderLayout.NORTH);
        setVisible(true);
        repaint();
    }
    /**
     * acciones
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()){
            case artista:
                nombre=art.getSelectedItem().toString();
                if (nombre=="--------"){
                    JOptionPane.showMessageDialog(this, "OPCION NO VALIDA", "MENSAJE", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    pintarJDialog();
                    seleccion.setEnabled(false);
                }
                break;
            case disc:
                String NombreDisco;
                NombreDisco=art.getSelectedItem().toString();
                if(NombreDisco=="--------"){
                    JOptionPane.showMessageDialog(this, "OPCION NO VALIDA", "MENSAJE", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if (validarCancion(NombreDisco)){
                        for (NodoArtista a:menuPrin.artistas){
                            if (nombre==a.getNombreArtista()){
                                 for (NodoDisco g: a.discos){
                                        if (NombreDisco==g.getNombreDisco()){
                                            JOptionPane.showMessageDialog(this, "EL PRECIO DEL DISCO ES DE:"+g.getPrecio(),"MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                                            DialogoCompra h= new DialogoCompra(g.getPrecio(),menuPrin,g.getAño(),NombreDisco);
                                        }
                                    }
                                }
                            }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "EL DISCO NO TIENE CANCIONES", "MENSAJE", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        }
    }
    /**
     * valida que la lista de canciones exista y no se encuentre vacia
     * String
     * @param NombreDisco
     * @return 
     */
    boolean validarCancion(String NombreDisco){
        int cont=0;
        for (NodoArtista a:menuPrin.artistas){
                            if (nombre==a.getNombreArtista()){
                                 for (NodoDisco g: a.discos){
                                        if (NombreDisco==g.getNombreDisco()){
                                            for (NodoCanciones h:g.getCanciones()){
                                                if (g.getCanciones()!=null){
                                                    cont++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
        if (cont==0){
            return false;
        }
        else{
            return true;
        }
    }
}


