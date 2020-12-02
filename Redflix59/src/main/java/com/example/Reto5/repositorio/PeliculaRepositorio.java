/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Reto5.repositorio;
import com.example.Reto5.modelos.Usuarios;
import com.example.Reto5.modelos.peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Family
 */
public interface PeliculaRepositorio extends JpaRepository<peliculas, String>{  
}