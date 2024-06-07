package com.andresgmoran.Tema_11.Actividad06;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private int anyo;

    public Multimedia(String titulo, String autor, Formato formato, int anyo) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.anyo = anyo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multimedia that = (Multimedia) o;
        return titulo.equals(that.titulo) && autor.equals(that.autor);
    }

    @Override
    public int hashCode() {
        int result = titulo.hashCode();
        result = 31 * result + autor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", anyo=" + anyo +
                '}';
    }
}
