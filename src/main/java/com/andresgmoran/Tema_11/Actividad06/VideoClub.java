package com.andresgmoran.Tema_11.Actividad06;

import com.andresgmoran.Lib.Calculos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoClub {
    private List<Multimedia> multimediaList;
    private List<Socio> socios;
    public VideoClub() {
        this.multimediaList = new ArrayList<>();
        this.socios = new ArrayList<>();
    }
    public Multimedia addPelicula(String titulo, String autor, Formato formato, int anyo, int duracion, String actorPrincipal, String actrizPrincipal ){
        Pelicula pelicula = new Pelicula(titulo, autor, formato, anyo, duracion, actorPrincipal, actrizPrincipal);
        multimediaList.add(pelicula);
        return pelicula;
    }
    public Multimedia addVideojuego(String titulo, String autor, Formato formato, int anyo, String plataforma){
        Videojuego videojuego= new Videojuego(titulo, autor, formato, anyo, plataforma);
        multimediaList.add(videojuego);
        return videojuego;
    }
    public Socio addSocio(String nif, String nombre, Date fechaNacimiento, String pobalcion) {
        if (Calculos.calcularEdad(fechaNacimiento) >= 18){
            Socio socio = new Socio(nif, nombre, fechaNacimiento, pobalcion);
            socios.add(socio);
            return socio;
        }
        return null;
    }


}
