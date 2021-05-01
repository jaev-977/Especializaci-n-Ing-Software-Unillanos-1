/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import models.Circle;
import models.Line;
import DAO.ShapesDAO;
import java.awt.Color;
import models.Point;
import models.Square;
import models.Rectangle;
import views.MainWindow;
import models.Images;
/**
 *
 * @author J&H
 */
public class MarkerController {
    ShapesDAO shapes;
    
    MainWindow mainwindow;

    public MarkerController() {
        shapes=new ShapesDAO();
//        labelImagen=new ShapesDAO();
        mainwindow= new MainWindow(shapes);
        mainwindow.setPanel();
    }
    
    public void start(){
        mainwindow.setVisible(true);
    }
    
}
