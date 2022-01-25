
package Applet.CG;
import java.applet.*;
import java.awt.*;
import java.io.*;
public class MidPointCircle extends Applet{
     public void paint(Graphics g){    
         int r=150;
         int p=(5/4)-r;
         int x=0;
         int y=r;
         do{
             g.setColor(Color.red);
             g.drawLine(y+200, x+200,y+200, x+200);
             g.drawLine(x+200, y+200,x+200, y+200);
             g.drawLine(x+200, -y+200,x+200, -y+200);
             g.drawLine(y+200, -x+200,y+200, -x+200);
             g.drawLine(-y+200, -x+200,-y+200, -x+200);
             g.drawLine(-x+200,-y+200,-x+200,-y+200);
             g.drawLine(-x+200, y+200,-x+200, y+200);
             g.drawLine(-y+200, x+200,-y+200,x+200);
             if(p<0){
                 p=p+2*x+3;
                 
         }
             else{
             p=p+2*(x-y)+5;
             y=y-1;
         }
             x=x+1;
             
         }
         while(x<y);
         
         }
}
 
