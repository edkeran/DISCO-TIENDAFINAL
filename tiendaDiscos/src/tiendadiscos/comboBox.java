/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import javax.swing.JComboBox;

public class comboBox extends JComboBox{
    public comboBox() {
       addItem("--------");
     
    }
    public void añadirItem(String nombre){
        addItem(nombre);
    }
}
