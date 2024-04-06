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
public class Enemigo extends Personaje {

    private int tipo;
    
    public Enemigo() {
    }
    
    public Enemigo(int nivel, int vidas, int tipo) {
        super(nivel, vidas);
        this.tipo = tipo;
    }
    
    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
