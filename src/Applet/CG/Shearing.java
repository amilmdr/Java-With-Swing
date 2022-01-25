/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet.CG;
import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;
import sun.java2d.loops.DrawLine;
class Surface3 extends JPanel {
     private void doDrawing(Graphics g){
        Graphics2D g2d=(Graphics2D)g.create();
        AffineTransform tx1=new AffineTransform();
        tx1.translate(50,90);
        g2d.setTransform(tx1);
        g2d.setPaint(Color.green);
        g2d.drawRect(0,0,160,50);
         AffineTransform tx2=new AffineTransform();
         tx2.translate(50,90);
          tx2.shear(0,2);
           g2d.setTransform(tx2);
         g2d.setPaint(Color.blue);
        g2d.draw(new Rectangle(0,0,80,50));
         AffineTransform tx3=new AffineTransform();
         tx3.translate(130,22);
        tx3.shear(0,1);
        g2d.setTransform(tx3);
        g2d.setPaint(Color.red);
        g2d.draw(new Rectangle( 0,0,80,50));
        g2d.dispose(); 
    }
      public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
    }
}
public class Shearing extends JFrame {
    public Shearing(){
        initUI();
    }
private void initUI(){
    add(new Surface3());
    setTitle("Shearing");
    setSize(300,300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[]args){
    Shearing ex=new Shearing();
    ex.setVisible(true);
}
}