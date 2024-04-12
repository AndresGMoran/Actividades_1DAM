package com.andresgmoran.Tema_08.Canvas;

import java.awt.*;

public class GameOfLife {
    private final int width;
    private final int height;
    private final int cellSize;
    private int[][] world; //Matriz actual
    private int[][] newWorld; //Matriz futuro
    private boolean cellStatus;

    public GameOfLife(int width, int height, int cellSize) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
        world = new int[height][width];
        newWorld = new int[height][width];
        cellStatus = true;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getCellSize() {
        return cellSize;
    }
    public void update(){

    }
    public void draw(Graphics2D g2){
        g2.setColor(Color.WHITE);
        for (int i = 0; i < width;i+=cellSize){
            g2.drawLine(0, i, width, i);
        }
        for (int j = 0; j < height;j+=cellSize){
            g2.drawLine(j,0,j,height);
        }
    }
}
