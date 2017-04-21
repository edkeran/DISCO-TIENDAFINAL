/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;
import Listas.NodoArtista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author EDGAR
 */
public class menuPrincipal extends JFrame {
      private PanelImagen panelImagen;
      private PanelImagen panelImagen2;
      private PanelBotones panelBotones;
      NodoArtista a ;
      List<NodoArtista> artistas = new ArrayList<NodoArtista>();
      private double pago;
      Recibo recibo = new Recibo(this);
    public menuPrincipal() {
        setTitle("DISCO-TIENDA");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        panelImagen = new PanelImagen( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        panelImagen2=new PanelImagen();
        getContentPane().add(panelImagen2, BorderLayout.CENTER);
        panelBotones = new PanelBotones(this);
        getContentPane().add(panelBotones, BorderLayout.WEST);
        setVisible(true);
    }
    public void ponerArtista(String nombre,String genero,String nacionalidad,String imagen){
        a= new NodoArtista();
        a.setGeneros(genero);
        a.setNacionalidad(nacionalidad);
        a.setNombreArtista(nombre);
        a.setDireccionImagen(imagen);
        artistas.add(a);
    }
    public void actualizarImagen(String dir){
        panelImagen2= new PanelImagen(dir);
        repaint();
        
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago += pago;
    }
      
}
