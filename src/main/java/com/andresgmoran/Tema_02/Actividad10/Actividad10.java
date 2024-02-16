package com.andresgmoran.Tema_02.Actividad10;

public class Actividad10 {
    private enum Meses{
        ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE
    }
    private enum NotasMusicales{
        DO,RE,MI,FA,SOL,LA,SI
    }
    private enum NotasAlumnos{
        SUPENDIDO,SUFICIENTE,BIEN,EXCELENTE,SOBRESALIENTE
    }

    public static void main(String[] args) {
        System.out.println("Estamos en " + Meses.JUNIO);
        System.out.println("La nota más alta es: " + NotasMusicales.SI);
        System.out.println("Menos de un 5 es: " + NotasAlumnos.SUPENDIDO);
    }
}
