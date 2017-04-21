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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author EDGAR
 */
public class PanelDialogo extends JDialog{
    private JLabel artista;

    public PanelDialogo(String dir) {
        setSize(400,400);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
        ImageIcon icon = new ImageIcon(dir);        
        artista = new JLabel();
        artista.setIcon(new ImageIcon(icon.getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH)));
        add(artista);
        setBackground(Color.WHITE);
        setVisible(true);
    }
    
}
