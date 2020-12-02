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
 * @author Family
 */

@Entity
@Table(name="series")
public class Series {
    @Id
    @Column(name="id_serie")
    String id_serie;

    @Column
    String Titulo;
    
    @Column
    String num_episodios;
    
    @Column
    String num_temporadas;

    public String getId_serie() {
        return id_serie;
    }

    public void setId_serie(String id_serie) {
        this.id_serie = id_serie;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getNum_episodios() {
        return num_episodios;
    }

    public void setNum_episodios(String num_episodios) {
        this.num_episodios = num_episodios;
    }

    public String getNum_temporadas() {
        return num_temporadas;
    }

    public void setNum_temporadas(String num_temporadas) {
        this.num_temporadas = num_temporadas;
    }

}
        
