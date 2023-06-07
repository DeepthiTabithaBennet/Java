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
public class DisplayImage extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Image pic;
    public void init() {
        // TODO start asynchronous download of heavy resources
        pic = getImage(getDocumentBase(), "students.jpg");
    }
    public void paint(Graphics g){
        g.drawImage(pic, 10, 10, 300, 200, this);   
    }
    // TODO overwrite start(), stop() and destroy() methods
}
