/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

/**
 * manejara los discos de cada cantante a crear
 * @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class NodoDisco {
    private double precio;
    private String nombreDisco;
    private String año;
    NodoCanciones cancion;
    private NodoCanciones aux;
    List <NodoCanciones> canciones = new ArrayList<NodoCanciones>();
    
    /**
     * recibe Strings
     * recible double
     * @param nombreC
     * @param duracion
     * @param prec 
     */
    public void nuevaCancion(String nombreC,String duracion,double prec){
        aux= new NodoCanciones();
        aux.setNombreCancion(nombreC);
        aux.setPrecio(prec);
        aux.setDuracion(duracion);
        canciones.add(aux);
    }
    /**
     * busca la cancion creada en  la litstas
     */
    public void buscarCanciones(){
        for (NodoCanciones ayu: canciones){
            System.out.println(ayu.getNombreCancion());
        }
    }
    
    /**
     * 
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * recible double
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
/**
 * 
 * @return nombreDisco
 */
    public String getNombreDisco() {
        return nombreDisco;
    }
/**
 * String
 * @param nombreDisco 
 */
    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }
/**
 * 
 * @return año
 */
    public String getAño() {
        return año;
    }
/**
 * String
 * @param año 
 */
    public void setAño(String año) {
        this.año = año;
    }
/**
 * 
 * @return canciones
 */
    public List<NodoCanciones> getCanciones() {
        return canciones;
    }

    /**
     * List
     * @param canciones 
     */
    public void setCanciones(List<NodoCanciones> canciones) {
        this.canciones = canciones;
    }
    
    
}
