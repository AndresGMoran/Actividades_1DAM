package com.andresgmoran.Tema_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Pruebas {
    public static void main(String[] args) {
        JFrame ventana1 = new JFrame("Hola GUI");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        int width = 500;
        int height = 500;
        int x = (int) (dimension.getWidth() / 2f) - Math.round(width / 2f);
        int y = (int) (dimension.getHeight() / 2f) - Math.round(height / 2f);

        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(5,5);
        panel.setLayout(gridLayout);


        for (int i = 1; i <= 5*5; i++){
            JButton button = new JButton("Boton" + i);
            button.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Se a pulsado el boton" + button.getText());
                }
            });
            panel.add(button);
        }
        ventana1.setContentPane(panel);
        ventana1.setBounds(x,y,width,height);
        ventana1.setVisible(true);

        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
