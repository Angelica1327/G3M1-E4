/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author yeimy
 */
@Entity
@Table(name= "peliculas")
public class peliculas {
   @Id
    @Column(name="id_pelicula")
    String id_pelicula; 
   
    @Column
    String titulo;
    
    @Column
    String resumen;
    
    @Column
    String aio;
    
    @Column
    String nombre_director;

    public String getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(String  id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAio() {
        return aio;
    }

    public void setAio(String aio) {
        this.aio = aio;
    }

    public String getNombre_director() {
        return nombre_director;
    }

    public void setNombre_director(String nombre_director) {
        this.nombre_director = nombre_director;
    }
    
}
