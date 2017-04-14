/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * @author EDGAR
 */
public class DialogoArtista extends JDialog implements ActionListener {
    private JTextField caja1;
    private JTextField caja2;
    private JTextField caja3;
    private JTextField caja4;
    private JButton lectura;
    private JLabel etiquetacaja1;
    private JLabel etiquetacaja2;
    private JLabel etiquetacaja3;
    private JLabel etiquetacaja4;
    private JLabel k;
    private menuPrincipal menuP;
    PanelDialogo a; 
    public DialogoArtista(menuPrincipal aux) {
        menuP=aux;
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("INGRESAR DATOS DEL ARTISTA");
        setSize(600,600);
        setLocationRelativeTo(null);
        generarDialogo(); 
        
    }
    private void generarDialogo(){
        ImageIcon a= new ImageIcon("imagenes/Notas1.PNG");
        k= new JLabel();
        k.setIcon(a);
        setLayout(new GridLayout(18,0));
        caja1 = new JTextField();
        caja2 = new JTextField();
        caja3 = new JTextField();
        caja4 = new JTextField();
        etiquetacaja1= new JLabel("INGRESE EL NOMBRE DEL ARTISTA");
        etiquetacaja2= new JLabel("INGRESE EL GENERO CON EL QUE SE IDENTIFICA EL ARTISTA");
        etiquetacaja3= new JLabel("INGRESE LA NACIONALIDAD DEL ARTISTA");
        etiquetacaja4= new JLabel("INGRESE LA DIRECCION DE LA IMAGEN");
        lectura= new JButton("LEER INFORMACION");
        lectura.addActionListener(this);
        add(k,BorderLayout.NORTH);
        add(etiquetacaja1,BorderLayout.NORTH);
        add(caja1,BorderLayout.NORTH);
        add(etiquetacaja2,BorderLayout.NORTH);
        add(caja2,BorderLayout.NORTH);
        add(etiquetacaja3,BorderLayout.NORTH);
        add(caja3,BorderLayout.NORTH);
        add(etiquetacaja4,BorderLayout.NORTH);
        add(caja4,BorderLayout.NORTH);
        add(lectura,BorderLayout.NORTH);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       String nombre;
       String imagen;
       String genero;
       String nacionalidad;
       nombre=caja1.getText();
       genero=caja2.getText();
       nacionalidad=caja3.getText();
       imagen=caja4.getText();
       menuP.ponerArtista(nombre, genero, nacionalidad, imagen);
       setVisible(false);
       imagenArtista(imagen);
       dispose();
    }
    private void imagenArtista(String imagen){
        a= new PanelDialogo(imagen);
    }
}
