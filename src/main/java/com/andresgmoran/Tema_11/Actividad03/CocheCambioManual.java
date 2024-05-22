package com.andresgmoran.Tema_11.Actividad03;

public class CocheCambioManual extends Coche{
    public CocheCambioManual(String matricula, int numMarchas) {
        super(matricula, numMarchas);
    }

    @Override
    public void acelerar(int velocidad) {
        setVelocidadActual(getVelocidadActual() + velocidad);
    }

    @Override
    public void frenar(int velocidadAFrenar) {
        setVelocidadActual(getVelocidadActual() - velocidadAFrenar);
    }

    @Override
    public void cambiarMarcha(int marcha) {
        setMarchaActual(marcha);
    }

}
