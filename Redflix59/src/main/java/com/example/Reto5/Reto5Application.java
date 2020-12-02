package com.example.Reto5;

import com.example.Reto5.vistas.SerieVista;
import com.example.Reto5.vistas.UsuarioVista;
import com.example.Reto5.vistas.peliculaVista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto5Application {

	public static void main(String[] args) {
            new UsuarioVista().setVisible(true);
            new peliculaVista().setVisible(true);
            new SerieVista().setVisible(true);
        }
        public static void IniciarSpring(){
		SpringApplication.run(Reto5Application.class);
	}

}
