/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;

/**
 *
 * @author admin
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    AudioClip a;
    public void init() {
        // TODO start asynchronous download of heavy resources
        a = getAudioClip(getCodeBase(), "alarm.wav");
        a.play();
    }
        public void paint(Graphics g){
            g.drawString("Audio is Playing", 100, 100);
        }
    

    // TODO overwrite start(), stop() and destroy() methods
}
