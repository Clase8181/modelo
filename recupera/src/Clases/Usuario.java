/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jaime
 */
public class Usuario {
    private String nombre;
    private String contraenia;

    public Usuario() {
    }

    public Usuario(String nombre, String contraenia) {
        this.nombre = nombre;
        this.contraenia = contraenia;
    }

    public String getContraenia() {
        return contraenia;
    }

    public void setContraenia(String contraenia) {
        this.contraenia = contraenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
