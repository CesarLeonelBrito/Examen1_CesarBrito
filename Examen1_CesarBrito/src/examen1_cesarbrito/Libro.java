/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_cesarbrito;

import java.util.Date;

/**
 *
 * @author cesar
 */
public class Libro {
    
    private String autor;
    private String titulo;
    private String genero;
    private String editorial;
    private String idioma;
    private int year;
    private int isbn;
    private Date fecha;
    private String estado;
    private int codePersona;

    public Libro() {
    }

    public Libro(String autor, String titulo, String genero, String editorial, String idioma, int year, int isbn, Date fecha, String estado, int codePersona) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.year = year;
        this.isbn = isbn;
        this.fecha = fecha;
        this.estado = estado;
        this.codePersona = codePersona;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodePersona() {
        return codePersona;
    }

    public void setCodePersona(int codePersona) {
        this.codePersona = codePersona;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", editorial=" + editorial + ", idioma=" + idioma + ", year=" + year + ", isbn=" + isbn + ", fecha=" + fecha + ", estado=" + estado + ", codePersona=" + codePersona + '}';
    }
    
}
