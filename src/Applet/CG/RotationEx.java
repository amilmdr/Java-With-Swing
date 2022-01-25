/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet.CG;
import java.awt.*;
import javax.swing.*;
import sun.java2d.loops.DrawLine;

class Surface1 extends JPanel {
    
    private void doDrawing(Graphics g){
        Graphics2D g2d=(Graphics2D)g.create();
        g2d.setPaint(new Color(150,150,150));
        g2d.fillRect(20, 20, 80, 50);
        g2d.translate(180,-50);
        g2d.rotate(Math.PI/4);
        g2d.fillRect(80,80,80,50);
        g2d.dispose();
        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
    }
    
}
public class RotationEx extends JFrame{
    public RotationEx(){
        initUI();
    }
    private void initUI(){
        add(new Surface1());
        setSize(300,300);
        setTitle("Rotation");   
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args)
    {
       RotationEx ex=new RotationEx();
       ex.setVisible(true);
    }
}