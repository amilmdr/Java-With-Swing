/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet.CG;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author amil
 */
public class Draw3DRectangles extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.green);
        //this will draw a 3-D rectangle of width 50$height 100 at(10,10)
        g.draw3DRect(10, 10, 50,100, true);
        //this will draw a3-D square
        g.draw3DRect(100,100,50,50, true);
        g.setColor(Color.red);
        //this will draw a 3-D rectangle of width 50$height 100 at(10,10)
        g.fill3DRect(10,150,50,100, true);
        g.fill3DRect(100,200,50,50, true);
        
    }
    
}
