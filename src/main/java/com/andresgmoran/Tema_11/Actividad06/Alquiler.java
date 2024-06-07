package com.andresgmoran.Tema_11.Actividad06;

import com.andresgmoran.Lib.Calculos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Alquiler {
    public static final int DIAS_LIMITE = 3;
    public static final int PRECIO_BASE = 4;
    public static final int REBAJA_ANTIGUEDAD = 1;
    public static final int RECARGA_POR_RETRASO =2;

    private final Multimedia multimedia;
    private final Socio socio;
    private final LocalDate fechaInicio;
    private final LocalDate fechaDevolucion;
    private final double precioFinal;

    public Alquiler(Multimedia multimedia, Socio socio) {
        this.multimedia = multimedia;
        this.socio = socio;
        this.fechaInicio = LocalDate.now();
        this.fechaDevolucion = LocalDate.now().plusDays(DIAS_LIMITE);
        this.precioFinal = 0;
    }
    private int calcularRecargo(){
        long recargo = 0;
        long diasRetraso = ChronoUnit.DAYS.between(LocalDate.now(), fechaDevolucion);
        if (diasRetraso > 0){
            recargo = diasRetraso * RECARGA_POR_RETRASO;
            return (int) recargo;
        }
        return 0;
    }
    public double calcularPrecioFinal(){
        double precio = PRECIO_BASE;
        int anyo = multimedia.getAnyo();

        if (multimedia instanceof Pelicula && anyo < 2012) {
            precio -= REBAJA_ANTIGUEDAD;
        } else if (multimedia instanceof Videojuego && anyo < 2010) {
            precio -= REBAJA_ANTIGUEDAD;
        }
        return precio + calcularRecargo();
    }
}
