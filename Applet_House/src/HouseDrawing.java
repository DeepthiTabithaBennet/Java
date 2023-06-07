/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.awt.*;
import java.applet.*;

// Program to draw a house
public class HouseDrawing extends Applet 
{	
	public void paint(Graphics g) 
	{	
		// Draw the roof
		g.setColor(Color.red);
		int xs[] = {100,160,220};
		int ys[] = {100,50,100};
		Polygon poly=new Polygon(xs,ys,3);
		g.fillPolygon(poly);
		
		// Draw the body of house
		g.setColor(Color.blue);
		g.fillRect(100,100,120,120);
		
		// draw the door
		g.setColor(Color.white);
		g.fillRect(145,160,30,60);
		
		// draw sun
		g.setColor(Color.yellow);
		g.fillOval(240,30,50,50);
		
		//draw chimney
		g.setColor(Color.black);
		g.fillRect(120,55,10,30);
	}
}
