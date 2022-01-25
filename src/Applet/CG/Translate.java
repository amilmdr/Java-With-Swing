
package Applet.CG;
import java.awt.*;
import javax.swing.*;
class Surface extends JPanel
{
    private void doDrawing(Graphics g){
        
            Graphics2D g2D=(Graphics2D) g.create();
            g2D.setPaint(new Color(255,0,0));
            g2D.fillRect(20,20,80,50);
            g2D.translate(150,50);
            g2D.fillRect(20,20,80,50);
            g2D.dispose();
            
        
       
        
        
    }
     public void paintComponent(Graphics g){
            super.paintComponent(g);
            doDrawing(g);
}
}

public class Translate extends JFrame {
    public Translate(){
        initUI();
    }
private void initUI(){
    add(new Surface());
    setTitle("Translation");
    setSize(300,200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[]args){
    Translate ex=new Translate();
    ex.setVisible(true);
}
  
    
}
