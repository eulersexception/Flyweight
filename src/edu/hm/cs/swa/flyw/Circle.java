package edu.hm.cs.swa.flyw;

import java.awt.*;

public class Circle implements Shape {

    private int x;
    private int y;
    private int radius;
    private java.awt.Color color;

    public Circle(java.awt.Color color) {
        this.color = color;
    }

    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}

    public void setRadius(int radius) {this.radius = radius;}

    public java.awt.Color getColor() {return color;}

    @Override
    public void draw(Graphics g) {

    }
}
