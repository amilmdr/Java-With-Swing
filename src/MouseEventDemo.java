import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseEventDemo implements MouseListener {
     JFrame f1;
    JPanel p1,p2;
    JLabel l1;
MouseEventDemo(){
     f1=new JFrame();
     p1=new JPanel();
     p1.addMouseListener(this);
     p2=new JPanel();
     l1=new JLabel("Status");
     p2.add(l1);
       f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new BorderLayout());
       f1.add(p1, BorderLayout.CENTER);
       f1.add(p2, BorderLayout.SOUTH);
       f1.setVisible(true);
}
    public static void main(String[] args) {
        new MouseEventDemo();
    }
    public void mouseEntered(MouseEvent e){
        p1.setBackground(Color.red);
    }
    public void mouseExited(MouseEvent e){
        p1.setBackground(Color.blue);
    }
     public void mousePressed(MouseEvent e){
        l1.setText("MOUSE pressed");
    }
     public void mouseReleased(MouseEvent e){
        l1.setText("MOUSE Released");
    }
     public void mouseClicked(MouseEvent e){
        l1.setText("MOUSE clicked"+e.getX()+e.getY());
    }
   
}
