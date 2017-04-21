/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 * clase que manejara los datos de las canciones de cada disco de cada cantante
 * get y set para obtener la informacion de cada disco y setear la informacion
 * @author EDGAR KREICY
 * @author MICHAEL CARDENAS
 */
public class NodoCanciones {
      private String nombreCancion;
      private String duracion;
      private double precio;
/**
 * constructor vacio
 * 
 */
      public NodoCanciones() {
        }
/**
 * 
 * @return nombreCancion
 */
    public String getNombreCancion() {
        return nombreCancion;
    }
/**
 * recibe String
 * @param nombreCancion 
 */
    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    /**
     * 
     * @return duracion
     */
    public String getDuracion() {
        return duracion;
    }
/**
 * String
 * @param duracion 
 */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
/**
 * 
 * @return precio
 */
    public double getPrecio() {
        return precio;
    }
/**
 * recibe double
 * @param precio 
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
      
}
