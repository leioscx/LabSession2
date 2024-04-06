/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.entidades;

import javaapplication1.abstracciones.Personaje;

/**
 *
 * @author Estudiante
 */
public class Nave extends Personaje {
    
    private int puntaje;
    
    public Nave() { }

    public Nave(int nivel, int vidas, int puntaje) {
        super(nivel, vidas);
        this.puntaje = puntaje;
    }
    
    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
