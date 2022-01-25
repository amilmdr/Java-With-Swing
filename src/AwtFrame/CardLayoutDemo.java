package AwtFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutDemo  implements ActionListener{
    JFrame f1;
    CardLayout c;
    JButton b1,b2,b3,b4,b5,b6;
    JPanel p1,p2,p3;
    CardLayoutDemo(){
     f1=new JFrame();
     f1.setSize(300,300); 
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f1.setLayout(new FlowLayout());
    c=new CardLayout();
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    p1.setLayout(c);
    b1=new JButton("First");
    b1.addActionListener(this);
    b2=new JButton("next");
    b2.addActionListener(this);
    b3=new JButton("one");
    b4=new JButton("two");
    b5=new JButton("three");
    b6=new JButton("Four");
   f1.add(b1);
   f1.add(b2);
   p2.add(b3); p2.add(b4);p3.add(b5);p3.add(b6);
    f1.add(p1);
    p1.add(p2,"one1");
    p1.add(p3,"two1");
   f1.setVisible(true);
    } 
    public static void main(String[] args) {
     new CardLayoutDemo();   
    }@Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1){
           c.show(p1,"one1");
       }
       else{
           c.show(p1,"two1");
       }
    }
}