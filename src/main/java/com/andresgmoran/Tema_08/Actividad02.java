package com.andresgmoran.Tema_08;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;

public class Actividad02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola swing");
        frame.setSize(800,600);

        JLabel label = new JLabel("Bienevenidos al mundo de las interfaces graficas");

        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
