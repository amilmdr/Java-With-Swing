
package Applet;
import java.applet.*;
import java.awt.*;
public class Hello extends Applet  {
   
    
    public void paint(Graphics g ){
        g.setColor(Color.red);
        Font f =new Font("Times New Roman",Font.BOLD,22);
        g.setFont(f);
        g.drawString("Hello World", 10, 60);
    }
    
}
