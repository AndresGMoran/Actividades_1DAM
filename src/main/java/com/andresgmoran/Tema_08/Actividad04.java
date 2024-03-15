package com.andresgmoran.Tema_08;

import javax.swing.*;
import java.awt.*;

public class Actividad04 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aficiones");
        frame.setSize(1024,768);
        frame.setLayout(null);
        frame.setLocation(20,20);

        String[] aficiones = new String[]{
                "1. Programar","2. Deprimirme","3. Jugar para relajarme","4. Estresarme al jugar","5. Dormir"};

        Font[] fuentes = new Font[]{
                new Font("fuente1",Font.PLAIN,22),
                new Font("fuente2",Font.ITALIC,22),
                new Font("fuente3",Font.BOLD,22),
                new Font("fuente4",Font.TRUETYPE_FONT,22),
                new Font("fuente5",Font.TYPE1_FONT,22),
        };
        Color[] colores = new Color[]{
                Color.ORANGE,
                Color.RED,
                Color.BLACK,
                Color.GREEN,
                Color.YELLOW,
        };

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i  = 0;i < aficiones.length;i++){
            JLabel label = new JLabel(aficiones[i]);
            label.setFont(fuentes[i]);
            label.setForeground(colores[i]);
            panel.add(label);
        }

        frame.setContentPane(panel);
        frame.setVisible(true);

    }
}
