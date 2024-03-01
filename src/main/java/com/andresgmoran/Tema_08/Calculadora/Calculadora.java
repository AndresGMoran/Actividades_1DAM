package com.andresgmoran.Tema_08.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public enum Accion{
        DIGITO, PUNTO, OPERADOR,IGUAL, ON, OFF, AC
    }
    public Calculadora(int width, int height) {
        Boton[][] textButtons = {
                {new Boton("ON", Boton.Action.ON),new Boton("OFF", Boton.Action.ON),new Boton("%", Boton.Action.OPERADOR),new Boton("/", Boton.Action.OPERADOR)},
                {new Boton("7", Boton.Action.DIGITO), new Boton("8", Boton.Action.DIGITO), new Boton("9", Boton.Action.DIGITO), new Boton("*", Boton.Action.OPERADOR)},
                {new Boton("4", Boton.Action.DIGITO), new Boton("5", Boton.Action.DIGITO), new Boton("6", Boton.Action.DIGITO), new Boton("-", Boton.Action.OPERADOR)},
                {new Boton("1", Boton.Action.DIGITO), new Boton("2", Boton.Action.DIGITO), new Boton("3", Boton.Action.DIGITO), new Boton("-", Boton.Action.OPERADOR)},
                {new Boton("0", Boton.Action.DIGITO), new Boton(".", Boton.Action.PUNTO), new Boton("AC", Boton.Action.AC), new Boton("=", Boton.Action.IGUAL)},
        };
        /*Accion[][] accionsButtons = {
                {Accion.ON, Accion.OFF, Accion.OPERADOR, Accion.OPERADOR},
                {"7", "8", "9", "*"},
                {"4", "5", "6", "-"},
                {"1", "2", "3", "+"},
                {"0", ".", "AC", "="},
        };*/
        //Ventana
        JButton[] buttons = new JButton[textButtons.length * textButtons[0].length];
        JFrame ventana1 = new JFrame("CALCULADORA");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        long x = Math.round(dimension.getWidth() / 2) - width / 2;
        long y = Math.round(dimension.getHeight() / 2) - height / 2;
        //Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        //Panel display Calculadora
        JPanel panelCalculadora = new JPanel();
        GridLayout gridLayoutCalculadora = new GridLayout(5, 4);
        panelCalculadora.setLayout(gridLayoutCalculadora);
        JLabel labelCalculadora = new JLabel("Introduce un numero");
        panelCalculadora.add(labelCalculadora);
        panelCalculadora.setBackground(Color.GREEN);

        //Panel botones
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se a pulsado el boton");
            }
        };
        JPanel panelBotones = new JPanel();
        GridLayout gridLayoutBoton = new GridLayout(5, 4);
        panelBotones.setLayout(gridLayoutBoton);
        for (int i = 0; i < textButtons.length; i++) { // Bucle el qual va a recorrer las filas de la matriz
            for (int j = 0; j < textButtons[i].length; j++) {// Bucle el qual va a recorrer las columnas de la matriz
                JButton boton = new JButton("" + textButtons[i][j]);// Creacion de un nuevo objeto = boton el qual le pasaremos las filas y columnas de la matriz
                buttons[i * textButtons[0].length + j] = boton;//
                boton.addActionListener(actionListener);
                panelBotones.add(boton);// Agrega el boton creado al panelBotones
            }
        }
        panelPrincipal.add(panelCalculadora);
        panelPrincipal.add(panelBotones);
        ventana1.setContentPane(panelPrincipal);
        ventana1.pack();
        ventana1.setVisible(true);
    }
}
