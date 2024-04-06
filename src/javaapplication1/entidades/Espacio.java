/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.entidades;

import javaapplication1.abstracciones.Elemento;

/**
 *
 * @author Estudiante
 */
public class Espacio extends Elemento {

    private int tiempo;
    private int ambiente;

    public Espacio() { }
    
    public Espacio(int nivel, int tiempo, int ambiente) {
        super(nivel);
        this.tiempo = tiempo;
        this.ambiente = ambiente;
    }
      
    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the ambiente
     */
    public int getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
    }
}
