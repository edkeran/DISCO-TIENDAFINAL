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
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("INGRESAR DATOS DEL ARTISTA");
        setSize(400,400);
        setLocationRelativeTo(null);
        generarDialogo(); 
        setVisible(true);
    }
    private void generarDialogo(){
        //setLayout(new GridLayout(18,0));
        getContentPane().setLayout(null);
        caja1 = new JTextField();
        caja2 = new JTextField();
        caja3 = new JTextField();
        caja4 = new JTextField();
        etiquetacaja1= new JLabel("INGRESE EL NOMBRE DEL ARTISTA");
        etiquetacaja1.setForeground(Color.BLUE);
        etiquetacaja2= new JLabel("INGRESE EL GENERO CON EL QUE SE IDENTIFICA EL ARTISTA");
        etiquetacaja2.setForeground(Color.BLUE);
        etiquetacaja3= new JLabel("INGRESE LA NACIONALIDAD DEL ARTISTA");
        etiquetacaja3.setForeground(Color.BLUE);
        etiquetacaja4= new JLabel("INGRESE LA DIRECCION DE LA IMAGEN");
        etiquetacaja4.setForeground(Color.BLUE);
        lectura= new JButton("LEER INFORMACION");
        lectura.addActionListener(this);
        getContentPane().add(etiquetacaja1,BorderLayout.NORTH);
        etiquetacaja1.setBounds(0, 0, 200, 17);
        getContentPane().add(caja1,BorderLayout.NORTH);
        caja1.setBounds(0, 26, 400, 23);
        getContentPane().add(etiquetacaja2,BorderLayout.NORTH);
        etiquetacaja2.setBounds(0,55,400,17);
        getContentPane().add(caja2,BorderLayout.NORTH);
        caja2.setBounds(0,72,400,23);
        getContentPane().add(etiquetacaja3,BorderLayout.NORTH);
        etiquetacaja3.setBounds(0,115, 400, 23);
        getContentPane().add(caja3,BorderLayout.NORTH);
        caja3.setBounds(0,148,400, 23);
        getContentPane().add(etiquetacaja4,BorderLayout.NORTH);
        etiquetacaja4.setBounds(0,181, 400, 23);
        getContentPane().add(caja4,BorderLayout.NORTH);
        caja4.setBounds(0, 214, 400, 23);
        getContentPane().add(lectura,BorderLayout.NORTH);
        lectura.setBounds(100, 247, 200, 23);
        ImageIcon a= new ImageIcon("imagenes/notas-musicales.PNG");
        k= new JLabel();
        k.setIcon(new ImageIcon(a.getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH)));
        getContentPane().add(k);
        k.setBounds(0, 0, 400,400);
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
