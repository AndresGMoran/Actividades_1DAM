package com.andresgmoran.Tema_08.Calculadora;

public class Boton {
    enum Action{
        DIGITO, PUNTO, OPERADOR,IGUAL, ON, OFF, AC
    }
    private String texto;
    private Action action;

    public Boton(String texto, Action action) {
        this.texto = texto;
        this.action = action;
    }
}
