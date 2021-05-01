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
public class Rectangle extends Shape {
    int base;
    Point end;

    public Rectangle(int base, Point start, Color color) {
        super(start, color);
        this.base = base;
        
    }

    public Rectangle(Point end, Point start, Color color) {
        super(start, color);
        this.end = end;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

   

  
    
}
