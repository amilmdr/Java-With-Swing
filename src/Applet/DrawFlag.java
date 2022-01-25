
package Applet;

import java.applet.*;
import java.awt.*;


public class DrawFlag extends Applet{
     public void paint(Graphics g ){
            Graphics2D g2d=(Graphics2D)g;
         g2d.setColor(Color.red);
         
         Polygon p= new Polygon();
       p.addPoint(10,10);
        p.addPoint(200,200);
         p.addPoint(10,200);
         p.addPoint(200,400);
          p.addPoint(10,400);
          p.addPoint(10,600);
        
         g.drawPolygon(p);
         
         
         
         
     }
}