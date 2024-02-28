package com.andresgmoran.Tema_08;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        int width = 500;
        int height = 500;
        int x = (int) (dimension.getWidth() / 2f) - Math.round(width / 2f);
        int y = (int) (dimension.getHeight() / 2f) - Math.round(height / 2f);

        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(5,4);
        panel.setLayout(gridLayout);

        for (int i = 1; i <= 5*4;i++){
            JButton button = new JButton("" + i);
            panel.add(button);
        }
        ventana.setContentPane(panel);
        ventana.setBounds(x,y,width,height);
        ventana.setVisible(true);
    }
}
