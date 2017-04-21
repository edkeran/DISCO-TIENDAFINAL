/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * imagen principal del programa
 * @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class PanelImagen extends JPanel {
    private JLabel imagen;
    
    /**
     * caracteristica de la imagen como ubicacion color de fondo y creacion del recuadro JLabel
     */
    public PanelImagen() {        
        setBackground(Color.GRAY);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        ImageIcon icon = new ImageIcon("imagenes/Notas1.PNG");        
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(125,125,Image.SCALE_SMOOTH)));
        add(imagen);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.GRAY));
    }
    /**
     * String
     * @param dir 
     */
    public PanelImagen(String dir){
        setBackground(Color.GRAY);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        ImageIcon icon = new ImageIcon(dir);        
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(125,125,Image.SCALE_SMOOTH)));
        add(imagen);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.GRAY));
        repaint();
    }
    
}
