package com.andresgmoran.Tema_08;

import javax.swing.*;
import java.awt.*;

public class Actividad03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola swing");
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setLocation(20,20);

        JLabel label = new JLabel("Bienevenidos al mundo de las interfaces graficas");
        JPanel panel = new JPanel();
        panel.add(label);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
