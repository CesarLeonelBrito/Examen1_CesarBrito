/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_cesarbrito;

import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class Persona {

    private int code;
    private String nombre;
    private String apellido;
    private int edad;
    private boolean admin;
    private ArrayList<Libro> librosPrestados = new ArrayList();

    public Persona() {
    }

    public Persona(int code, String nombre, String apellido, int edad, boolean admin) {
        this.code = code;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.admin = admin;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString() {
        return "Persona{" + "code=" + code + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", admin=" + admin + ", librosPrestados=" + librosPrestados + '}';
    }
    
}
