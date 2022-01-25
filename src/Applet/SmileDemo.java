
package Applet;
import java.awt.*;
import java.applet.*;
public class SmileDemo extends Applet{
     public void paint(Graphics g ){
            Graphics2D g2d=(Graphics2D)g;
         g2d.setColor(Color.red);
    g.drawOval(10, 10,300, 300);
    g.fillOval(50, 60,60, 60);
    g.fillOval(200, 60,60, 60);
    g.drawLine(160, 100, 160,200 );
    g.fillArc(110, 170, 100, 100, 180,180);
     }
}
