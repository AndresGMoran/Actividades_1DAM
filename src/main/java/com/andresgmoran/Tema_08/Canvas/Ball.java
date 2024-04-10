package com.andresgmoran.Tema_08.Canvas;

import java.awt.*;

public class Ball {
    private float x;
    private float y;
    private final float size;
    private float speedX;
    private float speedY;
    private final Color color;
    private final float worldWidth;
    private final float worldHeight;

    public Ball(float x, float y, float size, float speed, Color color, float worldWidth, float worldHeight) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speedX = speed;
        this.speedY = speed;
        this.color = color;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSize() {
        return size;
    }

    public float getSpeedX() {
        return speedX;
    }
    public float getSpeedY() {
        return speedY;
    }
    public void update(){
        if (x + speedX >= worldWidth - size || x + speedX <= 0) {
            speedX += speedX *0.2;
            speedX *= -1;
        }
        this.x += speedX;
        if (y + speedY >= worldHeight - size || y + speedY <= 0) {
            speedY += speedY *0.2;
            speedY *= -1;
        }
        this.y += speedY;

    }
    public void draw(Graphics2D g2){
        int s = Math.round(size);
        g2.setColor(color);
        g2.fillOval(Math.round(x), Math.round(y),s,s);
    }
}
