package com.andresgmoran.Tema_08.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador {
    private Funcionamiento funcionamiento;
    //private final ActionListener actionPunto;
    private final ActionListener actionDigito;
    //private final ActionListener actionOperador;
    //private final ActionListener actionON;
    //private final ActionListener actionON;
    //private final ActionListener actionOFF;
    //private final ActionListener actionAC;

    public CalculadoraControlador(){
        funcionamiento = new Funcionamiento();
        actionDigito = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton){
                    JButton boton = (JButton) e.getSource();
                    funcionamiento.addDigito(boton.getText());
                }
            }
        };
    }

    public ActionListener getActionDigito() {
        return actionDigito;
    }
}
