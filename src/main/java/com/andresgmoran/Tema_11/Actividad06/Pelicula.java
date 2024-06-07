package com.andresgmoran.Tema_11.Actividad06;

public class Pelicula extends Multimedia{
    private final int duracion;
    private final String actorPrincipal;
    private final String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, int anyo, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, anyo);
        this.duracion = duracion;
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + "Pelicula{" +
                "duracion=" + duracion +
                ", actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                '}';
    }
}
