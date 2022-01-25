/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet.CG;
import java.awt.geom.AffineTransform;
import java.awt.*;
import javax.swing.*;
import sun.java2d.loops.DrawLine;
class Surface2 extends JPanel {
    
    private void doDrawing(Graphics g){
        Graphics2D g2d=(Graphics2D)g.create();
        g2d.setPaint(new Color(150,150,150));
        g2d.fillRect(20, 20, 80, 50);
        AffineTransform tx1=new AffineTransform();
        tx1.translate(110,22);
        tx1.scale(0.5,0.5);
        g2d.setTransform(tx1);
        g2d.fillRect(20,20,80,50);
         AffineTransform tx2=new AffineTransform();
         tx2.translate(170,22);
        tx2.scale(1.5,1.5);
         g2d.setTransform(tx2);
        g2d.fillRect(20,20,80,50);
        g2d.dispose();
        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
    }
}
public class Scaling extends JFrame {
    public Scaling(){
        initUI();
}
private void initUI(){
    add(new Surface2());
    setTitle("Scaling");
    setSize(300,200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[]args){
    Scaling ex=new Scaling();
    ex.setVisible(true);
}
    
}
