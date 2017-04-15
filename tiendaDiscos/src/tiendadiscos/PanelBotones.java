/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author EDGAR
 */
public class PanelBotones extends JPanel implements ActionListener{
     
        private menuPrincipal menu;
  
        private JButton btnComprarDisco;
    
        private JButton btnNuevoArtista;
        
        private JButton btnNuevaCancion;
    
        private JButton btnComprarCancion;
        
        private JButton btnNuevoDisco;
        
        private static final String NUEVO = "ARTISTA";
    
        private static final String DISCO = "DISCOS";
        
        private static final String NUEVACANCION="Cancion Nueva";

        private static final String CANCION = "CANCIONES";
        
        private static final String NDisco="DISCON";

    public PanelBotones(menuPrincipal aux) {
        
        menu=aux;
        
        setLayout(new GridLayout(6, 1));
        setBackground(Color.WHITE);
        
        btnNuevoArtista = new JButton("AÑADIR ARTISTA");
        btnNuevoArtista.setActionCommand(NUEVO);
        btnNuevoArtista.addActionListener(this);
        add(btnNuevoArtista);
        
        btnComprarDisco = new JButton("NUEVO DISCO");
        btnComprarDisco.setActionCommand(DISCO);
        btnComprarDisco.addActionListener(this);
        add(btnComprarDisco);
        
        btnNuevaCancion= new JButton("AÑADIR CANCION");
        btnNuevaCancion.setActionCommand(NUEVACANCION);
        btnNuevaCancion.addActionListener(this);
        add(btnNuevaCancion);
        
        btnComprarCancion = new JButton("COMPRAR DISCO");
        btnComprarCancion.setActionCommand(CANCION);
        btnComprarCancion.addActionListener(this);
        add(btnComprarCancion);
        
        btnNuevoDisco = new JButton("COMPRAR CANCION");
        btnNuevoDisco.setActionCommand(NDisco);
        btnNuevoDisco.addActionListener(this);
        add(btnNuevoDisco);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         switch (ae.getActionCommand()) {
            case NUEVO:
                System.out.print("Imprimio boton nuevo artista");
                DialogoArtista a =new DialogoArtista(menu);
                break;
            case DISCO:
                System.out.print("Imprimio boton nuevo disco");
                DialogoDisco b= new DialogoDisco(menu);
                break;        
            case CANCION:
                System.out.print("Imprimio boton comprar disco");
                break;
            case NDisco:
                System.out.print("Imprimio boton comprar cancion");
                break;
            case NUEVACANCION:
                System.out.printf("Imprimio nueva cancion");
        }
    }

}
