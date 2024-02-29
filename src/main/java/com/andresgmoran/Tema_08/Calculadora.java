package com.andresgmoran.Tema_08;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculator");

        int width = 500;
        int height = 500;
        int x,y;

        Toolkit herramienta = Toolkit.getDefaultToolkit();
        Dimension dimension =Toolkit.getDefaultToolkit().getScreenSize();

        x = (int)(dimension.getWidth()/2f) - Math.round(width/2f);
        y = (int)(dimension.getHeight()/2f) - Math.round(height/2f);

        String [] simbols = new String[]
                {"CE" , "C" , "%" , "x",
                        "(" , ")" , "MOD" , "/",
                        "7" , "8" , "9" , "*",
                        "4" , "5" , "6" , "-",
                        "1" , "2" , "3" , "+",
                        "+/-" , "0" , "." , "="};

        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(6,4);
        panel.setLayout(gridLayout);
        for (String simbol : simbols) {
            JButton button = new JButton(simbol);
            button.setBackground(Color.black);
            button.setForeground(Color.white);
            panel.add(button);
        }

        ventana.setContentPane(panel);
        ventana.setBounds(x,y,width,height);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
