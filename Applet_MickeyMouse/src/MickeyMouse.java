/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author admin
 */
public class MickeyMouse extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
        
        //face outline
        g.setColor(Color.black);
        g.fillOval(90, 80, 120, 120);
        
        g.setColor(Color.orange);
        g.fillOval(105, 100, 50, 100);
        g.setColor(Color.orange);
        g.fillOval(145, 100, 50, 100);
        
        //cheeks
        g.setColor(Color.orange);
        g.fillOval(90, 130, 120, 70);
        
        //chin
        g.setColor(Color.orange);
        g.fillOval(130, 160, 40, 50);
        
        //ears
        g.setColor(Color.black);
        g.fillOval(60, 40, 70, 70);
        g.fillOval(170, 40, 70, 70);
        
        //eyes
        g.setColor(Color.white);
        g.fillOval(125, 110, 20, 40);
        g.fillOval(155, 110, 20, 40);
        
        g.setColor(Color.black);
        g.fillOval(125, 120, 10, 20);
        g.fillOval(155, 120, 10, 20);
        
        //mouth
        g.setColor(Color.black);
        g.fillOval(125, 165, 50, 30);
        
        g.setColor(Color.pink);
        g.fillOval(130, 170, 40, 20);
        
        //snout
        g.setColor(Color.orange);
        g.fillOval(125, 150, 50, 30);
        
        //nose
        g.setColor(Color.black);
        g.fillOval(140, 150, 20, 10);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
