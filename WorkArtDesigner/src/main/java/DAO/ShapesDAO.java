/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.ArrayList;
import models.Circle;
import models.Images;
import models.Line;
import models.Square;
import models.Rectangle;

/**
 *
 * @author J&H
 */
public class ShapesDAO {
    ArrayList <Line> lines;
    ArrayList <Circle> circles;
    ArrayList <Square> squares;
    ArrayList <Rectangle> rectangles;
    ArrayList <Images>   imagenes;

    
    
   public ShapesDAO() {
       lines = new ArrayList();
       circles = new ArrayList();
       squares = new ArrayList();
       rectangles = new ArrayList();
       imagenes= new ArrayList();
    }
    
   public void addShape(Circle circle)
   {
       circles.add(circle);
   }
   public void addShape(Images imagen){
       imagenes.add(imagen);
   }
  
   public void addShape(Line line)
   {
       lines.add(line);
   }
   public void addShape(Rectangle rectangle)
   {
       rectangles.add(rectangle);
   }
      
   public void addShape(Square square){
     squares.add(square);
   }
  

    public ArrayList<Line> getLines() {
        return lines;
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public ArrayList<Rectangle> getRectangle() {
        return rectangles;
    }
    
    public ArrayList<Images> getImagenes() {
        return imagenes;
    }
   
   
}
