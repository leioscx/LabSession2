/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.abstracciones;

/**
 *
 * @author Estudiante
 */
public class Personaje extends Elemento {
    private int vidas;
    public Personaje() { }
    public Personaje(int nivel, int vidas){
        super(nivel);
        this.vidas = vidas;
    }
    public int getVidas(){
        return vidas;
    }
    public void setVidas(int vidas){
        this.vidas = vidas;
    }
}
