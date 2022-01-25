
package Applet;
import java.applet.*;
import java.awt.*;
public class DrawShape  extends Applet{
     public void paint(Graphics g ){
        // two draw line (x,y.x1,y1)
     //   g.drawLine(10, 10, 200, 10);
      //  g.drawLine(10, 10, 10, 200);
      
        Graphics2D g2d=(Graphics2D)g;
        g2d.setStroke(new BasicStroke(5));
        //to draw rectangle
       // g.drawLine(10, 10, 200, 10);
       // g.drawLine(10, 10, 10, 200);
      
        g.drawRect(10, 10,200,100);
        g.drawString("Tribhuvan University", 60, 60);
      
       
       //to  draw cvel
      // g.drawOval(10, 10,200, 100);
       //to  draw circle
       //g.fillOval(10, 10,100, 100);
       //two draw arc
       //g.fillArc(10, 10,200, 100, 0,180);
       //to draw polygon
       Polygon p= new Polygon();
       p.addPoint(100,10);
        p.addPoint(10,100);
         p.addPoint(200,100);
         g.drawPolygon(p);
       
               }
}
