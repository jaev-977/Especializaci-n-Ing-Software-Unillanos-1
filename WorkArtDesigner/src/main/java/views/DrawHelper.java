/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import DAO.ShapesDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import models.Circle;
import models.Images;
import models.Line;
import models.Rectangle;
import models.Square;

/**
 *
 * @author J&H
 */
public class DrawHelper {
    Graphics graphics;

    public DrawHelper(Graphics graphics) {
        this.graphics = graphics;
    }
    public void draw(ShapesDAO shapes){
        for (Circle circle : shapes.getCircles()) {
         graphics.setColor(circle.getColor());
         graphics.fillOval(circle.getStart().getX(), circle.getStart().getY(), circle.getRadius()*2, circle.getRadius()*2);
       }
       for (Line line : shapes.getLines()) {
         graphics.setColor(line.getColor());
         graphics.drawLine(line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(),line.getEnd().getY());
       }
       for (Square square: shapes.getSquares()){
           graphics.setColor(square.getColor());
           graphics.fillRect(square.getStart().getX(), square.getStart().getY(), square.getSide()*2, square.getSide()*2);
       }
       for (Rectangle rectangle: shapes.getRectangle()){
           graphics.setColor(rectangle.getColor());
           graphics.fillRect(rectangle.getStart().getX(),rectangle.getStart().getY(), rectangle.getBase()*2 , rectangle.getBase()/2);
       }
       for(Images imagen: shapes.getImagenes()){
           graphics.drawImage(imagen.getLabelImagen(), 0, 0,1000 , 1000, null);
       }
      
           }
    
}
