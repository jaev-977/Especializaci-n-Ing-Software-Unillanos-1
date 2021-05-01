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
public class Square extends Shape {
    int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side, Point start, Color color) {
        super(start, color);
        this.side = side;
    }
    Point end1;
     public Square(Point start, Color color,Point end) {
        super(start, color);
        this.end1=end;
    }

    public Point getEnd() {
        return end1;
    }

    public void setEnd(Point end) {
        this.end1 = end;
    }

    
   
    
}
