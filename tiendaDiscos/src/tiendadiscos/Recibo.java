/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * genera el recibo  de compra
 * @author EDGAR KREICY
 */
public class Recibo extends JDialog {
    JTable tabla;
    DefaultTableModel dtm;
    Object[] data;
    menuPrincipal menu;
    
    /**
     * class
     * @param aux 
     */
    public Recibo(menuPrincipal aux) {
        setSize(600,600);
        menu=aux;
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(null);
        dtm= new DefaultTableModel();
        tabla = new JTable(dtm);
        dtm.addColumn("Precio Item");
        dtm.addColumn("Subtotal");
        dtm.addColumn("TOTAL");
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(15, 30, 370, 400);
        add(scrollPane);
        
    }
    /**
     * muestra los datos finales en cada columna
     * @param Precio 
     */
    public void actualizarRecibo(double Precio){
        data = new Object[4];        
        data[0] = Precio;
        data[1] = menu.getPago();
        data[2]="";
        dtm.addRow(data);     
    }
    /**
     * imprime la informacion total
     */
    public void visualizar(){
        data = new Object[4];
        data[0]="";
        data[1]="";
        data[2]=menu.getPago();
        dtm.addRow(data);
        setVisible(true);
    }
}

