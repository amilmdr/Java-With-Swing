
package Applet;
import java.applet.*;
import java.awt.*;
public class CubeDemo extends Applet {
    
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.red);
        g.drawRect(60,60, 200, 200);
          g.drawRect(10,80, 200, 200);
          g.drawLine(60, 62, 10, 80);
           g.drawLine(260,60 ,210 ,80 );
            g.drawLine(60,260 ,10 ,280 );
            g.drawLine(260,260,210 ,280);
            g.drawOval(80, 80, 50,50);

    }
    
}
