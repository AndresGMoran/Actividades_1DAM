package com.andresgmoran.Tema_11.Actividad03;

public class CocheCambioAutomatico extends Coche {
    public CocheCambioAutomatico(String matricula, int numMarchas) {
        super(matricula, numMarchas);
    }

    @Override
    public void acelerar(int velocidad) {
        setVelocidadActual(getVelocidadActual() + velocidad);
        cambioAutomatico();
    }

    @Override
    public void frenar(int velocidadAFrenar) {
        setVelocidadActual(getVelocidadActual() - velocidadAFrenar);
        cambioAutomatico();
    }

    /**
     * Metodo para cambiar las marchas automaticamente dependiendo de la velocidad
     */
    private void cambioAutomatico(){
        if (getVelocidadActual() > 0 && getVelocidadActual() <= 10) {
            setMarchaActual(1);
        } else if (getVelocidadActual() > 10 && getVelocidadActual() <= 40) {
            setMarchaActual(2);
        } else if (getVelocidadActual() > 40 && getVelocidadActual() <= 60) {
            setMarchaActual(3);
        } else if (getVelocidadActual() > 60 && getVelocidadActual() <= 80) {
            setMarchaActual(4);
        }
        if (getMarchas().length > 5){
            if (getVelocidadActual() > 80 && getVelocidadActual() <= 120) {
                setMarchaActual(5);
            } else if (getVelocidadActual() > 120) {
                setMarchaActual(6);
            }
        } else{
            if (getVelocidadActual() > 80){
                setMarchaActual(5);
            }
        }
    }
    @Override
    public void cambiarMarcha(int marcha) {
    }
}
