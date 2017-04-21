/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * aqui se crea un archivo tipo File y se crea el objeto JFilChoose 
 * tambien se definiran los filtros para saber que tipo de archivo recibira la imagen
 * @author @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class DialogoBusqueda extends JDialog{
    private JFileChooser archivo;
    private File direccion;
    int res;
    private String lectura;
    private DialogoArtista aux;
    public DialogoBusqueda(DialogoArtista ayu) {
          this.aux=ayu;
          setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
          archivo= new JFileChooser();
          FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
          archivo.setFileFilter(filtro);
          add(archivo,BorderLayout.CENTER);
          res=archivo.showOpenDialog(null);
          direccion=archivo.getSelectedFile();
          if (direccion!=null){
                  lectura=direccion.toString();
                  aux.setImagen(lectura);
                  System.out.println(lectura);
                  dispose();
               
          }
          else{
          dispose();
          }
          //setVisible(true);
    }
    
    
}
