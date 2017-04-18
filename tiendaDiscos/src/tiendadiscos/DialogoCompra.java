/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author EDGAR
 */
public class DialogoCompra extends JDialog implements ActionListener{ 
    double precio;
    private static final String comprar="compro";
    private static final String cancel="cancelo";
    String nombre;
    String año;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;
    JButton boton;
    JButton cancelar;
    menuPrincipal padre;
    public DialogoCompra(double precio, menuPrincipal ayu,String año,String nombre) {
        this.padre=ayu;
        this.nombre=nombre;
        this.año=año;
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 1));
        this.precio = precio;
        String aux= String.valueOf(precio);
        etiqueta1= new JLabel("EL VALOR A LIQUIDAR ES: "+aux);
        add(etiqueta1,BorderLayout.NORTH);
        etiqueta2= new JLabel("EL NOMBRE DEL PRODUCTO ES: "+nombre);
        add(etiqueta2,BorderLayout.NORTH);
        etiqueta3= new JLabel("EL AÑO DEL PRODUCTO ES: "+año);
        add(etiqueta3,BorderLayout.NORTH);
        boton= new JButton("Presione para Comprar");
        add(boton,BorderLayout.NORTH);
        boton.addActionListener(this);
        boton.setActionCommand(comprar);
        cancelar= new JButton("Presione para Cancelar");
        add(cancelar,BorderLayout.NORTH);
        cancelar.addActionListener(this);
        cancelar.setActionCommand(cancel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       switch (ae.getActionCommand()){
           case comprar:
               padre.setPago(precio);
               dispose();
               break;
           case cancel:
               setVisible(false);
               dispose();
               break;
       
       }
    }
    
}
