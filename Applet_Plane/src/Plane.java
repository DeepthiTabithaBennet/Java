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
public class Plane extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    public void paint(Graphics g){
        
        //top wing
        int xt[] = {250, 400, 550}; 
        int yt[] = {120, 120, 40}; 
        int numberofpoints = 3; 
  
        Polygon pt = new Polygon(xt, yt, numberofpoints); 
        g.setColor(Color.blue); 
        g.fillPolygon(pt);
        
        
        //body
        g.setColor(Color.red);
        g.fillRect(150, 100, 500, 100);
        g.fillOval(100, 99, 140, 100);
        g.fillOval(70, 130, 150, 70);
        
        
        //side wing
        int xs[] = {270, 390, 620}; 
        int ys[] = {160, 160, 250}; 
  
        Polygon ps = new Polygon(xs, ys, numberofpoints); 
        g.setColor(Color.blue); 
        g.fillPolygon(ps);
        
        
        //tail area
        int xr[] = {700, 600, 700}; 
        int yr[] = {30, 160, 150}; 
  
        Polygon pr = new Polygon(xr, yr, numberofpoints); 
        g.setColor(Color.blue); 
        g.fillPolygon(pr);
        
        g.setColor(Color.red);
        g.fillOval(600, 100, 100, 100);
        
        
        //windows
        g.setColor(Color.blue);
        g.fillOval(250, 120, 30, 30);
        g.fillOval(300, 120, 30, 30);
        g.fillOval(350, 120, 30, 30);
        g.fillOval(400, 120, 30, 30);
        g.fillOval(450, 120, 30, 30);
        g.fillOval(500, 120, 30, 30);
        g.fillOval(550, 120, 30, 30);
        
    }
            
    // TODO overwrite start(), stop() and destroy() methods
}
