package com.andresgmoran.Tema_08.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {
    private final Calculadora calculadora;
    private final ActionListener actionDigito;
    // private final ActionListener actionPunto;
    private final ActionListener actionOperador;
    /*
    private final ActionListener actionIgual;
    private final ActionListener actionON;
    private final ActionListener actionOFF;
    private final ActionListener actionAC;

     */
    public CalculadoraController() {
        calculadora = new Calculadora();
        actionDigito = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton boton = getBoton(e);
                calculadora.addDigito(boton.getText());
            }
        };

        actionOperador = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton boton = getBoton(e);
                // calculadora.addOperador(boton.getText());
            }
        };
    }

    private JButton getBoton(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            return (JButton) e.getSource();
        }
        return null;
    }

    public ActionListener getActionDigito() {
        return actionDigito;
    }
}
