import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BackgroundColor2 implements ActionListener{
    JFrame f1;
    JButton b1,b2,b3;
    JPanel p1;
     BackgroundColor2 (){
     f1=new JFrame();
     f1.setSize(300,300);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new BorderLayout());
       p1 =new JPanel();
        b1=new JButton("RED");
      b1.addActionListener(this);
      p1.add(b1);
      b2=new JButton("GREEN");
      b2.addActionListener(this);
            p1.add(b2);
      b3=new JButton("BLUE");
      b3.addActionListener(this);  
            p1.add(b3);
            f1.add(p1);
            f1.setVisible(true);
   } 
     public static void main(String[] args) {
        new BackgroundColor2();
    }
       public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
           p1.setBackground(Color.red);
          // b2.setBackground(Color.red);
          // b3.setBackground(Color.red);
        }
        else if (e.getSource()==b2){
          //  b1.setBackground(Color.green);
           p1.setBackground(Color.green);
          // b3.setBackground(Color.green);
        }
        else{
         //    b1.setBackground(Color.blue);
         //  b2.setBackground(Color.blue);
           p1.setBackground(Color.blue);
        }
    }
}