/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet.CG;
import java.applet.*;
import java.awt.*;
import java.io.*;

public class DDA extends Applet{
    public void paint(Graphics g){     
        double dx,dy,steps,x,y,k;
        double xc,yc;
        double x1=200,y1=500,x2=600,y2=200;
        dx=x2-x1;
        dy=y2-y1;
        if(Math.abs(dx)>Math.abs(dy))
        {
            steps=Math.abs(dx);
            
        }
        else{
            steps=Math.abs(dy);
        }
            xc=(dx/steps);
            yc=(dy/steps);
            x=x1;
            y=y1;
            g.fillOval(200,500, 5, 5);
            for(k=1;k<=steps;k++){
                x=x+xc;
                y=y+yc;
                g.fillOval((int)x, (int)y, 5, 5);
                
            }
        }
    }
    
