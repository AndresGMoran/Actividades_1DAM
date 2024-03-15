package com.andresgmoran.Tema_08.Actividad05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    private JFrame frame;
    private JLabel intentosLabel;
    private JTextField cajaTexto;
    private JButton button;
    private Juego juego;

    public UI() {
        juego = new Juego();
        setupUI();
    }

    private void setupUI() {
        //Creamos la ventana
        frame = new JFrame("Adivina el numero!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setLayout(null);

        //Creamos el mensaje de intentos
        intentosLabel = new JLabel("Attempts remaining: " + juego.numIntentos);
        intentosLabel.setBounds(20, 20, 250, 25);
        frame.add(intentosLabel);

        //Creamos la caja de texto.
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 50, 350, 35);
        frame.add(cajaTexto);

        button = new JButton("Adivinar");
        button.setBounds(20,100,250,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(cajaTexto.getText().trim());
                int result = juego.intentoAdivinar(guess);
                switch (result){
                    case -1:
                        JOptionPane.showMessageDialog(frame, "Perdio");
                        boolean opcion = opcionNuevoJuego();
                        if (opcion) {
                            juego.crearNuevoJuego();
                            actualizarNumIntentos();
                        }
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(frame, "Gano");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(frame, "Vulva a adivinar");
                        actualizarNumIntentos();
                }
            }
        });
        frame.add(button);


        frame.setVisible(true);
    }
    private void actualizarNumIntentos(){
        intentosLabel.setText("Intentos restantes: " + juego.numIntentos);
    }
    private boolean opcionNuevoJuego(){
        int opcion = JOptionPane.showConfirmDialog(frame, "¿Te gustaría volver a jugar?", "Nuevo juego",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return opcion == JOptionPane.YES_OPTION;
    }
}
