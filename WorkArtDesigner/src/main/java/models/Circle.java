/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Color;

/**
 *
 * @author J&H
 */
public class Circle extends Shape {
    int radius;

    public Circle(int radius, Point start, Color color) {
        super(start, color);
        this.radius = radius;
    }

    

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
        
    
    
}
