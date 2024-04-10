package com.andresgmoran;

import com.andresgmoran.Lib.ArraysLib;
import com.andresgmoran.Lib.ConsoleMenuLib;
import com.andresgmoran.Lib.IOLib;
import com.andresgmoran.Tema_07.Actividad07.Pacient;
import com.andresgmoran.Tema_07.AnexoPila.Actividad05.NotacionPolacaInversa;
import com.andresgmoran.Tema_07.AnexoPila.Actividad08.GenericDynamicArray;
import com.andresgmoran.Tema_07.AnexoPila.Pila;
import com.andresgmoran.Tema_08.Actividad05.UI;
import com.andresgmoran.Tema_08.Canvas.Game;
import com.andresgmoran.Tema_08.Cesar.Cesar;
import com.andresgmoran.Tema_08.Descifrar.Encriptacion;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Game of life");

        Game game = new Game(1280,960,60);
        frame.add(game);
        frame.pack();
        frame.setVisible(true);
        game.start();
    }
}