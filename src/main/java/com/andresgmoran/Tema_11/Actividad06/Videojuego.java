package com.andresgmoran.Tema_11.Actividad06;

public class Videojuego extends Multimedia{
    private final String plataforma;

    public Videojuego(String titulo, String autor, Formato formato, int anyo, String plataforma) {
        super(titulo, autor, formato, anyo);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + "Videojuego{" +
                "plataforma='" + plataforma + '\'' +
                '}';
    }
}
