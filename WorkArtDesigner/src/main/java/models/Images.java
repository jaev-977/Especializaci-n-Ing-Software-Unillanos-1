/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

/**
 *
 * @author J&H
 */
public class Images  {
    
    Image labelImagen;
    Dimension fondopanel;

    public Images(Image labelImagen, Dimension fondopanel) {
        this.labelImagen = labelImagen;
        this.fondopanel = fondopanel;
    }

    

    public Dimension getFondopanel() {
        return fondopanel=new Dimension(900,900);
    }

    public void setFondopanel(Dimension fondopanel) {
        this.fondopanel = fondopanel;
    }
    

  

    public Image getLabelImagen() {
        return labelImagen;
    }

    public void setLabelImagen(Image labelImagen) {
        this.labelImagen = labelImagen;
    }

    

    

    

}
